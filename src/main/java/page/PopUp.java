package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUp extends CommonAPI {
    public PopUp(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class=\"onesignal-bell-launcher-button\"]")
    WebElement alarmBtn;

    @FindBy(xpath = "//button[@id='subscribe-button']")
    WebElement subBtn;

    @FindBy (xpath = "//button[@id='unsubscribe-button']")
    WebElement unsubBtn;

    public void setAlarmBtn(){

        clickOn(alarmBtn);
    }

    public void setSubBtn(){
        clickOn(subBtn);
    }

	@FindBy(css="")
	private WebElement webElement;
    public void setUnsubBtn(){
        clickOn(unsubBtn);
    }


}
