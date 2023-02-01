package testapartment;

import homepkg.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

   @Test
    public void testMethod(){          // method

        HomePage homePage = new HomePage();
        homePage.clickBtn();
        homePage.dropDown();
        homePage.dropDown2();

    }


}
