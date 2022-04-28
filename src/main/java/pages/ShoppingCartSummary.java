package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummary {

    private WebDriver driver;

    private By proceedToCheckoutButton = By.xpath("//span[text()='Proceed to checkout']");

    public ShoppingCartSummary(WebDriver driver) {
        this.driver = driver;
    }

    public Address clickProceedButton() {

        driver.findElement(proceedToCheckoutButton).click();
        return new Address(driver);
    }
}
