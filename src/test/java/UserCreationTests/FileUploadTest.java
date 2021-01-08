package UserCreationTests;

import org.junit.Test;

/** Tests scenarios in which user should be created */
public class FileUploadTest extends BaseClass {

  /** Tries to create user with repeated name and email */
  @Test
  public void verifyFileUpload() {
    workSpace = loginPage.userLogin(EMAIL, VALIDPASSWORD);
    //        workSpace.uploadFile();
  }
}
