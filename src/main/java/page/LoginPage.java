package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement emailField;
    @FindBy(xpath = "//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
    WebElement passwordField;
     @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement loginButton;



    public void setEmailField(String text){
    type(emailField,text);
    }
    public void setPassword(String text){
        type(passwordField,text);
    }

    public void setLoginButton(){
        clickOn(loginButton);
    }

}
