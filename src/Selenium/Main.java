package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
try {
        //select browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
       /* SET PROPERTY SET THE ENVIRONMENT VARIABLE in the local system - It is just a pre-requisite, not mandatory to open a browser.
        If we want. we can set the property manually in the system.*/
        //open browser
        WebDriver webDriver = new ChromeDriver(); // it essential to  launch the browser.
        //open Google HomePage
       // webDriver.get("https:\\www.google.co.in");
        webDriver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjd8KWM-c2CAxVV2DgGHdPIAEoQPAgJ");
        // How to do maxmize??
        //  webDriver.manage().window().maximize();
       /* WebDriver.Options manage =  webDriver.manage();
        WebDriver.Window window = manage.window();
        window.maximize(); // it works based on its return type */
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement frame1 = webDriver.findElement(By.id("google_ads_iframe_/https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjd8KWM-c2CAxVV2DgGHdPIAEoQPAgJ"));
        webDriver.switchTo().frame(frame1);
        WebElement frame2 = webDriver.findElement(By.id("ad_iframe"));
        webDriver.switchTo().frame(frame2);
        webDriver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        webDriver.switchTo().defaultContent();
        // enter a search term
        webDriver.findElement(By.name("q")).sendKeys("Cricket" + Keys.ENTER);
        //webDriver.findElement(By.id("APjFqb")).sendKeys("cricket",Keys.ENTER);
        // To find the number of times Cricket word is repeated in the  current page irrespective of caps or small cases
        List<WebElement> countRepeat = webDriver.findElements(By.xpath("//*[contents(text(),'Cricket') or contents(text(),'cricket']"));
        int count = countRepeat.size();
        System.out.println("The number of times repetitations occured : " + count);

        // to close the web page --> driver.close(); will also closer the application
        webDriver.quit();  //to close the browser and all operations
}catch (Exception e) {
           e.printStackTrace(); }
    }
}