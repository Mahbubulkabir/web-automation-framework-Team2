package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.TimeFunctionAll;
import pages.TimeSheets;
import utility.ReadFromExel;

public class TestTimeFunctionAll extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestTimeFunctionAll.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automation-framework-final-Bootcamp\\data\\titles.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");

    @Test(priority = 0, enabled = true)
    public void summeryReportForEngineers() throws InterruptedException {
        TimeFunctionAll timeFunctionAll = new TimeFunctionAll(getDriver());
        TimeSheets timeSheets = new TimeSheets(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        Assert.assertEquals(getCurrentTitle(),"OrangeHRM");
        LOG.info("land to orangehrm home page successfully");
        logInPage.typeUserName(username);
        logInPage.typePassword(password);
        logInPage.setClickOnLogInBtm();
        Thread.sleep(3000);
        timeSheets.setClickOnTimeBtn();
        Thread.sleep(3000);
       // timeFunction.setReportDropDown("Attendance Summary");
        timeFunctionAll.setReportBtn();
        Thread.sleep(3000);
        timeFunctionAll.setClickOnSummery();
        Thread.sleep(3000);
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/time/displayAttendanceSummaryReportCriteria";
        Assert.assertEquals(getURL(),expectedUrl);
        LOG.info("summery report page validation success");
    }
   @Test(priority = 2)
    public void addRowInEditTimeSheet() throws InterruptedException {
       TimeFunctionAll timeFunctionAll = new TimeFunctionAll(getDriver());
       TimeSheets timeSheets = new TimeSheets(getDriver());
       LogInPage logInPage = new LogInPage(getDriver());
       Assert.assertEquals(getCurrentTitle(),"OrangeHRM");
       LOG.info("land to orangehrm home page successfully");
       logInPage.typeUserName(username);
       logInPage.typePassword(password);
       logInPage.setClickOnLogInBtm();
       timeSheets.setClickOnTimeBtn();
       timeFunctionAll.setClickOnViewBtn();
       timeFunctionAll.setClickOnEditBtn();
       Thread.sleep(3000);
       timeFunctionAll.setClickOnAddRowBtn();
       Thread.sleep(3000);
       String expectedUrl2= "https://opensource-demo.orangehrmlive.com/web/index.php/time/editTimesheet/260";
       Assert.assertEquals(getURL(),expectedUrl2);
       LOG.info("row add page validation success");
     //  Assert.fail();
   }
   @Test(dependsOnMethods = {"addRowInEditTimeSheet"})
   public void deleteRowFromEditTimeSheet() throws InterruptedException {
       TimeFunctionAll timeFunctionAll = new TimeFunctionAll(getDriver());
       TimeSheets timeSheets = new TimeSheets(getDriver());
       LogInPage logInPage = new LogInPage(getDriver());
       Assert.assertEquals(getCurrentTitle(),"OrangeHRM");
       LOG.info("land to orangehrm home page successfully");
       logInPage.typeUserName(username);
       logInPage.typePassword(password);
       logInPage.setClickOnLogInBtm();
       timeSheets.setClickOnTimeBtn();
       Thread.sleep(3000);
       timeFunctionAll.setClickOnViewBtn();
       timeFunctionAll.setClickOnEditBtn();
       Thread.sleep(3000);
       timeFunctionAll.setClickOnAddRowBtn();
       Thread.sleep(3000);
       timeFunctionAll.setClickOnDeleteRowBtn();
       Thread.sleep(3000);
       timeFunctionAll.setClickOnSaveBtn();
       Thread.sleep(3000);
       String expectedUrl3 = "https://opensource-demo.orangehrmlive.com/web/index.php/time/editTimesheet/260";
       Assert.assertEquals(getURL(),expectedUrl3);
       LOG.info("row delete validation success");
   }

   @Test(priority = 1)
    public void viewSelectedEmployee() throws InterruptedException {
       TimeFunctionAll timeFunctionAll = new TimeFunctionAll(getDriver());
       TimeSheets timeSheets = new TimeSheets(getDriver());
       LogInPage logInPage = new LogInPage(getDriver());
       Assert.assertEquals(getCurrentTitle(),"OrangeHRM");
       LOG.info("land to orangehrm home page successfully");
       logInPage.typeUserName(username);
       logInPage.typePassword(password);
       logInPage.setClickOnLogInBtm();
       timeSheets.setClickOnTimeBtn();
       Thread.sleep(3000);
       timeFunctionAll.setClickOnViewBtn();
       String expectedUrl4 = "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewTimesheet/employeeId/7?startDate=2023-01-16";
       Assert.assertEquals(getURL(),expectedUrl4);
       LOG.info("view selected employee time sheet page validation success");
   }

   @Test
    public void projectInfoForCustomers() throws InterruptedException {
       TimeFunctionAll timeFunctionAll = new TimeFunctionAll(getDriver());
       TimeSheets timeSheets = new TimeSheets(getDriver());
       LogInPage logInPage = new LogInPage(getDriver());
       Assert.assertEquals(getCurrentTitle(),"OrangeHRM");
       LOG.info("land to orangehrm home page successfully");
       logInPage.typeUserName(username);
       logInPage.typePassword(password);
       logInPage.setClickOnLogInBtm();
       timeSheets.setClickOnTimeBtn();
       Thread.sleep(3000);
       //timeFunctionAll.setProjectInfoDropDownToCustomers("Customers");
       timeFunctionAll.setProjectInfoDropDownClick();
       timeFunctionAll.setClickOnCustomers();
       Thread.sleep(3000);
       String expectedUrl5 = "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewCustomers";
       Assert.assertEquals(getURL(),expectedUrl5);
       LOG.info("Customers project info validation success");
   }

   @Test
    public void attendanceConfiguration() throws InterruptedException {
       TimeFunctionAll timeFunctionAll = new TimeFunctionAll(getDriver());
       TimeSheets timeSheets = new TimeSheets(getDriver());
       LogInPage logInPage = new LogInPage(getDriver());
       Assert.assertEquals(getCurrentTitle(),"OrangeHRM");
       LOG.info("land to orangehrm home page successfully");
       logInPage.typeUserName(username);
       logInPage.typePassword(password);
       logInPage.setClickOnLogInBtm();
       timeSheets.setClickOnTimeBtn();
       Thread.sleep(3000);
       timeFunctionAll.setClickOnAttendance();
       timeFunctionAll.setClickOnConfiguration();
       Thread.sleep(3000);
       String expectedUrl6 = "https://opensource-demo.orangehrmlive.com/web/index.php/attendance/configure";
       Assert.assertEquals(getURL(),expectedUrl6);
       LOG.info("configuration page validation success");
   }
}
