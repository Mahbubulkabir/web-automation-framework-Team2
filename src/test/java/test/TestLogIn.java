package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import utility.ReadFromExel;

public class TestLogIn extends CommonAPI {
  Logger LOG = LogManager.getLogger(TestLogIn.class.getName());
  ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automation-framework-final-Bootcamp\\data\\titles.xlsx", "test data");
  String username= read.getCellValueForGivenHeaderAndKey("key","userName");
  String password= read.getCellValueForGivenHeaderAndKey("key","passWord");

  @Test
  public void logInOnHomePage() throws InterruptedException {

    LogInPage logInPage = new LogInPage(getDriver());
    String expectedHomePageTitle = "OrangeHRM";
    String actualHomePageTitle = getCurrentTitle();
    Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
    LOG.info("land to orangehrm home page successfully");
    Thread.sleep(3000);
    logInPage.typeUserName(username);
    Thread.sleep(3000);
    logInPage.typePassword(password);
    Thread.sleep(3000);
    logInPage.setClickOnLogInBtm();
    Thread.sleep(3000);
    String expectedUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    Assert.assertEquals(getURL(), expectedUrl);
    LOG.info("login page validation success");

  }
}
