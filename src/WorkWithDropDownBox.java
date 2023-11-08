import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkWithDropDownBox {
    public static void main(String[] args){
        // Open browser and go to the desired webpage.
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.leafground.com/select.xhtml");

        //Select Text using Index
        WebElement dropdowntool = driver.findElement(By.className("ui-selectonemenu"));
        Select selecttool = new Select(dropdowntool);
        selecttool.selectByIndex(2);
        /* Thread.sleep(3000);
         Thread should not use - as it delays the application by 3 seconds ==>> automation is to done fast
        selecttool.selectByValue("1");
        selecttool.selectByVisibleText("Puppeteer");*/

        // Get the number of drop down options
        List<WebElement> listOptions = selecttool.getOptions();
        int sizeOptions = listOptions.size();
        System.out.println("The number of avialable options : " +sizeOptions);

        // use SendKeys to select the content in dropdown box
        dropdowntool.sendKeys("Selenium");

        // multiselect ina drop down box
        driver.get("https://letcode.in/dropdowns");
        WebElement multidropdown = driver.findElement(By.id("superheros"));
        // To find if the dropdown allows to select multiple options - use multidropdown.isMultiple(); - gives boolean
        Select multiselect = new Select(multidropdown);
        multiselect.selectByValue("bt");
        multiselect.selectByValue("ff");
        multiselect.selectByValue("ca");
        multiselect.selectByValue("dd");
        // to get all the selected options. multiselect.getAllSelectedOptions();

        //Select India using visible Text & print the selected value
        WebElement chooseBox = driver.findElement(By.id("country"));
        Select chooseSelect = new Select(chooseBox);
        chooseSelect.selectByVisibleText("India");
        String value = chooseSelect.getFirstSelectedOption().getAccessibleName(); //getFirstSelectedOption().getText();
        //getFirstSelectedOption - gives the last selected option in a multiple selected items - used to get the value from the dropdown.
        System.out.println(value);

        // Get the last selected option and print all options
        WebElement printBox = driver.findElement(By.id("lang"));
        Select printSelect = new Select(printBox);
        printSelect.selectByValue("sharp");
        List<WebElement> printOptions = printSelect.getOptions();
        int size = printOptions.size();
        for(int i=0; i<size ; i++) {
            String options = printOptions.get(i).getText();
            System.out.println("The options given in the Programming dropdown : " + options);
        }

        driver.quit();
    }
}

/* To deselect = use deSelectByIndex(0); - it can be done only in multiple selected Drop down list.
exceptions:
1. UnsupportedOperationException - when we cannot deselect for a single select dropdownbox.

How to handle dropdown which are not in Select ???
BootStrap DropDown - it is not real dropdown. [operate as real one - created using CSS]
So, use simple mouse functions as click() function for each options by finding it xpath,id, class etc.
 */