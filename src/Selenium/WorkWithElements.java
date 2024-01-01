package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkWithElements {
    public static void main(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/elements");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // compulsory implicit wait use = because of many elements load
        //TC 001 - Type and Enter your Git username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("AnithaK94", Keys.ENTER);

        // TC 002 - Assert that user has image

        //Interact with element without finding element
     /*   WebElement activeImage = driver.switchTo().activeElement();
        WebElement section = driver.findElement(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div"));
        WebElement image = driver.findElement(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/app-usercard/div/div/div[1]/div[1]/figure/img"));
        boolean imagePresent = image.isDisplayed();
        Assert.assertTrue(imagePresent,"No Image is Exist");*/

        //TC 003 - Print the user name & other informations

        //Interact with element without finding element

        WebElement activePage = driver.switchTo().activeElement();
        String info = activePage.getText();
        System.out.println("Info: " + info);


        //TC 004 - Assert that no.of public repositories are listed correctly
        //eg. if Public Repos has 10 then in the list 10 links should be available

        // Close the Browser
        driver.quit();
    }
}
