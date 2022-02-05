package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002FT2744\\Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkTitleSecondPopularCourse()
    {
        WebElement titleOfSecondPopularCourse = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true)", titleOfSecondPopularCourse);

        String PopularCourseTitle = titleOfSecondPopularCourse.getText();

        Assert.assertEquals("Email Marketing Strategies", PopularCourseTitle);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
