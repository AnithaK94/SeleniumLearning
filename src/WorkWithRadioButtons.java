import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithRadioButtons {
    public static void main (String[] args){
        // Open the browser and go the desired site
        System.getProperty("webdriver.chrome.driver","C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/radio");

        //Select any one
        WebElement selectOneButton = driver.findElement(By.id("yes"));
        selectOneButton.click();

        //Cofirm you can select only one radio button
        WebElement confirmSelectOneButton = driver.findElement(By.id("one"));
        WebElement confirmSelectTwoButton = driver.findElement(By.id("two"));
        confirmSelectTwoButton.click();
        if(confirmSelectOneButton.isSelected()){
            System.out.println("Yes Radio Button alone is selected");
        }else{
            System.out.println("No RadioButton alone is Selected ");
        }

        //Find the bug
        WebElement bugFindButton = driver.findElement(By.name("nobug"));
        bugFindButton.click();
        WebElement bugFindButton2 =driver.findElement(By.name("bug"));
        bugFindButton2.click();
        if(bugFindButton.isSelected() && bugFindButton2.isSelected()){
            System.out.println("There is a Bug - Both Buttons are Selected");
        }else{
            System.out.println("There is no Bug - Buttons work properly");
        }

        //Find which one is selected
        WebElement findSelectedButton1 = driver.findElement(By.id("foo"));
        WebElement findSelectedButton2 = driver.findElement((By.id("notfoo")));
        if(findSelectedButton1.isSelected()){
            System.out.println("Foo is Selected");
        }else if (findSelectedButton2.isSelected()){
            System.out.println("Bar is Selected");
        }
        else{
            System.out.println("None is Selected");
        }
        // Confirm last field is disabled
        WebElement goingButton =driver.findElement(By.id("going"));
        WebElement notGoingButton = driver.findElement(By.id("notG"));
        WebElement mayBeButton = driver.findElement(By.id("maybe"));
        goingButton.click();
        notGoingButton.click();
        if (mayBeButton.isEnabled()){
            System.out.println("The last field maybe Button is Enabled");
        }else{
            System.out.println("The last field maybe Button is Disabled");
        }
    }

}


