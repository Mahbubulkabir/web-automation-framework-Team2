package test;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LogOut;
import page.LoginPage;

@Test
public class LogOutTest extends CommonAPI {

    public void logoutMethod() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setEmailField("hemalhemu7@gmail.com");
        loginPage.setPassword("Hemal1703");
        loginPage.setLoginButton();

        LogOut logOut = new LogOut(getDriver());
        logOut.setLogOutBtn();
        Thread.sleep(5000);

    }

}
