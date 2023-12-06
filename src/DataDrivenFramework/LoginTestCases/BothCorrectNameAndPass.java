package DataDrivenFramework.LoginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothCorrectNameAndPass {
    //TC - 004 - Correct Password And Username
    @Test
    public void loginWithCorrectNameAndPassword(){
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Go to the Desired Page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(" Password123" +
                "");
        WebElement loginbtn = driver.findElement(By.id("submit"));
        loginbtn.click();
        driver.quit();
    }

}
