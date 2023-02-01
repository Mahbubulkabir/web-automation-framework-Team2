package homepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateACpage extends HomePage{
    @FindBy(xpath = "//*[@id=\"headerLoginSection\"]/a[2]")
    public WebElement clickSignIn;

    @FindBy(id ="signupFirstName")
    public WebElement firstName;

    @FindBy(id = "signupLastName")
    public WebElement lastName;

    @FindBy(id = "signupEmail")
    public WebElement emali;

    @FindBy(xpath = "//*[@id=\'signupIndustryProfessional\']")
    public WebElement checkBox;
@FindBy(id = "signupBtn")
public WebElement clicksignInBtn;


   public CreateACpage(){PageFactory.initElements(driver,this);}

    public void setClickSign(){
       clickOnElement(clickSignIn);
    }
    public void setFirstName (){
       sendKeysToElement(firstName,"HABIBUR");
    }

    public void setLastName(){
       sendKeysToElement(lastName,"RAHMAN");
    }
    public void setEmali(){
       sendKeysToElement(emali,"hemalhemu7@gmail.com");
    }
    public void setChekBox(){
       safeClickOnElement(checkBox);
    }
    public void setClicksignInBtn(){ safeClickOnElement(clicksignInBtn);       }

}
