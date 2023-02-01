package test;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.Logo;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;

public class LogoTest extends CommonAPI {
    @Test

    public void logoMethod () throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setEmailField("hemalhemu7@gmail.com");
        Thread.sleep(3000);
        loginPage.setPassword("Hemal1703");
        Thread.sleep(3000);
        loginPage.setLoginButton();
        Thread.sleep(3000);
        Assert.assertEquals(getCurrentTitle(),"Cogmento CRM");
        LOG.info("login page validation successful");


        Logo logo = new Logo(getDriver());
        logo.setIcon();

    }

}
