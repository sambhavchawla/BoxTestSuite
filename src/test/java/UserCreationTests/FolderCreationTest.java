package UserCreationTests;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FolderCreationTest extends BaseClass {

  /** Tries to create user with repeated name and email */
  @Test
  public void verifyFolderCreation() {
    String folderToBeCreated = "TestFolder";
    workSpace = loginPage.userLogin(EMAIL, VALIDPASSWORD);
    workSpace.createFolder(folderToBeCreated);
    assertTrue(
        "Folder Creation Suite failed!",
        workSpace.getAllCurrentFolders().contains(folderToBeCreated));
  }
}
