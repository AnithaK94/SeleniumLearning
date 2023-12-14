package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class WorkWithUploadFiles {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/file");

        WebElement uploadButton = driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[1]/div/div/label/span/span[2]"));
        Thread.sleep(4000);
       // uploadButton.sendKeys("\'C:\\Users\\kanna\\Downloads\\sample.xlsx\'");

       //String file = "C:\\Users\\kanna\\Downloads\\sample.xlsx" ;
       //StringSelection selectFile = new StringSelection(file); // data transferrable
        // copy contents operation in windows - java operation
        StringSelection xlfile = new StringSelection("C:\\Users\\kanna\\Downloads\\sample");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(xlfile,null);

        Actions builder = new Actions(driver);
        builder.click(uploadButton).release().build().perform();
        // paste operations - For windows actions use Robot Class
        Robot rbt = new Robot();
        rbt.delay(4000);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        rbt.delay(4000);
        System.out.println("The File is Uploaded!!!!");

    }
}
