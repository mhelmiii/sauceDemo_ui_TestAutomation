package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;
    private By logoName = By.className("app_logo");

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public String textLogo() {
        return driver.findElement(logoName).getText();
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(logoName).isDisplayed();
    }
}
