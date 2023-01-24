package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PostComments;
import pages.SharePost;

public class TestSharePost extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSharePost.class.getName());

    @Test
    public void sharePostAndComments() throws InterruptedException {
        SharePost sharePost= new SharePost(getDriver());
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

        sharePost.setClickOnShareBtn();
        Thread.sleep(3000);
        sharePost.setTypeOnCommentsField("Happy Birthday to you");
        Thread.sleep(3000);
        sharePost.setClickOnShareButton();
        Thread.sleep(3000);
        Assert.assertEquals(getCurrentTitle(), "OrangeHRM");
        LOG.info("share post validation successful");

    }
}
