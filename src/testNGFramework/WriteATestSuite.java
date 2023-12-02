package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WriteATestSuite {
    // Aim: Open chrome and go to
    //1. google.co.in. 2. bing.com 3.yahoo.com
    // Task - 2 Find time taken for each TestCase
    // Task - 3 Reduce the time Taken by the Test Case
    WebDriver driver;
    long startTime;
    long endTime;
    @BeforeSuite // Run this methode before all TestCases
    public void launchBrowser(){
        startTime = System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void  openGoogle(){
        driver.get("https://www.google.co.in/");
    }
    @Test
    public void openBing(){
        driver.get("https://www.bing.com/?cc=in");
    }
    @Test
    public void openYahoo(){
        driver.get("https://in.search.yahoo.com/?fr2=inr");
    }
    @AfterSuite // Run this methode after all TestCases
    public void closeBrowser(){
        driver.quit();
        endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total Time taken : " +totalTime);
    }

}
