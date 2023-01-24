package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.TimeSheets;

public class TestTimeSheets extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestTimeSheets.class.getName());
    @Test
    public void timeSheetsForEmployees() throws InterruptedException {
        TimeSheets timeSheets = new TimeSheets(getDriver());

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

        timeSheets.setClickOnTimeBtn();
        Thread.sleep(3000);
        timeSheets.setClickOnTimeSheetBtn();
        Thread.sleep(3000);
        timeSheets.setClickOnEmployeeTimeSheetBtn();
        Thread.sleep(3000);
        timeSheets.setTypeToArrowDownField("ch");
        Thread.sleep(3000);
        timeSheets.setClickOnViewBtn();
        Thread.sleep(3000);
        String expectedTitle7 = "OrangeHRM";
        String actualTitle7 = getCurrentTitle();
        Assert.assertEquals(actualTitle7,expectedTitle7);
        LOG.info("employee time sheets validation successful");
    }
}
