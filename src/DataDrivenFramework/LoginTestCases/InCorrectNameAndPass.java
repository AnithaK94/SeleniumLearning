package DataDrivenFramework.LoginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InCorrectNameAndPass {
    //TC - 003 - Wrong Password - Wrong Username
    @Test
    @Parameters({"username","password"})
    public void loginWithInCorrectNameAndPassword(String username, String password){
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Go to the Desired Page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement name = driver.findElement(By.id("username"));
        name.sendKeys(username);
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password);
        WebElement loginbtn = driver.findElement(By.id("submit"));
        loginbtn.click();
        driver.quit();
    }

}
