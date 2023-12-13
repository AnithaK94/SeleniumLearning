import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class WorkWithDownloadFiles {
    public static void main(String[] args){
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/file");

        WebElement downloadXlsButton = driver.findElement(By.linkText("Download Excel"));
        downloadXlsButton.click();

        WebElement downloadPdfButton = driver.findElement(By.linkText("Download Pdf"));
        downloadPdfButton.click();

        WebElement downloadTextButton = driver.findElement(By.linkText("Download Text"));
        downloadTextButton.click();

        // Verify the file is download
        System.out.println("Checking files...");
        File fileLocation = new File("C:\\Users\\kanna\\Downloads");
        File[] filesList = fileLocation.listFiles();

        for (File filesCheck :  filesList) {
            if (filesCheck.getName().contains("sample.xlxs")) {
                System.out.println("The Excel File is Downloaded : " + filesCheck.getName());
                //filesCheck.delete();
                break;
            } else if (filesCheck.getName().contains("sample.pdf")) {
                System.out.println("The PDF File is Downloaded : " + filesCheck.getName());
               // filesCheck.delete();
                break;
            } else if (filesCheck.getName().contains("sample.txt")) {
                System.out.println("The Word File is Downloaded : " + filesCheck.getName());
                //filesCheck.delete();
                break;
            }
        }
        System.out.println("Checking completed!!!");

    }
}
