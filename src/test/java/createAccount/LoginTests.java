package createAccount;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests  extends BaseTests {

    @Test
    public void logIn() {
        var login = homePage.clickSignInLink();
        login.setLoginEmailAddressField("stest.siarhei@outlook.com");
        login.setPasswordField("Test123");
        var myAccount = login.clickSignInButton();
        assertTrue(myAccount.getWelcomeMessageText().contains("Welcome to your account."), "Log in failed");
    }
}
