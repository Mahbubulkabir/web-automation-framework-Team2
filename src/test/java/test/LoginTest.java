package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends CommonAPI {
   Logger LOG= LogManager.getLogger(LoginTest.class.getName());
    @Test
     public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setEmailField("hemalhemu7@gmail.com");
        Thread.sleep(3000);
        loginPage.setPassword("Hemal1703");
        Thread.sleep(3000);
        loginPage.setLoginButton();
        Thread.sleep(3000);
        Assert.assertEquals(getCurrentTitle(),"Cogmento CRM");
        LOG.info("login page validation successful");

    }
}
