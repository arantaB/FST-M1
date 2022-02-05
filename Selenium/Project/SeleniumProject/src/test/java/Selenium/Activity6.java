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

public class Activity6 {
    WebDriver driver;
    String pageTitle;
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
    public void checkTitleAndLoginTest()
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

        //Click on Login button in My Account Page and enter credentials
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginButton.click();

        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='user_login']"));
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='user_pass']"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));

        if(userNameTextBox.isDisplayed() && passwordTextBox.isDisplayed())
        {
            Reporter.log("The UserName field and Password field is present");
            userNameTextBox.sendKeys(username);
            passwordTextBox.sendKeys(password);
            submitButton.click();
        }
        else {
            Reporter.log("The UserName field and Password field is not present");
        }

        //Asserting page title after using login credentials
        WebElement profileName = driver.findElement(By.xpath("//li[@id='wp-admin-bar-my-account']/a[span[@class='display-name']]"));
        Assert.assertEquals("Howdy, root", profileName.getText());

    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
