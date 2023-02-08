package page;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioBtn extends CommonAPI {
    Logger LOG = LogManager.getLogger(RadioBtn.class.getName());
    public RadioBtn(WebDriver driver){PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//body/div[@id='ui']/div[1]/div[1]/div[10]/a[1]/span[1]")
    WebElement clickOnEmailBtn;

    public void setClickOnEmailBtn (){
        clickOn(clickOnEmailBtn);
    }

    @FindBy (xpath = "///i[@class=\"checkmark box icon\"]")
    WebElement clickOnRadioBox;

    public void setClickOnRadioBox (){
     clickWithJavaScript(clickOnRadioBox);

    }

}
