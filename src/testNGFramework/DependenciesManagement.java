package testNGFramework;

import org.testng.annotations.Test;

public class DependenciesManagement {
    // Problem1 : You have to admit a student To engineering
    // Problem2 : You have to Admit a student To higher Secondary

    @Test// if @Test(enabled = false) --> then ,it gives highSchool(), which is not annotated with @Test or not included Error.
    public void highSchool(){
        System.out.println("High School");
    }

    @Test(dependsOnMethods = "highSchool")
    public void highSecSchool(){
        System.out.println("Higher Secondary School");
    }

    @Test(dependsOnMethods = "highSecSchool")
    public void engineering(){
        System.out.println("Engineering");
    }
    // By default, if the Test Cases run without priority, it runs in alphabetical order.
    //If priority is set, then test cases run based on the priority number
    // To set a condition, with high school , higher sec school should not run and so for the other cases --> For these,
    // need to use dependsOnMethod()

}
