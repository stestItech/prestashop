package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Address {

    private WebDriver driver;
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By companyField = By.id("company");
    private By address1Field = By.id("address1");
    private By address2Field = By.id("address2");
    private By postcodeField = By.id("postcode");
    private By cityField = By.id("city");
    private By countryDropDown = By.id("id_country");
    private By homePhoneField = By.id("phone");
    private By mobilePhoneFiled = By.id("phone_mobile");
    private By addressTitleField = By.id("alias");
    private By saveButton = By.xpath("//span[contains(text(),'Save')]");

    public Address(WebDriver driver) {
        this.driver = driver;
    }
}
