package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class HowToCaptureScreenshot {
    public static void main(String[] args) throws IOException {
        //open browser and go to the required link
        WebDriver driver = DriverUtils.setDriverPathAndGetWebDriver("https://www.leafground.com/button.xhtml");

        // It only can take screenshot the DOM

       File firstSrc =  driver.getScrenshotAs(OutputType.FILE);
       File dest = new File(("./snaps/img.png"));
       FileHandler .copy(firstSrc,dest);

    }



}
