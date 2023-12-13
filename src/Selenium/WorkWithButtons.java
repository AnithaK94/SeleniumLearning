package Selenium;

import Selenium.DriverUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WorkWithButtons {
    public static void main(String[] args){
        //open browser and go to the required link
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.leafground.com/button.xhtml");

        //Click and confirm the Title
        WebElement clickButton = driver.findElement(By.name("j_idt88:j_idt90"));
        clickButton.click();
        System.out.println("Click Button is Successful");

        // switch from frame to main page
        driver.navigate().back();

        //Confirm if the button is disabled.
        WebElement disableButton = driver.findElement(By.id("j_idt88:j_idt92"));
        boolean checkEnableButton = disableButton.isEnabled();
        if(checkEnableButton){
            System.out.println("The Button is Enabled");
        }else{
            System.out.println("The Button is Disabled");
        }

        // Find the X and Y -position  of the button
        WebElement getButtonPosition = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xyValue = getButtonPosition.getLocation();
        int xValue = xyValue.getX();
        int yValue = xyValue.getY();
        System.out.println("X Value is : " +xValue + ", Y Value is : " +yValue);

        //Find the colour of the button
        WebElement colourButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt96\']"));
        String colour = colourButton.getCssValue("background");
        System.out.println("The Button colour is : " +colour);

        //Find the height and Width of the button
        WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt98"));
        int height = sizeButton.getSize().getHeight(); //
        int width = sizeButton.getSize().getWidth();
        System.out.println("The height of the button is : " +height + " The width of the button is : " +width);
        /* can also use Rect -  Rectangle  sizeBut = driver.findElement(By.id("j_idt88:j_idt98")).getRect();
         Dimension sizeDime = sizeBut.getDimension();
         System.out.println(sizeDime); --// it gives (width,height)
         can get separately - sizeDime.getWidth(); can get separately - sizeDime.getHeight();*/

        //Mouse over and confirm the color changed
        WebElement mouseOff = driver.findElement(By.name("j_idt88:j_idt100"));
        String coloroff = mouseOff.getCssValue("background");
                    // create an instance of action class
        Actions action = new Actions(driver);
                    // perform mouse hover action
        action.moveToElement(mouseOff).build().perform();
        String colorOn = mouseOff.getCssValue("background");
        if( coloroff.equals(colorOn)) {
            System.out.println(" Colour Not Change occured!!");
        }else{
            System.out.println("Colour Change occurred!");
        }

        //Click Image Button and Click on any hidden button
        WebElement imageButton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
        imageButton.click();
        imageButton.click();

        //How many rounded buttons are there?

        int count = 0;
        try {
            List<WebElement> roundButton = driver.findElements(By.xpath("//*[@id=\'j_idt88\']/div/div[2]/div[4]/h5"));
            for (int i = 0; i < roundButton.size(); i++) {
                count = i;
            }
            System.out.print("The Total number of the rounded buttons are: " + count);

        } catch (Exception e)
        {}
    }
}
