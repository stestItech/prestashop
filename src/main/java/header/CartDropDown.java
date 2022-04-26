package header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.ShoppingCartSummary;

public class CartDropDown {

    private WebDriver driver;
    private By cartDropDown = By.xpath("//a[@title='View my shopping cart']");
    private By checkoutButton = By.xpath("//span[contains(text(),'Check out')]");

    public CartDropDown(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverCartDropDown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cartDropDown)).perform();
    }

    public ShoppingCartSummary clickCartDropDown() {
        driver.findElement(cartDropDown).click();
        return  new ShoppingCartSummary(driver);
    }

    public ShoppingCartSummary clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
        return new ShoppingCartSummary(driver);
    }
}
