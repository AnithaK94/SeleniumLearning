package SeleniumPOM.TestCases;

import SeleniumPOM.Pages.LoginPage;
import SeleniumPOM.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass {

    @Test
    public void Login(){

        // To check val;idations -- need objects
        LoginPage lp = new LoginPage(driver);
        boolean emailLabel = lp.getEmailLabel();
        Assert.assertEquals(emailLabel,true);

        boolean passwordLabel = lp.getPasswordLabel();
        Assert.assertTrue(passwordLabel);




        new LoginPage(driver)
            .enterEmail("kannananitha.94@gmail.com")
            .clickNext()
            .enterPassword("Anil@123")
            .clickSignIn();
    }
}
