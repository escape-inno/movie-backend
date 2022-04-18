package inno.escape.moviebackend.global.config;

import inno.escape.moviebackend.global.Constants.KOBIS;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientConfig {

  @Bean("WebClient")
  public WebClient getWebClient() {
    return WebClient.builder()
        .baseUrl(
            KOBIS.SCHEME.getValue() + "://" + KOBIS.HOST.getValue() + KOBIS.BASE_PATH.getValue())
        .defaultHeader(MediaType.APPLICATION_JSON_VALUE)
        .build();
  }
}
