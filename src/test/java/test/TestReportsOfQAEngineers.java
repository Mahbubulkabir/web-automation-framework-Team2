package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.ReportsOfQAEngineers;

public class TestReportsOfQAEngineers extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestManagerReviews.class.getName());
    @Test
    public void reportGeneration() throws InterruptedException {
        ReportsOfQAEngineers reportsOfQAEngineers = new ReportsOfQAEngineers(getDriver());
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

         reportsOfQAEngineers.setClickOnLeaveBtn();
        Thread.sleep(3000);
         reportsOfQAEngineers.setClickOnReportBtn();
        Thread.sleep(3000);
         reportsOfQAEngineers.setClickOnUsageReport();
        Thread.sleep(3000);
         reportsOfQAEngineers.setTypeAndEnterField("q");
        Thread.sleep(3000);
         reportsOfQAEngineers.setClickOnGenerateBtn();
        Thread.sleep(3000);
         reportsOfQAEngineers.setClickOnXBtn();
        Thread.sleep(3000);
         String expectedTitle6= "OrangeHRM";
         String actualTitle6= getCurrentTitle();
         Assert.assertEquals(actualTitle6,expectedTitle6);
         LOG.info("reports validation success");
    }
}
