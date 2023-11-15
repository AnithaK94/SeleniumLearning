import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkWithTablesTwo {
    public static void main(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/table");
        // select the Table Number 2
        WebElement table = driver.findElement(By.id("simpletable"));
        //To get the number of rows and columns
        List<WebElement> column = table.findElements(By.tagName("th"));
        System.out.println("The number of columns in table 2 is : "+column.size());

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println("The number of rows in table 2 is : "+rows.size());
        //To print the Headers
        for (WebElement headers:column) {
            String headersContext = headers.getText();
            System.out.println("The headers in the Table 2 is : " +headersContext);
        }
        // To get the second column Contents except header
        List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
        for (WebElement firstColumn: allrows) {
            List<WebElement> columnFind = firstColumn.findElements(By.tagName("td"));
            WebElement columnSelect = columnFind.get(1);
            String columncontent = columnSelect.getText();
            System.out.println("The Contents in the First Column is : " +columncontent);
        }
        // Task-->> For the Last name Raj, check the checkbox for him as present.
        int size = allrows.size();
        for(int i =0; i<size; i++){
            List<WebElement> findColumn = allrows.get(i).findElements(By.tagName("td"));
            String contentColumn = findColumn.get(1).getText();
            if (contentColumn.equals("Raj")){
                WebElement inputCheck = findColumn.get(3).findElement(By.tagName("input"));
                inputCheck.click();
                System.out.println("Raj is Present");
                break;
            }
        }
    }
}
