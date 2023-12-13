package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkWithCheckBoxes {
    public static void main(String[] args){
        //Open the Browser and go the required page
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/radio");
        //Find if the checkbox is selected?
        WebElement rememberMeSelect = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
        boolean status = rememberMeSelect.isSelected();
        System.out.println("If Remember Me checkbox is selected ?  : " +status);
        //select the checkbox -Accept the T&C
        WebElement agreeCheckBox = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]"));
        agreeCheckBox.click();
        // To de-select the selected Checkbox
        WebElement rememberMeDeSelect = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
         if(rememberMeDeSelect.isSelected()){
             rememberMeDeSelect.click();
         }
         //Go to the desired page
        driver.get("https://www.leafground.com/checkbox.xhtml");
         WebElement countrySelectCheckBox = driver.findElement(By.id("j_idt87:multiple"));
         countrySelectCheckBox.click();
         driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[1]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[2]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[4]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[6]/div/div[2]")).click();


        // close the window and chrome driver
       //driver.quit();
    }
}

/* 1. Look alike dropdown boxes. if we use select then it shows
        UnexpectedTagNameException: Element should have been "select" but was "div"
   2. While running - ad came -
        ElementClickInterceptedException: element click intercepted: Element*/