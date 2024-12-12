package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {


    @CacheLookup
    @FindBy(id  = "response-0")
    WebElement yes;

    @CacheLookup
    @FindBy(id  = "response-1")
    WebElement no;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;



    public void selectImmigrationStatus(String status){
        switch (status.toLowerCase()){
            case"click on yes":
                clickOnElement(yes);
                System.out.println("Valid Status");
                break;

            case"click on no":
                clickOnElement(no);
                System.out.println("Invalid Status");
                break;

            default:
                System.out.println("Invalid Input");
        }

    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        Reporter.log("Click" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click" + nextStepButton);

    }

}
