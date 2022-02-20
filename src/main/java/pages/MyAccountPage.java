package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private By accountCreatedAlert = By.cssSelector(".alert-success");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAccountCreateConfirmation() {
        return driver.findElement(accountCreatedAlert).getText();
    }
}
