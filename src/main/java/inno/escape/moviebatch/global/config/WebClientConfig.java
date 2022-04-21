package inno.escape.moviebatch.global.config;

import inno.escape.moviebatch.global.Constants.KOBIS;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.LoggingCodecSupport;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

@Configuration
@Slf4j
public class WebClientConfig {

  @Bean("webClient")
  public WebClient webClient() {

    HttpClient client = HttpClient.create()
        .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000)
        .doOnConnected(connection -> connection
            .addHandlerFirst(new ReadTimeoutHandler(10, TimeUnit.SECONDS))
            .addHandlerFirst(new WriteTimeoutHandler(10)));

    ExchangeStrategies exchangeStrategies = ExchangeStrategies.builder()
        .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(1024 * 1024 * 50))
        .build();
    exchangeStrategies
        .messageWriters().stream()
        .filter(LoggingCodecSupport.class::isInstance)
        .forEach(writer -> ((LoggingCodecSupport) writer).setEnableLoggingRequestDetails(true));

    return WebClient.builder()
        .baseUrl(
            KOBIS.SCHEME.getValue() + "://" + KOBIS.HOST.getValue() + KOBIS.BASE_PATH.getValue())
        .clientConnector(new ReactorClientHttpConnector(client))
        .exchangeStrategies(exchangeStrategies)
        .filter(ExchangeFilterFunction.ofRequestProcessor(
            clientRequest -> {
              log.debug("Request: {} {}", clientRequest.method(), clientRequest.url());
              clientRequest.headers().forEach(
                  (name, values) -> values.forEach(value -> log.debug("{} : {}", name, value)));
              return Mono.just(clientRequest);
            }
        ))
        .filter(ExchangeFilterFunction.ofResponseProcessor(
            clientResponse -> {
              clientResponse.headers().asHttpHeaders().forEach(
                  (name, values) -> values.forEach(value -> log.debug("{} : {}", name, value)));
              return Mono.just(clientResponse);
            }
        ))
        .defaultHeader("user-agent",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.87 Safari/537.3")
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .build();
  }
}