import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkWithHyperLinks {
    public static void main(String[] args){
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.leafground.com/link.xhtml");
        //GO TO DASHBOARD PAGE
        WebElement takeToDashboard = driver.findElement(By.linkText("Go to Dashboard"));
        takeToDashboard.click();
        driver.navigate().back();
        System.out.println("Taken to Dashboard Successfully!!!");
        //FIND MY DESTINATION
        WebElement findDestination = driver.findElement(By.partialLinkText("Find the URL"));
        findDestination.getAttribute("href");
        driver.navigate().back();
        System.out.println("Find the Destination Successfully!!!");
        //AM I BROKEN LINK?
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();

        String titlePage = driver.getTitle();
        if (titlePage.contains("404")){
            System.out.println("The Link is Broken");
        }else {
            System.out.println("The Link is not Broken");
        }
        driver.navigate().back();
        // DUPLICATE STRING
        /*if we CALL THE ALREADY CREATED OBJECT - GIVES STALE ELEMENT REFERENCE EXCEPTION
        1. The element has been deleted entirely
        2. The element is no longer attached to the DOM*/
        WebElement takeToDashboard1 = driver.findElement(By.linkText("Go to Dashboard"));
        takeToDashboard1.click();
        driver.navigate().back();
        System.out.println("Taken to Dashboard Again Successfully!!!");
        // HOW MANY LINKS ARE THERE IN THE PAGE?
        List<WebElement> linkCounts = driver.findElements(By.tagName("a"));
        int count = linkCounts.size();
        System.out.println("The total count of Links in the page is : " +count);



    }
}
