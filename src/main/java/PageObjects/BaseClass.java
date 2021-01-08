package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

  protected WebDriver driver;

    @FindBy(className = "user-nav--login user-nav--item")
    private WebElement loginLink;

  protected void waitForElementDisplay(WebElement element) {
    (new WebDriverWait(driver, 10))
        .until(
            new ExpectedCondition<Boolean>() {
              public Boolean apply(WebDriver d) {
                return element.isDisplayed();
              }
            });
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
