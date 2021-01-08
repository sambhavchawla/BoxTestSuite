package UserCreationTests;

import Utilities.FileUtils;
import org.junit.Test;

/** Tests scenarios in which user should be created */
public class FileUploadTest extends BaseClass {

  /** Tries to create user with repeated name and email */
  @Test
  public void verifyFileUpload() {
    workSpace = loginPage.userLogin(EMAIL, VALIDPASSWORD);
    workSpace.uploadFile(
        FileUtils.getFileFromTestResource("corona_cat.jpg").toAbsolutePath().toString());
  }
}
