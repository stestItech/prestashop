package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddAddress {

    private WebDriver driver;
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By companyField = By.id("company");
    private By address1Field = By.id("address1");
    private By address2Field = By.id("address2");
    private By postCodeField = By.id("postcode");
    private By cityField = By.id("city");
    private By countryDropDown = By.id("id_country");
    private By homePhoneField = By.id("phone");
    private By mobilePhoneFiled = By.id("phone_mobile");
    private By stateDropDown = By.id("id_state");
    private By addressTitleField = By.id("alias");
    private By saveButton = By.xpath("//span[contains(text(),'Save')]");

    public AddAddress(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setCompany(String companyName) {
        driver.findElement(companyField).sendKeys(companyName);
    }

    public void setAddress1(String address1) {
        driver.findElement(address1Field).sendKeys(address1);
    }

    public void setAddress2(String address2) {
        driver.findElement(address2Field).sendKeys(address2);
    }

    public void setPostCode(String postCode) {
        driver.findElement(postCodeField).sendKeys(postCode);
    }

    public void setCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void selectCountry(int number) {
        Select s = new Select(driver.findElement(countryDropDown));
        s.selectByIndex(number - 1);
    }

    public void setHomePhone(String homePhone) {
        driver.findElement(homePhoneField).sendKeys(homePhone);
    }

    public void setMobilePhone(String mobilePhone) {
        driver.findElement(mobilePhoneFiled).sendKeys(mobilePhone);
    }

    public void selectState(int number) {
        Select s = new Select(driver.findElement(stateDropDown));
        s.selectByIndex(number - 1);
    }

    public void setAddressTitle(String addressTitle) {
        driver.findElement(addressTitleField).sendKeys(addressTitle);
    }

    public Address clickSave() {
        driver.findElement(saveButton).click();
        return new Address(driver);
    }

    public boolean isAddAddressPageOpened() {
        return driver.findElement(firstNameField).isDisplayed();
    }
}
