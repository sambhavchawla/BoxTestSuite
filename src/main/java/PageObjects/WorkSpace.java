package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class WorkSpace extends BaseClass {

  private WebDriver driver;

  @FindBy(xpath = "//span[contains(@class, 'avatar-initials')]")
  private WebElement userInitials;

  @FindBy(linkText = "View Profile")
  private WebElement viewProfileLink;

  @FindBy(linkText = "Log Out")
  private WebElement logoutLink;

  @FindBy(xpath = "//div[@class='profile-details']/dl/dd[3]")
  private WebElement userEmail;

  @FindBy(
      xpath = "//div[@class='quick-create-card-details-content']/span[contains(text(),'Folder')]")
  private WebElement createFolderLink;

  @FindBy(name = "folder-name")
  private WebElement folderNameTxtBox;

  @FindBy(xpath = "//button[@class='btn btn-primary ']//span[contains(text(),'Create')]")
  private WebElement folderCreateBtn;

  @FindBy(xpath = " //div[@class='item-name']/a[@data-resin-target='openfolder']")
  List<WebElement> allFolders;

  @FindBy(xpath = "//span[@class='menu-toggle']//span[contains(text(),'Upload')]")
  private WebElement uploadTransitionLink;

  @FindBy(xpath = "//input[@type='file']")
  private WebElement uploadBtn;

  public WorkSpace(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public String getLoggedInEmail() {
    userInitials.click();
    viewProfileLink.click();
    return userEmail.getText();
  }

  public Login logout() {
    userInitials.click();
    logoutLink.click();
    return PageFactory.initElements(driver, Login.class);
  }

  public void createFolder(String folderName) {
    createFolderLink.click();
    folderNameTxtBox.sendKeys(folderName);
    folderCreateBtn.click();
  }

  public List<String> getAllCurrentFolders() {
    Assert.assertTrue("No Folders present!", allFolders.size() > 0);
    List<String> allFolderNames =
        allFolders.stream().map(WebElement::getText).collect(Collectors.toList());
    return allFolderNames;
  }

  public void uploadFile(String filePath) {
    uploadTransitionLink.click();
    uploadBtn.sendKeys(filePath);
  }
}
