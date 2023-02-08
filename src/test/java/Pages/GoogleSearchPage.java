package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

public class GoogleSearchPage {

    WebDriver driver;
    String browser;

    public GoogleSearchPage(WebDriver driver, String browser) {
        this.driver = driver;
        this.browser = browser;
    }

    By searchBox = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
    By acceptGoogleTerms = By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div");
    public void Search(String searchInput) {
        driver.findElement(acceptGoogleTerms).click();
        driver.findElement(searchBox).sendKeys(searchInput);
        driver.findElement(searchBox).sendKeys(Keys.RETURN);
    }

    public void AccessWebshop(){
        By sauceDemoLink;

        switch (this.browser.toLowerCase()){
            case "chrome":
                sauceDemoLink = By.xpath(" //*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3");
                break;
            default:
                 sauceDemoLink = By.xpath("/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/a/h3");

        }
        driver.findElement(sauceDemoLink).click();
    }
}