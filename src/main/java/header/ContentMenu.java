package header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.CategoryPage;

public class ContentMenu {

    private WebDriver driver;

    public ContentMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverMenu(String linkTitle) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText(linkTitle)), 0,0).perform();

    }

    public CategoryPage clickLink(String linkTitle) {
        driver.findElement(By.linkText(linkTitle)).click();
        return new CategoryPage(driver);
    }
}
