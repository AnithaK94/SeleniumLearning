package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;



public class WorkWithAutocomplete {
    public static void main(String[] args) throws InterruptedException {
        //Declare the text
        String textToSelect = "Java";

        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://jqueryui.com/autocomplete/");
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  driver.manage().window().maximize();
        // To switch control to frame
        driver.switchTo().frame(0);
       // Thread.sleep(1000 * 120);
        WebElement textBox = driver.findElement(By.id("tags"));
        textBox.sendKeys("a");

        WebElement autoOptions = driver.findElement(By.xpath("//*[@id='ui-id-1']"));
        List<WebElement> allChildElements = autoOptions.findElements(By.xpath(".//li"));

            // List<WebElement> allChildElements = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
        // to get the size of the list
        System.out.println("The number of items in the options is : " + allChildElements.size());
        //To select "Java" from the options
        for (WebElement option : allChildElements) {
            if (option.getText().equals(textToSelect)) {
                System.out.println("Trying to select: " + textToSelect);
                option.click();
                break;
            }
        }

    }
}
