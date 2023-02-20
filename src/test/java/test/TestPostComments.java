package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PostComments;
import utility.ReadFromExcel;
import utility.Utility;

public class TestPostComments extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestPostComments.class.getName());
    ReadFromExcel read = new ReadFromExcel("C:\\Users\\munna\\InteliiJ\\webAutomationFinalExamMMK\\data\\data.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");
    String comments= Utility.getProperties().getProperty("comment.post");

    @Test
    public void postCommentsAndLikeIt() throws InterruptedException {
        PostComments postComments = new PostComments(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName(username);
        logInPage.typePassword(password);
        logInPage.setClickOnLogInBtm();

        postComments.setClickOnBuzzBtn();
        postComments.setTypeCommentsField(comments);
        postComments.setClickOnPostBtn();
        Thread.sleep(3000);
        String expectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz";
        Assert.assertEquals(getURL(),expectedUrl);
        LOG.info("comments and like page validation success");
    }
}
