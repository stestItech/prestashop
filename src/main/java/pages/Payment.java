package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {

    private WebDriver driver;
    private By noPaymentModulesAlert = By.xpath("//p[text()='No payment modules have been installed.']");

    public Payment(WebDriver driver) {
        this.driver = driver;
    }

    public String getNoPaymentModuleAlertText() {
        return driver.findElement(noPaymentModulesAlert).getText();
    }
}
