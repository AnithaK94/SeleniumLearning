package testNGFramework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SampleTestClass {

//    private static Logger logger = LoggerFactory.getLogger(SampleTestClass.class);
    @Test// individual Test canm be run without the need for main method
    public void firstTestCase(){
        System.out.println("This is the first TestCase");
    }
    @Test
    public void secondTestCase(){
        System.out.println("This is the second TestCase");
    }
    @Test
    public void thirdTestCase(){
        System.out.println("This is the third TestCase");
    }
    @Test
    public void fourthTestCase(){
        System.out.println("This is the fourth TestCase");
    }
}
