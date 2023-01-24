package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.LogOut;

public class TestLogOut extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogOut.class.getName());
    @Test
    public void logOutFromOrangehrmPage() throws InterruptedException {
        LogOut logOut = new LogOut(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");
        Thread.sleep(3000);
        logInPage.typeUserName("Admin");
        Thread.sleep(3000);
        logInPage.typePassword("admin123");
        Thread.sleep(3000);
        logInPage.setClickOnLogInBtm();
        Thread.sleep(3000);

        logOut.setClickOnProfileBtn();
        Thread.sleep(3000);
        logOut.setClickOnLogOut();
        Thread.sleep(3000);
        String expectedTitle8= "OrangeHRM";
        String actualTitle8= getCurrentTitle();
        Assert.assertEquals(actualTitle8,expectedTitle8);
        LOG.info("log out validation success");


    }
}
