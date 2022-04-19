package inno.escape.moviebackend.global;

public class Constants {

  public enum URL_PATH {
    DAILY("/boxoffice/searchDailyBoxOfficeList.json"),
    WEEKLY("/boxoffice/searchWeeklyBoxOfficeList.json");

    String value;

    URL_PATH(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }

  public enum KOBIS {
    SCHEME("http"),
    HOST("www.kobis.or.kr"),
    BASE_PATH("/kobisopenapi/webservice/rest");

    String value;

    KOBIS(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
