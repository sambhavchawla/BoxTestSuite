package UserCreationTests;

import Utilities.FileUtils;
import org.junit.Test;

public class FileUploadTest extends BaseClass {

  @Test
  public void verifyFileUpload() {
    workSpace = loginPage.userLogin(EMAIL, VALIDPASSWORD);
    workSpace.uploadFile(
        FileUtils.getFileFromTestResource("corona_cat.jpg").toAbsolutePath().toString());
  }
}
