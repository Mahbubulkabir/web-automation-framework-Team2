package testapartment;

import homepkg.HomePage;
import homepkg.CreateACpage;
import org.testng.annotations.Test;

public class TestCreateAC extends HomePage {
    @Test
    public void testMethod() {
        CreateACpage createACpage = new CreateACpage();

        createACpage.setClickSign();
        createACpage.setFirstName();
        createACpage.setLastName();
        createACpage.setEmali();
        createACpage.setChekBox();
        createACpage.setClicksignInBtn();


    }

}
