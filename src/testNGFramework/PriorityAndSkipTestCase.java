package testNGFramework;

import org.testng.annotations.Test;

public class PriorityAndSkipTestCase {
    @Test(priority = 1)
    public void startCar (){
        System.out.println("Start the Car");
    }
    @Test(priority = 3)
    public void firstGearCar (){
        System.out.println("First Gear");
    }
    @Test(priority = 2)
    public void runCar (){
        System.out.println("Run Car...");
    }
    @Test(priority = 4)
    public void secondGearCar (){
        System.out.println("Second Gear");
    }
    @Test(priority = 6, enabled = false)// if enabled is flase, then it will skip that test case
    public void fourthGearCar (){
        System.out.println("Fouth Gear");
    }
    @Test(priority = 5)
    public void thirdGearCar (){
        System.out.println("Third Gear");
    }
    @Test(priority = 7)
    public void musicOnCar (){
        System.out.println("Music On....");
    }
}
