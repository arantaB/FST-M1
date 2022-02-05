package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    String pageTitle;

    @BeforeMethod
    public void beforeMethod()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002FT2744\\Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkNavigationToMyAccountTest()
    {
        WebElement navigationBar = driver.findElement(By.xpath("//nav[@id='site-navigation']"));
        WebElement myAccount = driver.findElement(By.xpath("//nav[@id='site-navigation']/div/ul/li/a[contains(text(),'My Account')]"));

        if(navigationBar.isDisplayed() && myAccount.isDisplayed())
        {
            Reporter.log("The navigation bar and My Account menu item is present");
            myAccount.click();
            pageTitle = driver.getTitle().trim();
        }
        else {
            Reporter.log("The navigation bar and My Account menu item is not present");
        }
        Assert.assertEquals("My Account – Alchemy LMS", pageTitle);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
