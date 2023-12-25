package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WorkwithWaits {
    public static void main(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/signin");
        //maximize the browser
        driver.manage().window().maximize();
        /* Options (interface) opt = driver.manage();
        * Window (interface) win = opt.window();
        * win.maximize();
        * It is done by calling nested function --> It is possible due to return method.*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("kannananitha.94@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("Kalel@94");
        driver.quit();
    }
}
/* default time taken to find an element is 500ms.
*If driver takes more time due o functionality such aS ajax OR DATABASE - WE use IMPLICIT CALL
* Implicit Wait is an one time use - use for findElement and findElements
* It will wait only when the element is not found., If it finds the element within the stipulated time, it will continue its work and not wait to complete for the given wait time.
* we can use both implicit and explicit wait.
* Industry standard time - 20 to 30 secs
* TimeUnit is an enum.*/