package DataDrivenFramework.LoginTestCases;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataDrivenUsingPOI{
     static List<String> userNameList = new ArrayList<String>();
    static  List<String> passwordList = new ArrayList<String>();


        public void readExcel() throws IOException {
            FileInputStream excel = new FileInputStream("C:\\Users\\kanna\\OneDrive\\Documents\\Testing_Notes\\SampleLoginCredentialDDFFile1.xlsx");
            Workbook workbook = new XSSFWorkbook(excel);
            Sheet sheet = workbook.getSheetAt(0);// at - for index position ; getsheet("name)
            Iterator<Row> rowIterator = sheet.iterator();

            while(rowIterator.hasNext()){
               Row rowValue =  rowIterator.next();

               Iterator<Cell> columnIterator = rowValue.iterator();
               int i=2;
               while (columnIterator.hasNext()){
                   if(i%2==0){
                   userNameList.add(columnIterator.next().getStringCellValue());
                   }else{
                       passwordList.add(columnIterator.next().getStringCellValue());
                   }
               i++;

               }

            }

        }

    public void login(String username, String password){
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement name = driver.findElement(By.id("username"));
        name.sendKeys(username);

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password);

        WebElement loginbtn = driver.findElement(By.id("submit"));
        loginbtn.click();

        driver.quit();
    }
    public void executeTest(){
            for(int i =1; i< userNameList.size();i++){
                login(userNameList.get(i),passwordList.get(i));
            }
    }
    public static void main(String[] args) throws IOException {
        DataDrivenUsingPOI usingPOI = new DataDrivenUsingPOI();
        usingPOI.readExcel();
        System.out.println("UserName List: " +userNameList);
        System.out.println("Password List: " +passwordList);
        usingPOI.executeTest();
    }
}
