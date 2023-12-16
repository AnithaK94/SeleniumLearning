package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkOnDriverNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/buttons");
        String url = driver.getCurrentUrl();
        System.out.println("Button Page URL is: " +url);
        Thread.sleep(3000); // It will make the application to run slow
        driver.findElement(By.id("home")).click();
        String homeUrl = driver.getCurrentUrl();
        System.out.println("Home Page URL is " +homeUrl);

        // to go back to the previous page
        driver.navigate().back();
        System.out.println("Revisiting the Previous Page: " +driver.getCurrentUrl());
        //make driver to move forward
        driver.navigate().forward();
        System.out.println("Revisiting the Forward Page: " +driver.getCurrentUrl());
        //to refresh the page.
        driver.navigate().refresh();
        // to go another URL
        driver.navigate().to("https://letcode.in/elements");
    /* Imp: Difference between get and to
        no major difference to function has get method only.
        Then what is the difference --> To maintain History of web actions happened.
    */
        WebDriver.Navigation nav = driver.navigate();
        nav.forward();
        nav.back();
        nav.refresh();

    }
}
