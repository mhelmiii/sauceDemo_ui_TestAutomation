package tests;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.homePage;
import pages.loginPages;

import java.time.Duration;

public class TestLogin {

    WebDriver driver;
    loginPages loginPages;


    @BeforeClass
    public void openPlatform() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        loginPages = new loginPages(driver);
    }

    @AfterClass
    public void closePlatform() {
//        driver.quit();
    }

    @Test
    public void testLogin() {
        homePage isHomePage = loginPages.loginAs("standard_user", "secret_sauce");
        Assert.assertTrue(isHomePage.isHomePageDisplayed(), "HomePage tidak ditampilkan setelah login");
    }

//
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Test
//    public void openWeb() {
//        WebElement textLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login_logo")));
//        String actualResult = textLogo.getText();
//        String expectedResult = "Swag Labs";
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//        System.out.println("Success " + "text: " + actualResult);
//    }
//
//    @Test
//    public void testLogin() {
//        WebElement username = driver.findElement(By.id("user-name"));
//        username.sendKeys("standard_user");
//
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("secret_sauce");
//
//        driver.findElement(By.id("login-button")).click();
//    }
}