package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import page.LoginPage;

public class CreateTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateTest.class.getName());

    @Test
    public void createNewEvent() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setEmailField("hemalhemu7@gmail.com");
        Thread.sleep(3000);
        loginPage.setPassword("Hemal1703");
        Thread.sleep(3000);
        loginPage.setLoginButton();
    }

}