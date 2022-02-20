package createAccount;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.testng.Assert.assertTrue;

public class CreateAccountTests extends BaseTests {

    @Test
    public void createAccount() {
        var loginPage = homePage.clickSignInLink();
        String uuid = UUID.randomUUID().toString();
        loginPage.setEmailAddressField("stest.siarhei+" + uuid + "@outlook.com");
        System.out.println(uuid);
        var createAccount = loginPage.clickCreateAccountButton();
        createAccount.setFirstName("Siarhei");
        createAccount.setLastName("Filimonau");
        createAccount.setPassword("Test123");
        var myAccount = createAccount.clickRegisterButton();
        assertTrue(myAccount.getAccountCreateConfirmation().contains("Your account has been created"),
        "Alert text is incorrect");
    }

}
