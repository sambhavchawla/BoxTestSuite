package UserCreationTests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Tests scenarios in which user should not be created and error message should be displayed */
public class UserLoginTest extends BaseClass {

  /** Tries to create user with repeated name and email */
  @Test
  public void loginLogoutTest() {
    loginPage.verifyOnLoginPage();
    workSpace = loginPage.userLogin(EMAIL, VALIDPASSWORD);
    String loggedInEmail = workSpace.getLoggedInEmail();
    assertEquals("Incorrect User login in ", EMAIL, loggedInEmail);
    loginPage = workSpace.logout();
    loginPage.verifyOnLoginPage();
  }
}
