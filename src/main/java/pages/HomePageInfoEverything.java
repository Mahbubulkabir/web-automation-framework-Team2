package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // object(web element)
    @FindBy(xpath = "//a[contains(text(),'Emergency Contacts')]")
    WebElement clickOnEmergencyConBtm;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
    WebElement clickOnMyInfoBtm;

     @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
     WebElement clickOnAddBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement nameField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement relationshipField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement homePhoneField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement mobileField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]")
    WebElement workTelephoneField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[2]")
    WebElement clickOnSaveBtn;

    // reusable method

    public void typeName(String text){
        type(nameField, text);
    }
    public void typeRelationship(String text){
        type(relationshipField, text);
    }
    public void typeHomePhone(String text){
        type(homePhoneField, text);
    }
    public void typeMobile(String text){
        type(mobileField, text);
    }
    public void typeWorkPhone(String text){
        type(workTelephoneField, text);
    }
    public void  setClickOnAddBtn(){
        clickOn(clickOnAddBtn);
    }

    public void setClickOnMyInfoBtm() {
        clickOn(clickOnMyInfoBtm);
        LOG.info("click on my info success");
    }
    public void setClickOnEmergencyConBtm(){
        clickOn(clickOnEmergencyConBtm);
    }
    public void setClickOnSaveBtn(){
        clickOn(clickOnSaveBtn);
    }
}