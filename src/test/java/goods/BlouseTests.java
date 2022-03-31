package goods;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Header;

public class BlouseTests extends BaseTests {

    @Test
    public void addBlouseItemToBasket() {
        var login = homePage.clickSignInLink();
        login.setLoginEmailAddressField("stest.siarhei@outlook.com");
        login.setPasswordField("Test123");
        var myAccount = login.clickSignInButton();
        Header header = new Header(driver);
    }
}
