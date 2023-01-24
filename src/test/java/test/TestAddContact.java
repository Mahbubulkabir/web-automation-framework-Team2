package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

public class TestAddContact extends CommonAPI {
   Logger LOG = LogManager.getLogger(TestAddContact.class.getName());

   @Test
   public void addEmergencyContact() throws InterruptedException {
      HomePage homePage = new HomePage(getDriver());
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

      homePage.setClickOnMyInfoBtm();
      Thread.sleep(3000);
      homePage.setClickOnEmergencyConBtm();
      Thread.sleep(3000);
      homePage.setClickOnAddBtn();
      Thread.sleep(3000);
      homePage.typeName("robi");
      Thread.sleep(3000);
      homePage.typeRelationship("brother");
      Thread.sleep(3000);
      homePage.typeHomePhone("364556746");
      Thread.sleep(3000);
      homePage.typeMobile("212344556");
      Thread.sleep(3000);
      homePage.typeWorkPhone("718777777");
      Thread.sleep(3000);
      homePage.setClickOnSaveBtn();
      Thread.sleep(3000);
      String expectedTitle2 = "OrangeHRM";
      String actualTitle2 = getCurrentTitle();
      Assert.assertEquals(actualTitle2, expectedTitle2);
      LOG.info("emergency contact add success");
   }
}
