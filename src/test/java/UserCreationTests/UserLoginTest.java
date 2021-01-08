package UserCreationTests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserLoginTest extends BaseClass {

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
