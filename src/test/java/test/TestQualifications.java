package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.Qualifications;

public class TestQualifications extends CommonAPI {
  Logger LOG = LogManager.getLogger(TestQualifications.class.getName());

  @Test
    public void qualificationsAddWorkExperience() throws InterruptedException {
      Qualifications qualifications = new Qualifications(getDriver());
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
      qualifications.setClickOnQualificationBtn();
      Thread.sleep(3000);
      qualifications.setClickOnAddExperienceBtn();
      Thread.sleep(3000);
      qualifications.setTypeOnCompanyField("Citi bank");
      Thread.sleep(3000);
      qualifications.setTypeOnJobTitleField("QA Engineer");
      Thread.sleep(3000);
      qualifications.setTypeDateFromField("2018-02-03");
      Thread.sleep(3000);
      qualifications.setTypeOnDateToField("2022-10-10");
      Thread.sleep(3000);
      qualifications.setTypeOnCommentField("Interested to Learn more");
      Thread.sleep(3000);
      qualifications.setClickOnSaveBtn();
      Thread.sleep(3000);
      String expectedTitle4 = "OrangeHRM";
      String actualTitle4 = getCurrentTitle();
      Assert.assertEquals(actualTitle4, expectedTitle4);
      LOG.info("add work experience success");

  }
}
