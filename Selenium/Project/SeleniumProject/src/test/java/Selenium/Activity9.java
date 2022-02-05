package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class Activity9 {

    WebDriver driver;
    WebElement navigationBar, allCourses,loginButton,userNameTextBox,passwordTextBox,submitButton,myAccount, course1,
    lessonName, markCompleteButton;
    String username = "root";
    String password = "pa$$w0rd";

    @BeforeMethod
    public void beforeMethod()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002FT2744\\Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void completeLessonTest() throws InterruptedException {
        navigationBar = driver.findElement(By.xpath("//nav[@id='site-navigation']"));
        allCourses = driver.findElement(By.xpath("//div/ul/li/a[contains(text(),'All Courses')]"));

        if(navigationBar.isDisplayed() && allCourses.isDisplayed())
        {
            Reporter.log("The navigation bar and All Courses menu item is present");
            allCourses.click();
        }
        else {
            Reporter.log("The navigation bar and My Account menu item is not present");
        }

        myAccount = driver.findElement(By.xpath("//nav[@id='site-navigation']/div/ul/li/a[contains(text(),'My Account')]"));
        myAccount.click();
        loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginButton.click();

        userNameTextBox = driver.findElement(By.xpath("//input[@id='user_login']"));
        passwordTextBox = driver.findElement(By.xpath("//input[@id='user_pass']"));
        submitButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));

        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        submitButton.click();

        course1 = driver.findElement(By.xpath("//a[span[@class='ld-course-title' and contains(text(),'Social')]]"));
        course1.click();

        lessonName = driver.findElement(By.xpath("//a[div[@class='ld-item-title' and contains(text(),'Strategy')]]"));
        lessonName.click();

        Assert.assertEquals(driver.getTitle(), "Developing Strategy – Alchemy LMS");

        sleep(2000);
        markCompleteButton = driver.findElement(By.xpath("(//form[@class='sfwd-mark-complete']/input[@type='submit'])[2]"));
        markCompleteButton.click();

    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
