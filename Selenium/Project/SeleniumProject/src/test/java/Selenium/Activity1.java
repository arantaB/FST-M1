package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod()
    {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002FT2744\\Projects\\chromedriver_win32\\chromedriver.exe");

        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkTitle()
    {
        String title = driver.getTitle();

        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }

}
