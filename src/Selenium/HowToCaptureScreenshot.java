package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class HowToCaptureScreenshot {
    public static void main(String[] args) throws IOException {
        //open browser and go to the required link
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://letcode.in/buttons");

        // It only can take screenshot the DOM - it done mostly

      /* File firstSrc =  driver.getScrenshotAs(OutputType.FILE);
       File dest = new File(("./snaps/img.png"));
       FileHandler .copy(firstSrc,dest);*/

        // to get full page screenshot
        // capture screenshot and store the image
        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(s.getImage(),"PNG",new File("./snaps/ltimg.png"));

      /*  // element Screenshot
        WebElement element = driver.findElement(By.id("home"));
        // Along with driver pass element also in takeScreenshot() method.
        Screenshot s1=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);
        ImageIO.write(s1.getImage(),"PNG",new File("./snaps/lteleimg.png"));*/


        //closing the webdriver
        driver.quit();

    }



}
