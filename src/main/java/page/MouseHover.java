package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MouseHover extends CommonAPI {

    public MouseHover(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/a")
    WebElement popup;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/svg[1]/path[1]")
    WebElement ClickBtn;

    @FindBy (xpath = "//button[contains(text(),'Cancel')]")
    WebElement deleteBtn;
    public void setPopup (){
        clickOn(popup);  }

    public void setClickBtn(){
        clickOn(ClickBtn);
    }

    public void setDeleteBtn(){
        clickOn(deleteBtn);
    }


}
