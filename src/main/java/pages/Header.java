package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Header {

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverWomenSubmenu() {
        hoverOverMenu("Women");
    }

    public void openWomenSubmenu() {
        hoverOverMenu("Women");
    }

    public BlousesPage clickBlouse() {
        clickLink("Blouses");
        return new BlousesPage(driver);
    }

    private void hoverOverMenu(String linkTitle) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText(linkTitle))).perform();
    }

    private void clickLink(String linkTitle) {
        driver.findElement(By.linkText(linkTitle)).click();
    }
}
