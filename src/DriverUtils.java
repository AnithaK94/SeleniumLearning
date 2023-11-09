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

    /*
    public static int staticVar = 0;
    private int instanceVar = 0;
    public static void main(String[] args) {
        System.out.println(++staticVar); // 1
        DriverUtils d1 = new DriverUtils();
        System.out.println(++d1.instanceVar); // 1

        DriverUtils d2 = new DriverUtils();
        System.out.println(++d2.instanceVar); // 1
        System.out.println(++DriverUtils.staticVar); // 2
    }
    */
}
