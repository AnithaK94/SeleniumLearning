import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkWithAlerts {
    public static void main(String[] args){
        //Open the browser and get the desired Homepage
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/alert");
        // Accept the Alert
        WebElement simpleAlertBox = driver.findElement(By.id("accept"));
        simpleAlertBox.click();

        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

      // Dismiss the Confirm Alert & print the alert text
        WebElement confirmAlertBox = driver.findElement(By.id("confirm"));
        confirmAlertBox.click();

        Alert confirmAlert = driver.switchTo().alert();
        String alertValue = confirmAlert.getText();
        confirmAlert.dismiss();
        System.out.println("The text inside Confirm Alert Box is : " +alertValue);

        //Type your name & accept
        WebElement promptAlertBox = driver.findElement(By.id("prompt"));
        promptAlertBox.click();

        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Anil");
        promptAlert.accept();
        // can do dismiss in promptAlert

        //sweet Alert
        WebElement sweetAlertBox = driver.findElement(By.id("modern"));
        sweetAlertBox.click();
        WebElement modernAlertClose = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button"));
        modernAlertClose.click();
    }
}
/* Alert - 3 Types:
1. Simple Alert - ok
2. Confirm Alert - ok - cancel
3. Prompt Alert - Text Edit - OK - Canncel.

Special Cases:
1. There is no alert - sweet / modern alert are webelement - they should be handled as such.
2. window alert -It is not alert - authentication.

There are 2 Exception:
1. UnHandledAlert Exception - if try to work without handling the present alert
2. NoAlertException - if we handle alert without any alert. */
