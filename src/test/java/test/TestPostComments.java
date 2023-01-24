package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PostComments;

public class TestPostComments extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestPostComments.class.getName());
    @Test
    public void postCommentsAndLikeIt() throws InterruptedException {
        PostComments postComments = new PostComments(getDriver());
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

        postComments.setClickOnBuzzBtn();
        Thread.sleep(3000);
        postComments.setTypeCommentsField("Hello Every body");
        Thread.sleep(3000);
        postComments.setClickOnPostBtn();
        Thread.sleep(3000);
        Assert.assertEquals(getCurrentTitle(),"OrangeHRM");
        LOG.info("comments and like page validation success");
    }

}
