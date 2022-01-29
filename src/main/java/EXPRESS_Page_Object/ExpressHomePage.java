package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpressHomePage extends Reusable_Annotations {

    ExtentTest logger;
    public ExpressHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']")
    WebElement WomenTab;
    @FindBy(xpath = "//*[text()='Dresses']")
    WebElement DressesLink;

    //Create a pom method to HOVER on Women's tab
    public void HoverOnWomensTab() {
        Reusable_Actions_Loggers_POM.mouseHover(driver, WomenTab, logger, "Women's Tab");
    }//end of method

    //Create a pom method to click on dresses link
    public void ClickonDressesLink() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,DressesLink,logger, "Dresses link");
    }//end of method




}//end of java method
