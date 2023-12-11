package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

    @FindBy(how = How.ID, id = "userName")
    public static WebElement userName;
    @FindBy(id = "password")
    public static WebElement password;
    @FindBy(id = "login")
    public static WebElement submit;

    // We have username, password and submit button
   /* public static WebElement userName(WebDriver driver){
        return driver.findElement(By.id("userName"));
    }
    public static WebElement password(WebDriver driver){
        return  driver.findElement(By.id("password"));
    }
    public static WebElement loginButton(WebDriver driver){
        return  driver.findElement(By.id("login"));
    }*/
}
