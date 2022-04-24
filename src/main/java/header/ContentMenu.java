package header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.CataloguePage;

public class ContentMenu {

    private WebDriver driver;
    private By womenMenuLink = By.xpath("//a[text()='Women']");

    public ContentMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverWomenMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(womenMenuLink)).perform();

    }

    public CataloguePage clickSubmenuLink(String linkTitle) {
        driver.findElement(By.linkText(linkTitle)).click();
        return new CataloguePage(driver);
    }
}
