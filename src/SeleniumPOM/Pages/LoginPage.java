package SeleniumPOM.Pages;

import SeleniumPOM.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseClass {
    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
    // Find locators -- validations
        public boolean getEmailLabel(){
         return driver.findElement(By.xpath("//*[@id=\'email\']")).isDisplayed();
        }
        public boolean getRememberLabel(){
            return driver.findElement(By.xpath("//*[@id=\'remember_username_label\']")).isDisplayed();
        }
        public boolean getNextBtnLabel(){
            return driver.findElement(By.xpath("//*[@id=\'username_submit_button\']")).isDisplayed();
        }
        public boolean getPasswordLabel(){
            return driver.findElement(By.xpath("//*[@id=\'password\']")).isDisplayed();
        }
        public boolean getSignInBtnLabel(){
            return driver.findElement(By.xpath("//*[@id=\'password_submit_button\']")).isDisplayed();
        }


    // Write Actions - Step 1
    /* @description - get the data from user and do the action
    @param email - pass the email id to login */

    public LoginPage enterEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
        return this;
    }
    public LoginPage checkRememberMe(){
        driver.findElement(By.id("remember_username_label")).click();
        return this;
    }
    public LoginPage clickNext(){
        driver.findElement(By.id("username_submit_button")).click();
        return this;
    }
    public LoginPage enterPassword(String pass){
        driver.findElement(By.id("password")).sendKeys(pass);
        return this;
    }
    public DashBoardPage clickSignIn(){
        driver.findElement(By.id("password_submit_button")).click();
        return new DashBoardPage();
    }
    public ForgotPasswordPAge forgotPassword(){
        driver.findElement(By.linkText("Forgot your password?")).click();
        return new ForgotPasswordPAge();
    }

    /* @description - This method qill do the login function
    * */
    public void login(String emailId, String password){
        enterEmail(emailId);
        clickNext();
        enterPassword(password);
        clickSignIn();
    }
}
