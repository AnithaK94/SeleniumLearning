package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class WorkWithImages {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.leafground.com/file.xhtml");
        // CLICK THE IMAGE IT GOES TO HOME PAGE
        WebElement imageClick = driver.findElement(By.id("j_idt13"));
        imageClick.click();
        //BACK TO THE PAGE
        driver.navigate().back();
        //CHECK FOR BTOKEN IMAGE
        WebElement imageBroke = driver.findElement(By.id("j_idt13"));
        if(imageBroke.getAttribute("naturalWidth").equals(null)){
            System.out.println("The image is broken");
        }else{
            System.out.println("The image is not Broken");
        }
        //UPLOAD AN IMAGE
        WebElement uploadImageButton = driver.findElement(By.xpath("//*[@id=\'j_idt97:j_idt98\']/div[1]/span"));
        Thread.sleep(4000);

        StringSelection imagefile = new StringSelection("C:\\Users\\kanna\\OneDrive\\Pictures\\image");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagefile,null);

        Actions builder = new Actions(driver);
        builder.click(uploadImageButton).release().build().perform();

        Robot rbt = new Robot();
        rbt.delay(4000);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        rbt.delay(4000);
        System.out.println("The image is uploaded Successfully");
        WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\'j_idt97:j_idt98\']/div[1]/button[1]"));
        uploadButton.click();
        Thread.sleep(2000);
        // CLOSE THE DRIVER
        driver.quit();

    }
}
// navigate().to = do get function

