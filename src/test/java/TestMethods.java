import Pages.GoogleSearchPage;
import Pages.WebshopPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestMethods {
    //-------------------Global Variables-----------------------------------
//Declare a Webdriver variable
     WebDriver driver;
    GoogleSearchPage googlePage;
    WebshopPage webshopPage;
    public String URL = "https://www.google.com/";
    //----------------------Test Setup-----------------------------------
    @BeforeClass
    public void setupTest() {
    //Create a new WebManagerDriver
        driver = WebDriverManager.firefoxdriver().create();
        driver.navigate().to(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        googlePage = new GoogleSearchPage(driver);
        webshopPage = new WebshopPage(driver);
    }

    @Test(priority = 0)
    public void SearchOperation() throws InterruptedException{

        googlePage.Search("saucedemo.com");
        Thread.sleep(1000);
        googlePage.AccessWebshop();
    }
    @Test(priority = 1)
    public void VerifyLogin() throws InterruptedException {
        String excpectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = webshopPage.login();
        Assert.assertEquals(excpectedURL, actualURL);

        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void FillTheCart() throws InterruptedException {
        webshopPage.addItemsToCart();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void RemoveOneItemFromCart() throws InterruptedException{

        webshopPage.removeItemFromCart();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void ProceedWithOrder() throws InterruptedException{
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