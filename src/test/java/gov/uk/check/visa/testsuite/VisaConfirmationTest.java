package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends BaseTest {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }



    @Test
    public void anAustralianCominToUKForTourism(){


        //Click on start button
        startPage.clickOnStartButton();


        //Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");


        //Click on Continue button
        selectNationalityPage.clickNextStepButton();


        //Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");


        //Click on Continue button
        reasonForTravelPage.clickNextStepButton();


//        //verify result 'You will not need a visa to come to the UK'
//        Assert.assertEquals(startPage.getNoNeedVisaReq(), "You will not need a visa to come to the UK");

    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){



        //Click on start button
        startPage.clickOnStartButton();

        //Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");

        //Click on Continue button
       selectNationalityPage.clickNextStepButton();

        //Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");

        //Click on Continue button
        reasonForTravelPage.clickNextStepButton();


        //Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("longer than 6 months");


        //Click on Continue button
        durationOfStayPage.clickNextStepButton();


        //Select have planning to work for 'Health and care professional'
        workTypePage.selectJobType("Health and care professional");

        //Click on Continue button
        workTypePage.clickNextStepButton();

//        //verify result 'You need a visa to work in health and care'
//        Assert.assertEquals(startPage.getNeedVisaReq(), "You need a visa to work in health and care");


    }
    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){


        //Click on start button
        startPage.clickOnStartButton();

        //Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality("Colombia");

        //Click on Continue button
        selectNationalityPage.clickNextStepButton();


        //Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");

        //Click on Continue button
        reasonForTravelPage.clickNextStepButton();

        //Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.selectImmigrationStatus("yes");

        //Click on Continue button
        familyImmigrationStatusPage.clickNextStepButton();


        //verify result 'You’ll need a visa to join your family or partner in the UK'
       // Assert.assertEquals(startPage.getNeedVisaReq(), "You need a visa to work in health and care");




    }
}
