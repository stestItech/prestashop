package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private By accountCreatedAlert = By.className("alert-success");
    private By welcomeText = By.className("info-account");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAccountCreateConfirmation() {
        return driver.findElement(accountCreatedAlert).getText();
    }

    public String getWelcomeMessageText() {
        return driver.findElement(welcomeText).getText();
    }
}
