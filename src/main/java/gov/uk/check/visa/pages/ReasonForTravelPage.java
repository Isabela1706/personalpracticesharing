package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//input[@value='work']")
    WebElement reasonForVisitList;


    @CacheLookup
    @FindBy(xpath = "//input[@value='family']")
    WebElement reasonForVisitListColombia;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;



    public void selectReasonForVisit(String reason){
        clickOnElement(reasonForVisitList);
        clickOnElement(reasonForVisitListColombia);
        Reporter.log("Click" + reasonForVisitList.toString());
        CustomListeners.test.log(Status.PASS, "Click" + reasonForVisitList);

    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        Reporter.log("Click" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click" + nextStepButton);

    }
}
