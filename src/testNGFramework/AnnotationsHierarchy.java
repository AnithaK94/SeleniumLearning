package testNGFramework;

import org.testng.annotations.*;

public class AnnotationsHierarchy {
    @Test
    public void run() {
        System.out.println("I run");
    }

    @Test
    public void walk() {
        System.out.println("I Walk");
    }

    @Test
    public void jump() {
        System.out.println("I Jump");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am Before Suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I am Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am Before Method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am Before Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am After Suite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am After Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am After Test");
    }
}