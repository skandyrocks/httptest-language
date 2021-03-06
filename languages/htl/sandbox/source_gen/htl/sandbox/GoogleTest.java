package htl.sandbox;

/*Generated by MPS */

import de.skandy.httpclientexample.HTTPClient;
import de.skandy.httpclientexample.Param;

public class GoogleTest {


  public static String GetGoogle() {
    String url = "http://www.google.de";
    String response = HTTPClient.processGet(url);

    return response;
  }
  public static String GetBing(String param1, String param2) {
    String url = "http://www.bing.com";
    {
      Param[] paramList = {new Param("param1", param1), new Param("param2", param2)};
      url = HTTPClient.buildURL(url, paramList);
    }
    String response = HTTPClient.processGet(url);
    response = HTTPClient.extractString(response, "\\w*", "");

    return response;
  }
  public static String GetYahoo() {
    String url = "http://yahoo.com";
    String response = HTTPClient.processGet(url);
    response = HTTPClient.extractString(response, "yahoo", "");

    return response;
  }

  public static int postToInstagram(String payload) {
    return HTTPClient.processPost("http://requestb.in/185c0671", payload);
  }
  public static int postToTwitter(String payload) {
    return HTTPClient.processPost("http://post.twitter.com", payload);
  }

}
