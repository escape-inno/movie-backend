package inno.escape.moviebackend.global.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class MultiValueMapUtil {

  public static MultiValueMap<String, String> convert(ObjectMapper objectMapper, Object dto) {
    try {
      MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
      Map<String, String> map = objectMapper.convertValue(dto, new TypeReference<>() {
      });
      params.setAll(map);

      return params;
    } catch (IllegalArgumentException e) {
      log.error("Url Parameter 변환중 오류가 발생했습니다. requestDto={}, {}", dto, e.toString());
      throw new IllegalArgumentException("Url Parameter 변환중 오류가 발생했습니다.");
    }
  }
}