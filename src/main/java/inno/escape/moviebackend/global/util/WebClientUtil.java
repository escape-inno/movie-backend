package inno.escape.moviebackend.global.util;

import inno.escape.moviebackend.global.config.WebClientConfig;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Component
@Slf4j
public class WebClientUtil {

  private static final WebClientConfig webClientConfig = new WebClientConfig();
  private static final WebClient webClient = webClientConfig.webClient();

  public static WebClient.ResponseSpec getResponseSpec(String path,
      MultiValueMap<String, String> multiValueMap) {

    return webClient.get()
        .uri(uriBuilder -> uriBuilder
            .path(path)
            .queryParams(multiValueMap)
            .build())
        .accept(MediaType.APPLICATION_JSON)
        .retrieve();
  }
}
