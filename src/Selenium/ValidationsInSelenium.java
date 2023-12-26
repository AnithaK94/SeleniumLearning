package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidationsInSelenium {
    public static void main(String[] args) {
        //open browser and go to the required link
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/test");

        //isDisplayed - Check if the element is Visible or rendered
        WebElement login = driver.findElement(By.linkText("Log in"));
        boolean stat = login.isDisplayed();
        System.out.println("If Login is displayed ?  : " +stat);
        // Close the Browser
        driver.quit();

        // isEnabled - Check if the element is Interact-able
        // Open the browser and go the desired site
        WebDriver driver1 = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/radio");
        WebElement mayBeButton = driver1.findElement(By.id("maybe"));
        if (mayBeButton.isEnabled()){
            System.out.println("The last field maybe Button is Enabled");
        }else{
            System.out.println("The last field maybe Button is Disabled");
        }
        // Close the Browser
        driver1.quit();

        // Another Case - if the button is disabled but when check in normal it shows true.. --  it is done using class
        WebDriver drive = DriverUtils.setDriverPathAndGetWebDriver("https://semantic-ui.com/elements/button.html");
        WebElement btn = drive.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[21]"));
        System.out.println("btn is disabled = False but it shows : " +btn.isEnabled());
        String attribute = btn.getAttribute("class");
        System.out.println("Check with attribute:" +attribute.contains("disabled"));
        //Close the driver
        drive.quit();

        //isSelected  - Check is the element is selected - radio  and checkboxes

        //Open the Browser and go the required page
        WebDriver driver2 = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/radio");
        //Find if the checkbox is selected?
        WebElement rememberMeSelect = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
        boolean status = rememberMeSelect.isSelected();
        System.out.println("If Remember Me checkbox is selected ?  : " +status);
        //Close the driver
        driver2.quit();

    }
}
