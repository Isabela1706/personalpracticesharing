package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[@rel='nofollow']")
    WebElement clickOnStart;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueTab;


    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonVisit;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStep;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement noNeedOfVisa;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement clickOnCheckBox;



    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement visaMessage;


    @CacheLookup
    @FindBy(id = "response-1")
    WebElement howLongLonger;













    public void clickOnStartButton(){
        clickOnElement(clickOnStart);
        Reporter.log("Click" + clickOnStart.toString());
        CustomListeners.test.log(Status.PASS, "Click" + clickOnStart);
    }


    public void clickOnContinueButton(){
        clickOnElement(continueTab);
        Reporter.log("Click" + continueTab.toString());
        CustomListeners.test.log(Status.PASS, "Click" + continueTab);
    }

    public void selectReasonForVisit(String reason){
        clickOnElement(reasonVisit);
        Reporter.log("Click" + reasonVisit.toString());
        CustomListeners.test.log(Status.PASS, "Click" + reasonVisit);
    }

    public void clickOnNextStep(){
        clickOnElement(nextStep);
        Reporter.log("Click" + nextStep.toString());
        CustomListeners.test.log(Status.PASS, "Click" + nextStep);
    }

    public String getNoNeedVisaReq() {
        Reporter.log("get " + noNeedOfVisa.toString());
        CustomListeners.test.log(Status.PASS, "get " + noNeedOfVisa.toString());
        return getTextFromElement(noNeedOfVisa);

    }
    public void selectReasonForVisitUK(String reason){
        clickOnElement(clickOnCheckBox);
        Reporter.log("Click" + clickOnCheckBox.toString());
        CustomListeners.test.log(Status.PASS, "Click" + clickOnCheckBox);
    }

    public void selectHowLongStay(String duration){
        clickOnElement(howLongLonger);
        Reporter.log("Click" + howLongLonger.toString());
        CustomListeners.test.log(Status.PASS, "Click" + howLongLonger);
    }


    public void selectProfession(String profession){
        clickOnElement(clickOnCheckBox);
        Reporter.log("Click" + clickOnCheckBox.toString());
        CustomListeners.test.log(Status.PASS, "Click" + clickOnCheckBox);
    }

    public String getNeedVisaReq() {
        Reporter.log("get " + visaMessage.toString());
        CustomListeners.test.log(Status.PASS, "get " + visaMessage.toString());
        return getTextFromElement(visaMessage);

    }


}
