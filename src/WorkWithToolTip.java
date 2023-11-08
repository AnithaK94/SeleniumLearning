import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithToolTip {
    public static void main(String[] args){
        //Open the Browser and go to the desired page
        System.getProperty("webdriver.chrome.driver","C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        // iframe - switch control over to the frame
        driver.switchTo().frame(0);

        //Find the textbox to use, hover on it, tooltip will be shown and print the tip given
        WebElement ageTextBox = driver.findElement(By.id("age"));
        String ageTooltip = ageTextBox.getAttribute("Title");
        System.out.println(ageTooltip);

    }
}
