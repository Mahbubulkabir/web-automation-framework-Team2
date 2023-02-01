package test;

import base.CommonAPI;
import org.testng.annotations.Test;
import page.LoginPage;
import page.SearchPage;

public class SearchTest extends CommonAPI {
    @Test
    public void testMethod() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setEmailField("hemalHemu7@gmail.com");
        loginPage.setPassword("Hemal1703");
        loginPage.setLoginButton();

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.setSearchBox("contact");
        Thread.sleep(3000);

    }


}
