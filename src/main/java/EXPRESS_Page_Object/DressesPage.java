package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends Reusable_Annotations {
    ExtentTest loggers;
    public DressesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.loggers = Reusable_Annotations.logger;
    }//end of constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@class='cdS1D9eKI7bXTMHp5xeAA']")
    WebElement ClickDress;
    //@FindBy(xpath = "//*[text()='"+SIZE+"']")
    WebElement size;
    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddToBag;

    //Create a pom method to click on dress
    public void ClickOnDress(){
        Reusable_Actions_Loggers_POM.multipleClick(driver,ClickDress,1,logger,"Click on Dress");
    }//end of method
    //Create a pom method to select size





}
