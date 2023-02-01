package test;

import base.CommonAPI;
import org.testng.annotations.Test;
import page.LoginPage;
import page.MouseHover;

import javax.swing.*;

public class MouseHoverTest extends CommonAPI {
@Test
   public void popupMethod () throws InterruptedException {
       LoginPage loginPage = new LoginPage(getDriver());
       loginPage.setEmailField("hemalHemu7@gmail.com");
       loginPage.setPassword("Hemal1703");
       loginPage.setLoginButton();

    MouseHover popUp = new MouseHover(getDriver());
    popUp.setPopup();
    popUp.setClickBtn();
    Thread.sleep(3000);
    popUp.setDeleteBtn();
    Thread.sleep(4000);





   }
}
