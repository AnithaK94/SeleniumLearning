import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class WorkWithUploadFiles {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/file");

        WebElement uploadButton = driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[1]/div/div/label/span/span[2]"));
        uploadButton.click();
       // uploadButton.sendKeys("\'C:\\Users\\kanna\\Downloads\\sample.xlsx\'");

       String file = "\'C:\\Users\\kanna\\Downloads\\sample.xlsx\'" ;
       StringSelection selectFile = new StringSelection(file); // data transferrable

        // copy contents operation in windows - java operation
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectFile,null);
        System.out.println("Getting the File Location.....");
        // paste operations - For windows actions use Robot Class
        Robot robotAction = new Robot();
        robotAction.keyPress(KeyEvent.VK_CONTROL);
        robotAction.keyPress(KeyEvent.VK_V);
        robotAction.keyRelease(KeyEvent.VK_V);
        robotAction.keyRelease(KeyEvent.VK_CONTROL);
        System.out.println("The File is copied.....");
        // Enter the pasted file
        robotAction.keyPress(KeyEvent.VK_ENTER);
        robotAction.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("The File is Uploaded!!!!");








    }
}
