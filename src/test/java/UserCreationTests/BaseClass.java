package UserCreationTests;

import Driver.Driver;
import Driver.SeleniumDriver;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.WorkSpace;
import Property.PropertyReader;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseClass {

  protected WebDriver driver;

  protected String URL = PropertyReader.getProperty("host.name");

  protected Login loginPage;
  protected WorkSpace workSpace;

  protected HomePage homePage;
  protected String EMAIL = "samtauras1990@gmail.com";
  protected String VALIDPASSWORD = "Swordfish@123";

  @Before
  public void setup() {
    driver = SeleniumDriver.getWebDriver(Driver.CHROME);
    driver.get(URL);
    homePage = new HomePage(driver);
    loginPage = homePage.navigateToLoginLink();
  }

  @After
  public void cleanUp() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }
}
