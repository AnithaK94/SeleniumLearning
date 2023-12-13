import Selenium.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WorkWithSelectable {
    public static void main(String[] args) {
        // Open the browser and go to the desired page
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://jqueryui.com/selectable/");
        // It is inside a frame
        driver.switchTo().frame(0);

        List<WebElement> selectList = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
        // To get the size of the List
        System.out.println("The number of items in the list is : " +selectList.size());
        // To perform an action - use ACTIONS METHOD FROM INTERACTIONS Class
        Actions builder = new Actions(driver);
        //do the required action using Keyboard and mouse actions
       // builder.keyDown(Keys.CONTROL).click(selectList.get(0)).click(selectList.get(1)).click(selectList.get(2)).click(selectList.get(3)).perform();
        //do the required action using only mouse actions
       builder.clickAndHold(selectList.get(0)).clickAndHold(selectList.get(1)).clickAndHold(selectList.get(2)).clickAndHold(selectList.get(3)).perform();


    }

}
