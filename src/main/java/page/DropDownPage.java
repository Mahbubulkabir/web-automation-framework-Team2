package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage extends CommonAPI {

    public DropDownPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[2]/div[2]/div")
    WebElement menuBar;

    public void setMenuBar (){
        clickOn(menuBar); }

    @FindBy (xpath = "//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[3]")
    WebElement impotBar;

    public void setImpotBar (){
        clickOn(impotBar); }




}
