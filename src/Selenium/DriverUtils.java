package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

    public static WebDriver setDriverPathAndGetWebDriver(String url) {
        // Open the Browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Go to the Desired Page
        driver.get(url);
        return driver;
    }

    /*Selenium automates Browser- it's all depends on how we use it.
    Components of Selenium: 1.IDE - records and replays
    2. Selenium RC(Remote Control) - depreciated
    3. Selenium Webdrivers - do REST services - get and post  using JSON
    4. Selenium grid = large concept
    DOM:
    What is the DOM? The Document Object Model (DOM) is a programming interface for web documents.
    It represents the page so that programs can change the document structure, style, and content.
    The DOM represents the document as nodes and objects; that way, programming languages can interact with the page.
    DOM in HTML:
    The HTML DOM is an Object Model for HTML. It defines:
        HTML elements as objects
        Properties for all HTML elements
        Methods for all HTML elements
        Events for all HTML elements
Finding HTML Elements
When you want to access HTML elements with JavaScript --->  js REPLACE/ADD/DELETE/REACT TO HTML Elements

Selenium --> to test, you have to find the elements first.
ways to do this: [Locators Strategy]
        Finding HTML elements by
                id ----> not use when it is dynamic and have numbers
                name  ---> not use when it is dynamic
                className ---> not use when it has spaces
                LinkText ----> not use when it is dynamic
                PartialLinkText ----> not use when it is dynamic
                TagName
                CSS selectors
                XPath
    */
}
