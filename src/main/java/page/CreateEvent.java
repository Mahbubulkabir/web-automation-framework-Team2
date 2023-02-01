package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEvent extends CommonAPI {

    public CreateEvent(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Calendar')]")
    WebElement clickOnCalender;
    @FindBy(xpath = "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
    WebElement clickOnCreate;
    @FindBy(xpath = "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement clickOnTitleField;
    @FindBy(xpath = "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
    WebElement clickOnSaveButton;

    //reusable method
    public void setClickOnCalender(){
       clickOn(clickOnCalender);
    }
    public void setClickOnCreate(){
        clickOn(clickOnCreate);
    }
    public void setClickOnTitleField(String text){
        type(clickOnTitleField,text);
    }
    public void setClickOnSaveButton(){
        clickOn(clickOnSaveButton);
    }
}
