package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.ManageReviews;

public class TestManagerReviews extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestManagerReviews.class.getName());

    @Test
    public void managerReviewsFromDropDown() throws InterruptedException {
        ManageReviews manageReviews = new ManageReviews(getDriver());
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

        manageReviews.setClickOnPerformanceBtn();
        Thread.sleep(3000);
        manageReviews.setClickOnDropDownField();
        Thread.sleep(3000);
        manageReviews.setClickOnMyReviews();
        Thread.sleep(3000);
        String expectedTitle5= "OrangeHRM";
        String actualTitle5 = getCurrentTitle();
        Assert.assertEquals(actualTitle5,expectedTitle5);
        LOG.info("my reviews by drop down success");

    }
}
