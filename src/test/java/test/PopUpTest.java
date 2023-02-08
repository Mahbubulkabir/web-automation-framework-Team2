package test;

import base.CommonAPI;
import org.testng.annotations.Test;
import page.LoginPage;
import page.PopUp;

public class PopUpTest extends CommonAPI {
    @Test
    public void popupMethod() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setEmailField("hemalhemu7@gmail.com");
        loginPage.setPassword("Hemal1703");
        loginPage.setLoginButton();

        PopUp popUp = new PopUp(getDriver());
        popUp.setAlarmBtn();
     //   popUp.setUnsubBtn();
        popUp.setSubBtn();

        Thread.sleep(4000);
    }

}
