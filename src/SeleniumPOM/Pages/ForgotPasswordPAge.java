package SeleniumPOM.Pages;

import SeleniumPOM.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPAge extends BaseClass {
    public void enterReEmail(String email){
        WebElement reEmailBox = driver.findElement(By.id("email"));
        reEmailBox.clear();
        reEmailBox.sendKeys(email);
    }
    public void checkNotRobot(){
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
    }
    public void clickReSetPass(){
        driver.findElement(By.id("forgot_password_submit_button")).click();
    }
}
