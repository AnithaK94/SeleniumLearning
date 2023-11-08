import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WorkWithWindows {
    public static void main(String[] args) throws InterruptedException {
        // Open the Browser and get the desired page
        System.getProperty("webdriver.chrome.driver","C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/windows");

        // get the mouse control over the current main page
        String mainControl = driver.getWindowHandle();
        // Click on the Home button
        WebElement mainPageButton = driver.findElement(By.id("home"));
        mainPageButton.click();
        // get the mouse control of all opened pages
        Set<String> openedPagesControl = driver.getWindowHandles();
        // get the mouse control over the now opened page or pages
        // using List
        List<String> openNewPagecontrol = new ArrayList<>(openedPagesControl);
        driver.switchTo().window(openNewPagecontrol.get(1));
        // to get the current url
        System.out.println(driver.getCurrentUrl());
        // switch the mouse control using for loop
        for (String homePageControl: openedPagesControl) {
            driver.switchTo().window(homePageControl);
        }
        //click the desired work to be done
        WebElement inputBox = driver.findElement(By.linkText("Edit"));
        inputBox.click();

        // Enter your full Name
        WebElement nameTextBox = driver.findElement(By.id("fullName"));
        nameTextBox.sendKeys("Anitha Kannan");
       /* Thread.sleep(200);
        //Append a text and press keyboard tab
        WebElement appendTextBox = driver.findElement(By.id("join"));
        appendTextBox.sendKeys("girl"+ Keys.TAB);
        Thread.sleep(200);
        //What is inside the text box
        WebElement retriveTextBox = driver.findElement(By.id("getMe"));
        String value = retriveTextBox.getAttribute("value");
        System.out.println("The value inside the Retrieve Text Box is : " +value);
        Thread.sleep(200);
        //Clear the text
        WebElement clearTextBox = driver.findElement(By.id("clearMe"));
        clearTextBox.clear();
        Thread.sleep(200);
        //Confirm edit field is disabled
        WebElement checkDisableBox = driver.findElement(By.id("noEdit"));
        System.out.println(" Is The Edit field Enabled ? : " + checkDisableBox.isEnabled());
        Thread.sleep(200);
        //Confirm text field is readonly
        WebElement checkReadOnlyBox = driver.findElement(By.id("dontwrite"));
        System.out.println("Is the selected TextBox is Readonly? : " + checkReadOnlyBox.getAttribute("value"));
        Thread.sleep(200);*/

        // after the operations performed in the opened Home page, close the home page
        driver.close();
        // Now, switch the mouse control to the main Page
        driver.switchTo().window(mainControl);

        // Task 2 -Open muiltple windows
        //The control is over the current Main page, so, no need to write window handle
        // Click on multiple windows button
        WebElement multipleWindowOpenButton = driver.findElement(By.id("multi"));
        multipleWindowOpenButton.click(); // open page 1
        multipleWindowOpenButton.click(); // open page 2

        //get the number of windows opened when multiple windows button clicked
        Set<String> multiWindowsControl = driver.getWindowHandles();
        System.out.println("The number of windows opened  is : " +multiWindowsControl.size());

        // Close the multiple windows opene except the main page
        for (String multiPagesControl: multiWindowsControl) {
            if(! (multiPagesControl).equals(multiWindowsControl)){
                driver.switchTo().window(multiPagesControl);
                Thread.sleep(200);
                driver.close(); // closes only the current page
            }
        }
        driver.quit(); // closes all the pages and come out of the driver. It closes the connection to driver.

    }
}
/* Set = gives random values getwindowHandles - class in linkedHashedTag
*Set works based on the implementing class - hence it operates as Linked hash map
*  */