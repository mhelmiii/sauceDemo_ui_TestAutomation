package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPages {
    private WebDriver driver;

    //locators
    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("login-button");

    //constructor
    public loginPages(WebDriver driver) {
        this.driver = driver;
    }

    //actions
    public void inputUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public homePage loginAs(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickLogin();
        return new homePage(driver);
    }
}
