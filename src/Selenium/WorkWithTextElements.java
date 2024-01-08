package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkWithTextElements {
    public static void main1(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/edit");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Print the last label in the page
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        WebElement lastElement = labels.get(labels.size()-1);
        System.out.println("Last Element : " +lastElement.getText());

        int size = labels.size();
        if(size==6){
            System.out.println("Test Case Passed");
        }else System.out.println("Test Case Failed");

        //To print all the labels in the Web page
        for(WebElement label : labels) {
            String text = label.getText();
            System.out.println(text);
        }

        driver.quit();
    }

    public static void main(String[] args) {
        // either upper or lower case print all the names contains the word
        // "cricket in the web page
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER);
        List<WebElement> crickets = driver.findElements(By.xpath("//*[contains(text(),'cricket')or contains(text(),'Cricket')]"));
        System.out.println(crickets.size());
        driver.quit();
    }
}
