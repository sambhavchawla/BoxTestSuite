package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

  protected WebDriver driver;

  protected void waitForElementDisplay(WebElement element) {
    (new WebDriverWait(driver, 10))
        .until(
            new ExpectedCondition<Boolean>() {
              public Boolean apply(WebDriver d) {
                return element.isDisplayed();
              }
            });
  }
}
