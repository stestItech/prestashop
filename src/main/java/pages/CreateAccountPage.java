package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private WebDriver driver;
    private By sirRadioButton = By.id("id_gender1");
    private By firstNameField = By.id("customer_firstname");
    private By lastNameField = By.id("customer_lastname");
    private By passwordField = By.id("passwd");
    private By registerButton = By.id("submitAccount");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectGender() {
        driver.findElement(sirRadioButton).click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyAccountPage clickRegisterButton() {
        driver.findElement(registerButton).click();
        return new MyAccountPage(driver);
    }
}
