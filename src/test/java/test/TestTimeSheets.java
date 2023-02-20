package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.TimeSheets;
import utility.ReadFromExcel;

public class TestTimeSheets extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestTimeSheets.class.getName());
    ReadFromExcel read = new ReadFromExcel("C:\\Users\\munna\\InteliiJ\\webAutomationFinalExamMMK\\data\\data.xlsx", "test data");
    @Test
    public void timeSheetsForEmployees() throws InterruptedException {
        TimeSheets timeSheets = new TimeSheets(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName("Admin");
        logInPage.typePassword("admin123");
        logInPage.setClickOnLogInBtm();

        timeSheets.setClickOnTimeBtn();
        timeSheets.setClickOnTimeSheetBtn();
        timeSheets.setClickOnEmployeeTimeSheetBtn();
        Thread.sleep(3000);
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet";
        Assert.assertEquals(getURL(),expectedUrl);
        LOG.info("employee time sheets page validation successful");
    }
}
