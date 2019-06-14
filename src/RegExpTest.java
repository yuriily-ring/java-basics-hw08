import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegExpTest {

  /**
   * Test data.
   *
   * @return test data array
   */
  @DataProvider(name = "text")
  public static Object[][] text() {
    return new Object[][]{
        {"8.8.8.8", "8.8.8.8"},
        {"http://192.168.1.1/index.html", "192.168.1.1"},
        {"http://254.254.254.254/index.html", "254.254.254.254"},
        {"http://-1.-2.-3.-4/index.html", ""},
        {"300.300.300.300", ""}
        // TODO add 2 more test data here
    };
  }

  @Test(dataProvider = "text")
  public void testSumArray(String text, String expectedResult) {
    String actualResult = RegExp.getIpAddress(text);

    assertEquals(actualResult, expectedResult, "IP address is not correct");
  }
}