package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {



    @CacheLookup
    @FindBy(id  = "response-0")
    WebElement selectJobtypeList;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;




    public void selectJobType(String job){
        clickOnElement(selectJobtypeList);
        Reporter.log("Click" + selectJobtypeList.toString());
        CustomListeners.test.log(Status.PASS, "Click" + selectJobtypeList);

    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        Reporter.log("Click" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click" + nextStepButton);

    }
}
