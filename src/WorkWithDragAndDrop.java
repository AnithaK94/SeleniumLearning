import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkWithDragAndDrop {
    public static void main(String[] args) {
        //Open the Browser and go to the desired page
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropable");

        //drag the box and drop it into the target Box
        WebElement dragFromBox = driver.findElement(By.id("draggable"));
        WebElement dropToBox = driver.findElement(By.id("droppable"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(dragFromBox, dropToBox).perform();//short method
        //full method
        // builder.clickAndHold(dragFromBox).moveToElement(dropToBox).release(dropToBox).build().perform();

        // Task - draggable =>only sorce present - target can be anywhere in the given frame
        driver.get("https://jqueryui.com/draggable/");
        // it is present inside a frame
        driver.switchTo().frame(0);

        WebElement dragBox = driver.findElement(By.id("draggable"));
        //builder.dragAndDropBy(dragBox,50,90).perform(); // it will also give answer
        int x = dragBox.getLocation().getX();
        int y = dragBox.getLocation().getY();
        // it will move the box from current position added to the given value
        builder.dragAndDropBy(dragBox,x+50,y+90).perform();

       // driver.quit();
    }
}

// Frames and The class Action have methods that are examples of Overloading.
