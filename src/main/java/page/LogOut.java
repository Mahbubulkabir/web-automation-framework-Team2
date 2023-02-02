package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends CommonAPI {

    public LogOut(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[2]/div[2]/div")
    WebElement menuBar;

    @FindBy (xpath = "//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[5]")
    WebElement logOutBtn;

    public void setLogOutBtn (){
        clickOn(menuBar);
        clickOn(logOutBtn);

    }
}
