package inno.escape.moviebatch.global;

public class Constants {

  public enum URL_PATH {
    DAILY("/boxoffice/searchDailyBoxOfficeList.json"),
    WEEKLY("/boxoffice/searchWeeklyBoxOfficeList.json"),
    COMPANY_LIST("/company/searchCompanyList.json"),
    COMPANY_INFO("/company/searchCompanyInfo.json"),
    MOVIE_LIST("/movie/searchMovieList.json"),
    MOVIE_INFO("/movie/searchMovieInfo.json"),
    MOVIE_PEOPLE_LIST("/people/searchPeopleInfoList.json"),
    MOVIE_PEOPLE_INFO("/eople/searchPeopleInfo.json");

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
