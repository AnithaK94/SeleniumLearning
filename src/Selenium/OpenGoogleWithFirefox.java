package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {
    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https:\\www.google.co.in");
        driver.quit();
    }
}
