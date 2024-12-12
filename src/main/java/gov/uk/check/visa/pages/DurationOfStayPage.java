package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {



    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath =  "//input[@value='six_months_or_less']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;





    public void selectLengthOfStay(String moreOrLess){
        switch (moreOrLess.toLowerCase()){
            case"longer than 6 months":
                clickOnElement(lessThanSixMonths);
                System.out.println("The stay is longer then 6 Months");
                break;

            case"6 months or less":
                clickOnElement(moreThanSixMonths);
                System.out.println("The stay is shorter then 6 Months");
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
