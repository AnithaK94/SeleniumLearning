package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WorkWithWindowsHandle {
    public static void main1(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/windows");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String home = driver.getWindowHandle();
        System.out.println("The Parent Tab: " + driver.getCurrentUrl());
        // Click on home Button
        WebElement gotoHomeBtn = driver.findElement(By.id("home"));
        gotoHomeBtn.click();
        // Set the overall webpages opened
        Set<String> openedtabs = driver.getWindowHandles();
        //To get desired page, save the control in List since set does not have get() function
        List<String> listOpendTabs = new ArrayList<>(openedtabs);
        //Go to the newly opened tab
        driver.switchTo().window(listOpendTabs.get(1));
        System.out.println("The opened page is: " + driver.getCurrentUrl());

        //Print the title of the page
        List<WebElement> labels = driver.findElements(By.tagName("h1"));
        WebElement firstElement = labels.get(0);
        System.out.println("The Title of the newly Opened Page is : " + firstElement.getText());

        //Close the parent window
        driver.switchTo().window(home);
        driver.close();
        //Close the child window
        driver.quit();
    }

    public static void main(String[] args) {

        // Task 2 -Open muiltple windows
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/windows");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // Click on multiple windows button
        WebElement multipleWindowsBtn = driver.findElement(By.id("multi"));
        multipleWindowsBtn.click(); // open page 1
        multipleWindowsBtn.click(); // open page 2

        //Print all the window title
        WebElement homeTitle = driver.findElement(By.tagName("h1"));
        System.out.println("The Title of the Main Page is : " +homeTitle.getText());
        Set<String> handles =  driver.getWindowHandles();
        //To get desired page, save the control in List since set does not have get() function
        List<String> listMultiOpenedTabs = new ArrayList<>(handles);
        //Go to the newly opened tab
        driver.switchTo().window(listMultiOpenedTabs.get(1));
        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println("The Title of the opened page 1 is: " +title.getText() +"  URL is: " +driver.getCurrentUrl() );

        driver.switchTo().window(listMultiOpenedTabs.get(2));
        WebElement hTitle = driver.findElement(By.tagName("h1"));
        System.out.println("The Title of the opened page 2 is: "  +hTitle.getText() +"  URL is: "  +driver.getCurrentUrl() );

        // close all window Tabs
        driver.quit();
    }
    }
