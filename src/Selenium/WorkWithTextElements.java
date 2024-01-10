package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkWithTextElements {
    public static void main1(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/edit");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Print the last label in the page
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        WebElement lastElement = labels.get(labels.size()-1);
        System.out.println("Last Element : " +lastElement.getText());

        int size = labels.size();
        if(size==6){
            System.out.println("Test Case Passed");
        }else System.out.println("Test Case Failed");

        //To print all the labels in the Web page
        for(WebElement label : labels) {
            String text = label.getText();
            System.out.println(text);
        }

        WebElement inputBox = driver.findElement(By.linkText("Edit"));
        inputBox.click();

        // Enter your full Name
        WebElement nameTextBox = driver.findElement(By.id("fullName"));
        nameTextBox.sendKeys("Anitha Kannan");

        //Append a text and press keyboard tab
        WebElement appendTextBox = driver.findElement(By.id("join"));
        appendTextBox.sendKeys("girl"+ Keys.TAB);

        //What is inside the text box
        WebElement retriveTextBox = driver.findElement(By.id("getMe"));
        String value = retriveTextBox.getAttribute("value");
        System.out.println("The value inside the Retrieve Text Box is : " +value);

        //Clear the text
        WebElement clearTextBox = driver.findElement(By.id("clearMe"));
        clearTextBox.clear();

        //Confirm edit field is disabled
        WebElement checkDisableBox = driver.findElement(By.id("noEdit"));
        System.out.println(" Is The Edit field Enabled ? : " + checkDisableBox.isEnabled());

        //Confirm text field is readonly
        WebElement checkReadOnlyBox = driver.findElement(By.id("dontwrite"));
        System.out.println("Is the selected TextBox is Readonly? : " + checkReadOnlyBox.getAttribute("value"));

        //after the operations performed in the opened Home page, close the home page
        driver.quit();
    }

    public static void main(String[] args) {
        // either upper or lower case print all the names contains the word
        // "cricket in the web page
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER);
        List<WebElement> crickets = driver.findElements(By.xpath("//*[contains(text(),'cricket')or contains(text(),'Cricket')]"));
        System.out.println(crickets.size());
        driver.quit();
    }
}
