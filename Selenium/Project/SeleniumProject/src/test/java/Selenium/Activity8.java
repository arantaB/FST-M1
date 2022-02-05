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

import java.util.List;

import static java.lang.Thread.sleep;

public class Activity8 {
    WebDriver driver;
    WebElement contactLink, navigationBar, messageForm, fullNameField, eMailField, subjectField, commentBoxField, submitButton, displayMessage;
    String message;

    @BeforeMethod
    public void beforeMethod()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002FT2744\\Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void contactAdmin() throws InterruptedException {
        navigationBar = driver.findElement(By.xpath("//nav[@id='site-navigation']"));
        contactLink = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));

        if(navigationBar.isDisplayed() && contactLink.isDisplayed())
        {
            Reporter.log("The navigation bar and Contact menu item is present");
            contactLink.click();
        }
        else {
            Reporter.log("The navigation bar and My Account menu item is not present");
        }

        messageForm = driver.findElement(By.xpath("//div[@class='wpforms-field-container']"));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true)", messageForm);

        fullNameField = driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']"));
        fullNameField.sendKeys("Monica Geller");

        eMailField = driver.findElement(By.xpath("//input[@type='email']"));
        eMailField.sendKeys("gellerM1@gmail.com");

        subjectField = driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']"));
        subjectField.sendKeys("Feedback");

        commentBoxField = driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']"));
        commentBoxField.sendKeys("The course helped me improve my skills!");

        submitButton = driver.findElement(By.xpath("//button[@name='wpforms[submit]']"));
        submitButton.click();

        sleep(5000);
        displayMessage = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p"));
        message = displayMessage.getText();
        Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.", message, "The displayed message is wrong!");
        Reporter.log("The message displayed after submitting message is : " + message);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
