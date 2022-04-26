package goods;

import base.BaseTests;
import header.CartDropDown;
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
        contentMenu.hoverOverWomenMenu();
        var cataloguePage = contentMenu.clickSubmenuLink("Blouses");

        cataloguePage.hoverOverItem(3).clickAddToCart(3);

        CartDropDown cartDropDown = new CartDropDown(driver);
        //cartDropDown.clickCartDropDown().clickProceedButton();
        cartDropDown.hoverOverCartDropDown();
        cartDropDown.clickCheckoutButton();
    }
}
