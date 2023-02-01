package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Logo extends CommonAPI {
    public Logo(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy( xpath= "//*[@id=\"top-header-menu\"]/div[1]")
    WebElement icon;

    public void setIcon(){
        icon.isDisplayed();
    }

}
