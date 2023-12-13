import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class workWithSortables {
    public static void main(String[] args) {
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/sortable");
        // Drag teh contents in To do Column and Drop it in the Done column

        WebElement dragBox = driver.findElement(By.xpath("//*[@id=\'sample-box1\']"));
        Point xyValue = dragBox.getLocation();
        int xValue = xyValue.getX();
        int yValue = xyValue.getY();
        int x = dragBox.getLocation().getX();
        int y = dragBox.getLocation().getY();
        System.out.println("X Value is : " +xValue + ", Y Value is : " +yValue);

        // it will move the box from current position added to the given value
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(dragBox,x+54,y+120).perform();


    }
}
