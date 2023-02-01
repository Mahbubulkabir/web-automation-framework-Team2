package homepkg;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BasePage {

    @FindBy(id = "headerMenuLabel")
    public WebElement signInBtn;

    @FindBy(id = "menuSectionLink")
    public WebElement clickElement;

    @FindBy (xpath = "//*[@id=\"menuNavItemContainer2\"]/ul/li[3]/a")
    public WebElement clkElmt;
    public HomePage(){PageFactory.initElements(driver,this);}     // constructor

    public void clickBtn(){

       clickOnElement(signInBtn);
    }
    public void dropDown (){
        clickOnElement(clickElement);}

    public void dropDown2 (){
        safeClickOnElement(clkElmt);}

}
