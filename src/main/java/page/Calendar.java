package page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar extends CommonAPI {
    public Calendar(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"main-nav\"]/div[2]/a/i")
    WebElement calendar;

    public void setCalendar (){
        clickOn(calendar);
    }

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]/i")
    WebElement changeDate;

    public void setChangeDate(){
        clickOn(changeDate);
    }

}
