package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
    By searchBtn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
    By sauceDemoLink = By.xpath("/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/a/h3");
    By acceptGoogleTerms = By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div");
    public void Search(String searchInput) {
        driver.findElement(acceptGoogleTerms).click();
        driver.findElement(searchBox).sendKeys(searchInput);
        driver.findElement(searchBtn).click();
    }

    public void AccessWebshop(){
        driver.findElement(sauceDemoLink).click();
    }
}