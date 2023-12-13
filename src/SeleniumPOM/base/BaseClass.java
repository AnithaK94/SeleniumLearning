package SeleniumPOM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver = null;
    @BeforeTest
    public void startApp(){
        String url = "https://signon.service-now.com/x_snc_sso_auth.do?pageId=username";

        System.getProperty("webdriver.chrome.driver", "C:\\Users\\kanna\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // should not give directly
        driver.get(url);
    }
    @AfterTest
    public void closeApp(){
        driver.quit();
    }
}
