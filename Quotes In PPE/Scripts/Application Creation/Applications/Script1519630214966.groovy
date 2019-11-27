import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// STEP 1: Declaring variable for URL
String url = 'http://test.cogitate.us/PPE.Test/'

// STEP 2: Open an URL
WebUI.openBrowser(url)

// STEP 3: Waiting for Page
WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

// STEP 4: Maximize Window
WebUI.maximizeWindow()

// STEP 5: Assign variable for PROPERTYDATA Datafile
InternalData propertyDATAA = findTestData('Application-PPEPROPERTYDATA')

// STEP 6: Define an variable and assign total row count of PROPERTYDATA Datafile
int propertyDATARows = propertyDATAA.getRowNumbers()

// STEP 7: Assign variable for PPE_Config_File Datafile
InternalData genericDATAA = findTestData('PPE_Config_File')

// STEP 8: Define an variable and assign total row count of PPE_Config_File Datafile
int genericDATARows = genericDATAA.getRowNumbers()

// STEP 9: Define an username variable
String userName = ''

// STEP 10: Define an password variable
String password = ''

String isUsed = 'N'

// STEP 11: For loop for getting an Address, State
for (int propertyDataRowCounter = 0; propertyDataRowCounter < propertyDATARows; propertyDataRowCounter++) {
    try {
        isUsed = propertyDATAA.internallyGetValue('Is_Used', propertyDataRowCounter)

        // STEP 12 : Define an State variable 
        String State = propertyDATAA.internallyGetValue('State', propertyDataRowCounter)

        for (int configDataRowCounter = 0; configDataRowCounter < genericDATARows; configDataRowCounter++) {
            String agentState = genericDATAA.internallyGetValue('STATE', configDataRowCounter)

            if (agentState == State) {
                userName = genericDATAA.internallyGetValue('USERNAME', configDataRowCounter)

                password = genericDATAA.internallyGetValue('PASSWORD', configDataRowCounter)
            }
        }
        
        WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'), userName)

        // STEP 10: Entering PASSWORD from Data file in Password textfield
        WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'), password)

        // STEP 11: Clicking on LOGIN button
        WebUI.click(findTestObject('Quote OR/btn-LOGIN'))

        // Start Variables Declaration
        String Property_Address = propertyDATAA.internallyGetValue('Property_Address', propertyDataRowCounter)

        println(Property_Address)

        String propertyType = propertyDATAA.internallyGetValue('PropertyTypeID', propertyDataRowCounter)

        String constructionType = propertyDATAA.internallyGetValue('ConstructionTypeID', propertyDataRowCounter)

        String homeValuation = propertyDATAA.internallyGetValue('HomeValuation', propertyDataRowCounter)

        String homeBuildYear = propertyDATAA.internallyGetValue('HomeBuildYear', propertyDataRowCounter)

        String pFirstName = propertyDATAA.internallyGetValue('P_FirstName', propertyDataRowCounter)

        String pMiddelName = propertyDATAA.internallyGetValue('P_MiddelName', propertyDataRowCounter)

        String pLastName = propertyDATAA.internallyGetValue('P_LastName', propertyDataRowCounter)

        String contactNumber = propertyDATAA.internallyGetValue('ContactNumber', propertyDataRowCounter)

        String email = propertyDATAA.internallyGetValue('Email', propertyDataRowCounter)

        String pDOB = propertyDATAA.internallyGetValue('P_DOB', propertyDataRowCounter)

        String roofType = propertyDATAA.internallyGetValue('RoofTypeID', propertyDataRowCounter)

        String foundationType = propertyDATAA.internallyGetValue('FoundationTypeID', propertyDataRowCounter)

        String heatingType = propertyDATAA.internallyGetValue('HeatingTypeID', propertyDataRowCounter)

        // End Variables Declaration
        // Start TestObject Declaration
        // End TestObject Declaration
        WebUI.delay(5)

        WebUI.setText(findTestObject('Quote OR/txtfield_ADDRESS_ON_LANDING_PAGE'), Property_Address)

        // STEP 5: Clicking on SERACH ADDRESS button
        WebUI.click(findTestObject('Quote OR/btn_SEARCH_ADDRESS'))

        //Waiting
        WebUI.delay(4)

        if (isUsed == 'Y') {
            // STEP 26: EnClicking on SAVE & CONTINUE button on Policy Holder Info page
            WebUI.click(findTestObject('Application OR/btn_POLICYHOLDER_SAVEANDCONTINUE'))

            // Waiting
            WebUI.delay(5)

            // STEP 27: Clicking on ROOF TYPE dropdown on Property page
            WebUI.click(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'))

            // Waiting
            WebUI.delay(3)

            // STEP 28: Selecting ROOF TYPE as "Composition Shingles" on Property page
            WebUI.selectOptionByValue(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'), roofType, false)

            // Waiting
            WebUI.delay(2)

            // STEP 29: Selecting FOUNDATION TYPE as "Basement" on Property page
            WebUI.selectOptionByValue(findTestObject('Application OR/drp_FOUNDATIONTYPE_PROPERTYPAGE'), foundationType , false)

            // Waiting
            WebUI.delay(2)

            // STEP 30: Selecting HEATING TYPE as "Gas Heaters" on Property page
            WebUI.selectOptionByValue(findTestObject('Application OR/drp_HEATINGTYPE_PROPERTYPAGE'), heatingType, false)

            // Waiting
            WebUI.delay(5)

            // STEP 31: Clicking on SAVE & CONTINUE button on Property page
            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            // Waiting
            WebUI.delay(2)

            // STEP 32: Clicking on YES button of ROOF AGE confirmation popup
            WebUI.click(findTestObject('Application OR/btn_YES_ROOFAGE_POPUP'))

            // Waiting
            WebUI.delay(2)

            // STEP 33: Clicking on YES button of ELECTRICAL AGE confirmation popup
            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            // Waiting
            WebUI.delay(2)

            // STEP 34: Clicking on YES button of PLUMBING AGE confirmation popup
            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            // Waiting
            WebUI.delay(5)

            // STEP 35: Clicking on SAVE & CONTINUE button on Occupancy page
            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            // Waiting
            WebUI.delay(5) 
        } else {
            WebUI.selectOptionByIndex(findTestObject('Quote OR/drp_PROPERTY_TYPE'), propertyType)

            WebUI.setText(findTestObject('Quote OR/txtfield_HOME_VALUATION'), '')

            WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

            WebUI.selectOptionByIndex(findTestObject('Quote OR/drp_CONSTRUCTION_TYPE'), constructionType)

            WebUI.setText(findTestObject('Quote OR/txtfield_HOME_VALUATION'), homeValuation)

            WebUI.delay(2)

            WebUI.setText(findTestObject('Quote OR/txtbx_YEARHOMEBUILD'), '')

            WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

            WebUI.setText(findTestObject('Quote OR/txtbx_YEARHOMEBUILD'), homeBuildYear)

            WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Quote OR/btn_SENDQUOTE'))

            WebUI.delay(6)

            TestObject txtQuoteLastName = findTestObject('Quote OR/txtfield_SENDQUOTE_LASTNAME')

            WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_FIRSTNAME'), '')

            WebUI.setText(txtQuoteLastName, '')

            WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_CONTACTNUMBER'), '')

            WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_EMAIL'), '')

            WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_FIRSTNAME'), pFirstName)

            WebUI.setText(txtQuoteLastName, pLastName)

            WebUI.delay(1)

            WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_CONTACTNUMBER'), contactNumber)

            WebUI.delay(1)

            WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_EMAIL'), email)

            WebUI.delay(1)

            WebUI.click(findTestObject('Quote OR/btn_SEND_QUOTE_DETAILS'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Application OR/btn_TOAPPLICATION'))

            WebUI.delay(4)

            WebUI.click(findTestObject('Application OR/btn-YES_IS_BNESS_PREMISES'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn-YES_FOOT_TRAFFIC'))

            WebUI.delay(2)

            WebUI.setText(findTestObject('Application OR/txtfield-Traffic_Percentage'), '11')

            WebUI.delay(3)

            WebUI.click(findTestObject('Application OR/btn_CONTINUE_UW_QUESTIONS'))

            WebUI.delay(3)

            WebUI.setText(findTestObject('Application OR/txtfield-Traffic_Percentage'), '10')

            WebUI.delay(4)

            WebUI.click(findTestObject('Application OR/btn_CONTINUE_UW_QUESTIONS'))

            WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('Application OR/txtfield_INSURED_FIRSTNAME'))

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_FIRSTNAME'), '')

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_FIRSTNAME'), pFirstName)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_MIDDLENAME'), '')

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_MIDDLENAME'), pMiddelName)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_LASTNAME'), '')

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_LASTNAME'), pLastName)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_DOB'), pDOB)

            WebUI.delay(5)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_EMAIL'), email)

            WebUI.delay(5)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_CONTACTNUMBER'), contactNumber)

            WebUI.delay(5)

            TestObject hdnPolicyInfoId = findTestObject('Generic OR/hdnPolicyInfoId')

            String policyInfoid = WebUI.getAttribute(hdnPolicyInfoId, 'value')

            GlobalVariable.policyInfoId = policyInfoid

            WebUI.click(findTestObject('Application OR/btn_POLICYHOLDER_SAVEANDCONTINUE'))

            WebUI.delay(8)

            WebUI.click(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'))

            WebUI.delay(3)

            WebUI.selectOptionByValue(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'), roofType, false)

            WebUI.delay(2)

            WebUI.selectOptionByValue(findTestObject('Application OR/drp_FOUNDATIONTYPE_PROPERTYPAGE'), foundationType, false)

            WebUI.delay(2)

            WebUI.selectOptionByValue(findTestObject('Application OR/drp_HEATINGTYPE_PROPERTYPAGE'), heatingType, false)

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn_YES_ROOFAGE_POPUP'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            WebUI.delay(5)
        
        }
        // STEP 41: Clicking on LOGOUT button
        WebUI.click(findTestObject('Endorsement OR/btn_LOGOUT_UW'))

        WebUI.delay(10)
    
    }
    catch (Exception e) {
        e.printStackTrace()

        WebUI.click(findTestObject('Endorsement OR/btn_LOGOUT_UW'))

        WebUI.delay(10)
    } 
}