package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/** Page Object class for All Users page */
public class HomePage extends BaseClass {
  @FindBy(xpath = "//a[@class='user-nav--login user-nav--item']")
  private WebElement loginLink;

  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  /**
   * Navigates to new user page and returns its object
   *
   * @return
   */
  public Login navigateToLoginLink() {
    loginLink.click();
    return PageFactory.initElements(driver, Login.class);
  }
}
