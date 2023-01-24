package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;

public class TestLogIn extends CommonAPI {
  Logger LOG = LogManager.getLogger(TestLogIn.class.getName());

  @Test
  public void logInOnHomePage() throws InterruptedException {

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
    String expectedTitle ="OrangeHRM";
    String actualTitle = getCurrentTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    LOG.info("login page validation success");

  }
}
