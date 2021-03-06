package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Address {

    private WebDriver driver;
    private By proceedToCheckoutButton = By.xpath("//button/span[contains(text(),'Proceed to checkout')]");

    public Address(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckout() {
        driver.findElement(proceedToCheckoutButton).click();
    }
}
