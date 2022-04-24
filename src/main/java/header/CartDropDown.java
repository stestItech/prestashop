package header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CartDropDown {

    private WebDriver driver;
    private By cartDropDown = By.xpath("//a[@title='View my shopping cart']");

    public CartDropDown(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverCartDropDown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cartDropDown)).perform();
    }
}
