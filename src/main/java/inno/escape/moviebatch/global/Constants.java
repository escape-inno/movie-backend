package inno.escape.moviebatch.global;

public class Constants {

  public static String KEY = "080e71fbd553e9fc1892ff503a4a9dd2";

  public enum URL_PATH {
    DAILY("/boxoffice/searchDailyBoxOfficeList.json"),
    WEEKLY("/boxoffice/searchWeeklyBoxOfficeList.json"),
    COMPANY_LIST("/company/searchCompanyList.json"),
    COMPANY_INFO("/company/searchCompanyInfo.json"),
    MOVIE_LIST("/movie/searchMovieList.json"),
    MOVIE_INFO("/movie/searchMovieInfo.json"),
    PEOPLE_LIST("/people/searchPeopleList.json"),
    PEOPLE_INFO("/people/searchPeopleInfo.json");

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

  public enum AGE_LIMIT {

  }
}
