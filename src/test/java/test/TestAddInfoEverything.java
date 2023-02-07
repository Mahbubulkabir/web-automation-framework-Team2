package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import utility.ReadFromExel;

public class TestAddContact extends CommonAPI {
   Logger LOG = LogManager.getLogger(TestAddContact.class.getName());
   ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automation-framework-final-Bootcamp\\data\\titles.xlsx", "test data");
   String username= read.getCellValueForGivenHeaderAndKey("key","userName");
   String password= read.getCellValueForGivenHeaderAndKey("key","passWord");
   @Test
   public void addEmergencyContact() throws InterruptedException {
      HomePage homePage = new HomePage(getDriver());
      LogInPage logInPage = new LogInPage(getDriver());
      String expectedHomePageTitle = "OrangeHRM";
      String actualHomePageTitle = getCurrentTitle();
      Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
      LOG.info("land to orangehrm home page successfully");

      logInPage.typeUserName(username);
      logInPage.typePassword(password);
      logInPage.setClickOnLogInBtm();
      homePage.setClickOnMyInfoBtm();
      homePage.setClickOnEmergencyConBtm();
      homePage.setClickOnAddBtn();
      homePage.typeName("robi");
      homePage.typeRelationship("brother");
      Thread.sleep(3000);
      homePage.typeHomePhone("364556746");
      homePage.typeMobile("212344556");
      homePage.typeWorkPhone("718777777");
      Thread.sleep(3000);
      homePage.setClickOnSaveBtn();
      String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmergencyContacts/empNumber/7";
      Assert.assertEquals(getURL(), expectedUrl);
      LOG.info("emergency contact add page validation success");
   }
}
