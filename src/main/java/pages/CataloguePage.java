package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CataloguePage {

    private WebDriver driver;
    private By itemImage = By.xpath("//img[@itemprop='image']");
    private By itemsOnPage = By.xpath("//h5[@itemprop='name']/a[@class='product-name']");
    public List<WebElement> items;

    public CataloguePage(WebDriver driver) {
        this.driver = driver;
        items = driver.findElements(itemsOnPage);
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
