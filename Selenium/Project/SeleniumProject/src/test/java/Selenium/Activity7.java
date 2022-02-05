package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 {

    WebDriver driver;
    List<WebElement> courses;
    int numberOfCourses;

    @BeforeMethod
    public void beforeMethod()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002FT2744\\Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkNumberOfCourses()
    {
        WebElement navigationBar = driver.findElement(By.xpath("//nav[@id='site-navigation']"));
        WebElement allCourses = driver.findElement(By.xpath("//div/ul/li/a[contains(text(),'All Courses')]"));

        if(navigationBar.isDisplayed() && allCourses.isDisplayed())
        {
            Reporter.log("The navigation bar and All Courses menu item is present");
            allCourses.click();
        }
        else {
            Reporter.log("The navigation bar and My Account menu item is not present");
        }

        courses = driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div[@class='ld_course_grid col-sm-8 col-md-4 ']"));
        numberOfCourses = courses.size();
        Reporter.log("The number of courses present in All Courses are : " +numberOfCourses);

    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
