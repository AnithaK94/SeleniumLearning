import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkWithTables {
    public static void main(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/table");
        // To ge the Particular Table in a page that consists of many tables
        WebElement tableChoose = driver.findElement(By.id("shopping"));
        //GET THE NUMBER OF COLUMNS in that particular table
        List<WebElement> headers = tableChoose.findElements(By.tagName("th"));
        System.out.println("The number of columns in the Table is :  " + headers.size());
        // To print the column text
        for (WebElement header: headers) {
         String headerContents = header.getText();
            System.out.println("The Header Contains : " +headerContents);
        }
        //GET THE NUMBER OF ROWS
        List<WebElement> rows = tableChoose.findElements(By.tagName("tr"));
        System.out.println("The number of rows in the Table is :  " + rows.size());

        // To get the rows except the header
        List<WebElement> allrows = tableChoose.findElements(By.cssSelector("tbody tr"));
        //To check 4 rows are there
        int sizeRows = allrows.size();
        if(sizeRows==4){
            System.out.println("There is an exact 4 rows in the table");
        }else {
            System.out.println("No required tables present");
        }
        List<Integer> priceList = new ArrayList<>();
        // To get the first row contents
        for (WebElement columns : allrows) {
            List<WebElement> firstColumn = columns.findElements(By.tagName("td"));
            WebElement firstColumnContent = firstColumn.get(1);
            String columnContents = firstColumnContent.getText();
            System.out.println("The second column in the Table contains : " +columnContents );
        }
        // To sum all the values in the list

        int sum = 0;
        for(int i = 0; i< sizeRows;i++){
            List<WebElement> columns = allrows.get(i).findElements(By.tagName("td"));
            WebElement priceColumn = columns.get(1);
            String priceContents =priceColumn.getText();
             priceList.add(Integer.parseInt(priceContents));
             sum+= priceList.get(i);
        }
        System.out.println("The Total price of the items shopped are : " +sum);
        if(sum == 858){
            System.out.println("The Total obtained is Correct");
        }else
        System.out.println(" The Total obtained is not correct");

    }
}
