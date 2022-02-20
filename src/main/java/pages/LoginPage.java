package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailAddressField = By.id("email_create");
    private By createAccountButton = By.id("SubmitCreate");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailAddressField(String emailAddress) {
        driver.findElement(emailAddressField).sendKeys(emailAddress);
    }

    public CreateAccountPage clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
        return new CreateAccountPage(driver);
    }
}
