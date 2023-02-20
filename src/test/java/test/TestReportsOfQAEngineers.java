package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.ReportsOfQAEngineers;
import utility.ReadFromExcel;

public class TestReportsOfQAEngineers extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestManagerReviews.class.getName());
    ReadFromExcel read = new ReadFromExcel("C:\\Users\\munna\\InteliiJ\\web-automation-framework-final-Bootcamp\\data\\titles.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");
    @Test
    public void reportGeneration() throws InterruptedException {
        ReportsOfQAEngineers reportsOfQAEngineers = new ReportsOfQAEngineers(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName(username);
        logInPage.typePassword(password);
        logInPage.setClickOnLogInBtm();
        Thread.sleep(3000);

        reportsOfQAEngineers.setClickOnLeaveBtn();
        reportsOfQAEngineers.setClickOnReportBtn();
        reportsOfQAEngineers.setClickOnUsageReport();
        reportsOfQAEngineers.setTypeAndEnterField("q");
        reportsOfQAEngineers.setClickOnGenerateBtn();
        reportsOfQAEngineers.setClickOnXBtn();
        Thread.sleep(3000);
        String expectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveBalanceReport";
        Assert.assertEquals(getURL(),expectedUrl);
        LOG.info("reports page validation success");
    }
}
