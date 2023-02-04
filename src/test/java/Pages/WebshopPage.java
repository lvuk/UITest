package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebshopPage {
    WebDriver driver;

    public WebshopPage(WebDriver driver)  {
        this.driver = driver;
    }

    By usernameTextBox = By.id("user-name");
    By passwordTextBox = By.id("password");
    By loginBtn = By.id("login-button");
    public void login(){
        driver.findElement(usernameTextBox).sendKeys("standard_user");
        driver.findElement(passwordTextBox).sendKeys("secret_sauce");
        driver.findElement(loginBtn).click();
    }

    By backpackAddToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLightAddToCartBtn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public void addItemsToCart(){
        driver.findElement(backpackAddToCartBtn).click();
        driver.findElement(bikeLightAddToCartBtn).click();
    }

    By removeBtn = By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]");
    public void removeItemFromCart(){
        driver.findElement(cart).click();
        driver.findElement(removeBtn).click();
    }

    By checkoutButton = By.id("checkout");
    By firstNameTextBox = By.id("first-name");
    By lastNameTextBox = By.id("last-name");
    By zipTextBox = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By backHomeButton = By.id("back-to-products");

    public void finishTheOrder(String firstName, String lastName, String zip){
        driver.findElement(cart).click();

        driver.findElement(checkoutButton).click();

        driver.findElement(firstNameTextBox).sendKeys(firstName);
        driver.findElement(lastNameTextBox).sendKeys(lastName);
        driver.findElement(zipTextBox).sendKeys(zip);

        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
        driver.findElement(backHomeButton).click();

    }

    By hamburgerBtn = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    By logoutBtn = By.xpath("//*[@id=\"logout_sidebar_link\"]");
    public void logout(){
        driver.findElement(hamburgerBtn).click();
        driver.findElement(logoutBtn).click();

    }
}
