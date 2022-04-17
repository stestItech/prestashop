package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTests {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.manage().window().maximize();
        driver.get("http://prestashop.qatestlab.com.ua/en/");
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

}
