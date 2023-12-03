package testNGFramework;

import org.testng.annotations.Test;

public class GroupingTestCase {
    /*
    * Scenario: A Big Basket is having a different kind of mobiles.
    * Let us say there are Apple phones, Moto, VIVO and Lenovo.
    * I want to run test only for VIVO and Moto phones. Write a program for that. */
    @Test(groups = {"Apple"})
    public void apple1(){
        System.out.println("Apple Testing");
    }
    @Test(groups = {"Apple"})
    public void apple2(){
        System.out.println("Apple Testing");
    }
    @Test(groups = {"Moto"})
    public void moto1(){
        System.out.println("Moto Testing");
    }
    @Test(groups = {"Moto"})
    public void moto2(){
        System.out.println("Moto Testing");
    }
    @Test(groups = {"VIVO"})
    public void vivo1(){
        System.out.println("VIVO Testing");
    }
    @Test(groups = {"VIVO"})
    public void vivo2(){
        System.out.println("VIVO Testing");
    }
    @Test(groups = {"Lenevo"})
    public void lenevo1(){
        System.out.println("Lenevo Testing");
    }
    @Test(groups = {"Lenevo"})
    public void lenevo2(){
        System.out.println("Lenevo Testing");
    }


}
