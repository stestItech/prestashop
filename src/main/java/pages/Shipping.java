package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shipping {

    private WebDriver driver;
    private By agreeTermsCheckBox = By.xpath("//span/input[@id='cgv']");
    private By proceedToCheckoutButton = By.xpath("//button/span[contains(text(),'Proceed to checkout')]");

    public Shipping(WebDriver driver) {
        this.driver = driver;
    }

    public void SelectAgreeTerms() {
        driver.findElement(agreeTermsCheckBox).click();
    }

    public Payment clickCheckout() {
        driver.findElement(proceedToCheckoutButton).click();
        return new Payment(driver);
    }
}
