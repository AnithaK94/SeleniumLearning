import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        //select browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        //open browser
        WebDriver webDriver = new ChromeDriver();
        //open Google HomePage
        webDriver.get("https:\\www.google.co.in");

        // enter a search term
        webDriver. findElement(By.name("q")).sendKeys("India" + Keys.ENTER);
        // click on the wikipedia link

        // to close the web page --> driver.close(); will also closer the application
        //webDriver.quit();
    }
}