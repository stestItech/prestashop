package goods;

import base.BaseTests;
import header.ContentMenu;
import org.testng.annotations.Test;

public class BlouseTests extends BaseTests {

    @Test
    public void addBlouseItemToBasket() {
        var login = homePage.clickSignInLink();
        login.setLoginEmailAddressField("stest.siarhei@outlook.com");
        login.setPasswordField("Test123");
        login.clickSignInButton();

        ContentMenu contentMenu = new ContentMenu(driver);
        contentMenu.hoverOverMenu("Women");
        contentMenu.hoverOverMenu("Blouses");
        contentMenu.clickLink("Blouses");

    }
}
