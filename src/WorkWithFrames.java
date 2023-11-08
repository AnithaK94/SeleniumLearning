import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithFrames {
    public static void main(String[] args){
        //open the Browser and go to the desired page
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/frame");

        //to switch control to frame
        driver.switchTo().frame(0); // can be searched using index.name.id.webelement)
        WebElement fnameTextBoxframe = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input"));
        fnameTextBoxframe.sendKeys("Anitha");

        WebElement lnameTextBoxframe = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input"));
        lnameTextBoxframe.sendKeys("K ");

        // nested frame
        WebElement frameXpath = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
        driver.switchTo().frame(frameXpath);

        WebElement emailTextBoxframe = driver.findElement(By.name("email"));
        emailTextBoxframe.sendKeys("emailanitha");
        // switch to the previous frame
        driver.switchTo().parentFrame(); // go to 1 previous of current frame
        WebElement lnameTextBoxframe1 = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input"));
        lnameTextBoxframe1.sendKeys("annan");
        // switch the control to the main page
        driver.switchTo().defaultContent();
        // close the driver
        driver.quit();

    }
}
