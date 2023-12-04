package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTesting {
    String name = "Anil";
    boolean value = true;
    @Test
    public void checkEqual(){
        // It is used for unit Testing by the Developers- for their own check.
       // Assert.assertEquals(name,"anil"); // gives assertion error --> Case sensitive
        Assert.assertEquals(name,"Anil"); // test passes
       // Assert.assertFalse(value,"There is a message");
        Assert.assertTrue(value,"There is a message");
    }
}
