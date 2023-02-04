import Pages.GoogleSearchPage;
import Pages.WebshopPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestMethods {
    //-------------------Global Variables-----------------------------------
//Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    GoogleSearchPage googlePage;
    WebshopPage webshopPage;
    public String testURL = "https://www.google.com/";
    //----------------------Test Setup-----------------------------------
    @BeforeClass
    public void setupTest() {
//Create a new ChromeDriver
        driver = WebDriverManager.firefoxdriver().create();
//Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }

    @Test(priority = 0)
    public void SearchOperation() throws InterruptedException{
        googlePage = new GoogleSearchPage(driver);
        googlePage.Search("saucedemo.com");
        Thread.sleep(1000);
        googlePage.AccessWebshop();
    }
    @Test(priority = 1)
    public void LoginToWebshop() throws InterruptedException {
        webshopPage = new WebshopPage(driver);
        webshopPage.login();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void FillTheCart() throws InterruptedException {
        webshopPage = new WebshopPage(driver);
//        webshopPage.login();
        webshopPage.addItemsToCart();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void RemoveOneItemFromCart() throws InterruptedException{
        webshopPage = new WebshopPage(driver);

        webshopPage.removeItemFromCart();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void ProceedWithOrder() throws InterruptedException{
        webshopPage = new WebshopPage(driver);

//        webshopPage.login();
//        webshopPage.addItemToCart();
        webshopPage.finishTheOrder("Luka","Vuk", "31000");

        Thread.sleep(2000);
    }
    //---------------Test TearDown-----------------------------------
    @AfterClass
    public void teardownTest() {
//Close browser and end the session
        driver.quit();
    }
}