import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithTextBox {
    public static void main (String[] args){
        // open browser and go to the required link
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");

        // find the edit box and enter the data
       WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
       nameBox.sendKeys("Anitha K");

       // find the edit box and append the data
       WebElement appendBox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
       appendBox.sendKeys("Text");

        // find the edit box , retrieve the attribute value , saved in a variable and print it as output
        WebElement retrieveBox = driver.findElement(By.name("j_idt88:j_idt97"));
        String value = retrieveBox.getAttribute("value");
        System.out.println(value);

        // find the edit box and clear the data present in it
        WebElement clearBox = driver.findElement(By.name("j_idt88:j_idt95"));
        clearBox.clear();

        // find the edit box and check whether the box is disabled or not
        WebElement disableBox = driver.findElement(By.id("j_idt88:j_idt93"));
        boolean checkEnabled = disableBox.isEnabled();
        System.out.println(checkEnabled);

        // find the editbox,type email and tab to next one.
        WebElement emailBox = driver.findElement(By.id("j_idt88:j_idt99"));
        emailBox.sendKeys("kannananitha1994@gmail.com" + Keys.TAB);

        // find the textbox and type about yourself
        WebElement typeBox = driver.findElement(By.id("j_idt88:j_idt101"));
        typeBox.sendKeys("This is me Anitha K. I am Interested in learning Automation in Testing in Selenium");

        // find editbox, just press enter and show error message
        WebElement errorBox = driver.findElement(By.xpath("//*[@id=\'j_idt106:thisform:age\']"));
        errorBox.sendKeys(""+ Keys.ENTER);
        //expected error text
        String expError = "Age is mandatory";
        //identify actual error message
        WebElement showError = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail"));
        String actError = showError.getText();
        System.out.println("Error message is: "+ actError);
        //verify error message with Assertion
        if(expError.equals(actError)){
            System.out.println("Error Occured");
        }
        driver.quit();
    }
}

/* sendKeys = void function - means browser start to type.
Read only = get Attribute  and find the value is there., if true = readonly field else not
to check disabled button - use isEnabled
 */