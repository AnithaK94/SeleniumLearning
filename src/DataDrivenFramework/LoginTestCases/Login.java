package DataDrivenFramework.LoginTestCases;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Login {

    String[][] data = null;
    WebDriver driver;
    @DataProvider(name = "LoginData")
    public String[][] loginData() throws BiffException, IOException {
        data=getExcelData();
        return data;
    }
    public String[][] getExcelData() throws IOException, BiffException {
        FileInputStream excel = new FileInputStream("C:\\Users\\kanna\\OneDrive\\Documents\\Testing_Notes\\SampleLoginCredentialDDFFile.xls");
        Workbook workbook = Workbook.getWorkbook(excel);
        Sheet sheet = workbook.getSheet(0); // can give index value or the Sheet name
        int rowCount = sheet.getRows();
        System.out.println("Row Count is :" +rowCount);
        int columnCount = sheet.getColumns();
        System.out.println("Column Count is :" +columnCount);
        // array declaration---> Excel values are taken as Arrays
        String[][] textData = new String[rowCount][columnCount]; // rowcount-1 --> represents header( data must be taken after headers)
        // For Loop
        for(int i =0; i<rowCount; i++){
            for(int j =0; j<columnCount; j++){
                textData[i-0][j] = sheet.getCell(j,i).getContents();
            }
        }
        return textData;
    }
    @BeforeTest
    public void driverCredentials(){
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterTest
    public void driverEnd(){
        driver.quit();
    }
    @Test(dataProvider = "LoginData")
    public void loginCredentials(String username, String password){
        // Go to the Desired Page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement name = driver.findElement(By.id("username"));
        name.sendKeys(username);
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password);
        WebElement loginbtn = driver.findElement(By.id("submit"));
        loginbtn.click();
    }

}
