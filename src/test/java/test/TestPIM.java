package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PimPage;

public class TestPIM extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestPIM.class.getName());

 @Test
    public void findOutEmployeeById() throws InterruptedException {
     PimPage pimPage = new PimPage(getDriver());
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

     pimPage.setClickOnPimBtn();
     Thread.sleep(3000);
     pimPage.typeEmployeeIdField("0221");
     Thread.sleep(3000);
     pimPage.setClickOnSearchBtn();
     Thread.sleep(3000);
     pimPage.setClickOnRecordedName();
     Thread.sleep(3000);
     String expectedTitle3 = "OrangeHRM";
     String actualTitle3 = getCurrentTitle();
     Assert.assertEquals(actualTitle3, expectedTitle3);
     LOG.info("employee details page validation success");

 }
}
