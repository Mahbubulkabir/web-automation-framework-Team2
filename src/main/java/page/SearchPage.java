package page;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage extends CommonAPI {
    Logger LOG= LogManager.getLogger(SearchPage.class.getName());

    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // object(web element)
    @FindBy (xpath = "//body/div[@id='ui']/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
    public WebElement searchBox;


    public void setSearchBox(String text){
        typeAndEnter(searchBox,text);
    }


}

