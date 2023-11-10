import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class WorkWithFiles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/file");

        WebElement downloadXlsButton = driver.findElement(By.linkText("Download Excel"));
        downloadXlsButton.click();
//        Thread.sleep(5000);
        //WebElement downloadPdfButton = driver.findElement(By.linkText("Download Pdf"));
        //downloadPdfButton.click();
        //WebElement downloadTextButton = driver.findElement(By.linkText("Download Text"));
        // downloadTextButton.click();

        // Verify the file is download
        System.out.println("Checking files...");
        File fileLocation = new File("C:\\Users\\kanna\\Downloads");
        File[] filesList = fileLocation.listFiles();
        for (File filesCheck : filesList) {
            if (filesCheck.getName().contains("sample")) {
                System.out.println("The File is Downloaded : " + filesCheck.getName());
                filesCheck.delete();
                break;
            }
        }
        System.out.println("Checking completed.");
        // WebElement uploadButton = driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[1]/div/div/label/span/span[2]"));
        //  uploadButton.click();

    }
}
