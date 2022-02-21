package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By registerEmailAddressField = By.id("email_create");
    private By createAccountButton = By.id("SubmitCreate");
    private By loginEmailAddressField = By.id("email");
    private By passwordField = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setRegisterEmailAddressField(String emailAddress) {
        driver.findElement(registerEmailAddressField).sendKeys(emailAddress);
    }

    public CreateAccountPage clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
        return new CreateAccountPage(driver);
    }

    public void setLoginEmailAddressField(String emailAddress) {
        driver.findElement(loginEmailAddressField).sendKeys(emailAddress);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyAccountPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new MyAccountPage(driver);
    }
}
