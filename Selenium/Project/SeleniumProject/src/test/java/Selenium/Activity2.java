package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

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
    public void checkWebsiteHeading()
    {
        String heading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();

        Assert.assertEquals("Learn from Industry Experts", heading);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
