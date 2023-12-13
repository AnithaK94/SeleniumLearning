package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WorkWithForms {
    public static void main(String[] args) {
        //If driver set and property is problem --> IllegalStateException
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/forms");
        //TC 1 - FirstName Text
        WebElement fname = driver.findElement(By.id("firstname"));
        fname.sendKeys("Anitha");
        //TC 2 - LastName Text
        WebElement lname = driver.findElement(By.id("lasttname"));
        lname.sendKeys(("Kannan"));
        //TC 3 - Email Text
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys(("anitha22@gmail.com"));
        //TC 4 - CountryCode - dropdown
        WebElement code = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[2]/div[2]/div/div/div/select"));
        Select countryCode = new Select(code);
        countryCode.selectByVisibleText("India (+91)");
        //TC 5 - PhoneNumber Text
        WebElement phno = driver.findElement(By.id("Phno"));
        phno.sendKeys(("1234567890"));
        //TC 6 - Address1 Text
        WebElement address = driver.findElement(By.id("Addl1"));
        address.sendKeys(("123,Abcdef"));
        //TC 7 - Address2 Text
        WebElement addressdt = driver.findElement(By.id("Addl2"));
        addressdt.sendKeys(("qweertyuio, mnbvcxz"));
        //TC 8 - State Text
        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys(("Tamil Nadu"));
        //TC 9 - Postal Code Text postalcode
        WebElement postalcode = driver.findElement(By.id("postalcode"));
        postalcode.sendKeys(("Tamil Nadu"));
        //TC 10 - Country - dropdown
        WebElement country = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select"));
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText("India");
        //TC 11 - DOB - Calendar
        WebElement dob = driver.findElement(By.id("Date"));
        dob.sendKeys(("22/10/1994"));
        //TC 12 - Gender - Radio Button
        WebElement gender = driver.findElement(By.id("female"));
        gender.click();
        //TC 13 - Agree terms and conditions - checkbox
       // WebElement termLink = driver.findElement(By.partialLinkText("terms and "));
        //termLink.click();
       // driver.navigate().back();
        WebElement term = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[7]/div/label/input"));
        term.click();
        //TC 14 - Submit Button
        WebElement submitbtn = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[8]/div/input"));
        submitbtn.click();
    }
}
