package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CataloguePage {

    private WebDriver driver;
    private By itemImage = By.xpath("//img[@itemprop='image']");

    public CataloguePage(WebDriver driver) {
        this.driver = driver;
    }

    public ItemHoverBlock hoverOverItem(int imageNumber) {
        Actions actions = new Actions(driver);
        actions.moveToElement((driver.findElements(itemImage)).get(imageNumber - 1)).perform();
        return new ItemHoverBlock();
    }

    public class ItemHoverBlock {

        private By addToCartLink = By.xpath("//span[text()='Add to cart']");

        public void clickAddToCart(int itemNumber) {
            driver.findElements(addToCartLink).get(itemNumber - 1).click();
        }
    }
}
