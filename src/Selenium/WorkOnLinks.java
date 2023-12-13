package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkOnLinks {
    public static void main(String[] args){

        // Open a browser and go to google homepage
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.india.gov.in/");
        // to type in search and check driver.findElement(By.name("q")).sendKeys("Moon"+ Keys.ENTER);
        // click link
       driver.findElement(By.linkText("Birth Certificate")).click();
        // toi give link text name small or short -  we can use partial link text
        //driver.findElement(By.partialLinkText("Birth")).click();


    }
}
