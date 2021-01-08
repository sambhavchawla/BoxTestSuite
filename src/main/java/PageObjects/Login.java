package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class Login extends BaseClass {

  @FindBy(id = "login-email")
  private WebElement loginTxtBox;

  @FindBy(id = "login-submit")
  private WebElement loginSubmitBtn;

  @FindBy(id = "password-login")
  private WebElement passwordTxtBox;

  @FindBy(id = "login-submit-password")
  private WebElement passwordSubmitBtn;

  @FindBy(xpath = "//div[@class='login-container']/h1")
  private WebElement loginPageHeader;

  public Login(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public WorkSpace userLogin(String username, String password) {
    loginTxtBox.sendKeys(username);
    loginSubmitBtn.click();
    waitForElementDisplay(passwordTxtBox);
    passwordTxtBox.sendKeys(password);
    passwordSubmitBtn.click();
    return PageFactory.initElements(driver, WorkSpace.class);
  }

  public void verifyOnLoginPage() {
    // Sign in text is separate on login and logout page that's why boolean condition ignoring cases
    assertTrue(
        "Not on login page", loginPageHeader.getText().equalsIgnoreCase("Sign in to your account"));
  }
}
