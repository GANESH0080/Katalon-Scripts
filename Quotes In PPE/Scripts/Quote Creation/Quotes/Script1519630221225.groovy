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
InternalData propertyDATA = findTestData('Quote-PPEPROPERTYDATA')

// STEP 6: Define an variable and assign total row count of PROPERTYDATA Datafile
int propertyDATARows = propertyDATA.getRowNumbers()

// STEP 7: Assign variable for PPE_Config_File Datafile
InternalData genericDATA = findTestData('PPE_Config_File')

// STEP 8: Define an variable and assign total row count of PPE_Config_File Datafile
int genericDATARows = genericDATA.getRowNumbers()

// STEP 9: Define an username variable
String userName = ''

// STEP 10: Define an password variable
String password = ''

String isUsed = 'N'

// STEP 11: For loop for getting an Address, State
for (int propertyDataRowCounter = 0; propertyDataRowCounter < propertyDATARows; propertyDataRowCounter++) { 
	try {
	isUsed = propertyDATA.internallyGetValue('Is_Used', propertyDataRowCounter)

    // STEP 12 : Define an State variable 
    String State = propertyDATA.internallyGetValue('State', propertyDataRowCounter)

    for (int configDataRowCounter = 0; configDataRowCounter < genericDATARows; configDataRowCounter++) {
        String agentState = genericDATA.internallyGetValue('STATE', configDataRowCounter)

        if (agentState == State) {
            userName = genericDATA.internallyGetValue('USERNAME', configDataRowCounter)

            password = genericDATA.internallyGetValue('PASSWORD', configDataRowCounter)
        }
    }
    
    WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'), userName)

    // STEP 10: Entering PASSWORD from Data file in Password textfield
    WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'), password)

    // STEP 11: Clicking on LOGIn button
    WebUI.click(findTestObject('Quote OR/btn-LOGIN'))

    // Start Variables Declaration
    String Property_Address = propertyDATA.internallyGetValue('Property_Address', propertyDataRowCounter)

    println(Property_Address)

    String propertyType = propertyDATA.internallyGetValue('PropertyTypeID', propertyDataRowCounter)

    String constructionType = propertyDATA.internallyGetValue('ConstructionTypeID', propertyDataRowCounter)

    String homeValuation = propertyDATA.internallyGetValue('HomeValuation', propertyDataRowCounter)

    String homeBuildYear = propertyDATA.internallyGetValue('HomeBuildYear', propertyDataRowCounter)

    String pFirstName = propertyDATA.internallyGetValue('P_FirstName', propertyDataRowCounter)

    String pLastName = propertyDATA.internallyGetValue('P_LastName', propertyDataRowCounter)

    String contactNumber = propertyDATA.internallyGetValue('ContactNumber', propertyDataRowCounter)

    String email = propertyDATA.internallyGetValue('Email', propertyDataRowCounter)

    // End Variables Declaration
    // Start TestObject Declaration
    // End TestObject Declaration
    WebUI.delay(5)

    WebUI.setText(findTestObject('Quote OR/txtfield_ADDRESS_ON_LANDING_PAGE'), Property_Address)

    // STEP 5: Clicking on SERACH ADDRESS button
    WebUI.click(findTestObject('Quote OR/btn_SEARCH_ADDRESS'))

    // STEP 6: Waiting for Page
    WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)

    // STEP 20: Selecting PROPERTY TYPE as "Single Family" from Data files
    WebUI.selectOptionByIndex(findTestObject('Quote OR/drp_PROPERTY_TYPE'), propertyType)

    // STEP 21: Clearing HOME VALUATION
    WebUI.setText(findTestObject('Quote OR/txtfield_HOME_VALUATION'), '')

    // STEP 26: Clicking on GET QUOTE button
    WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

    // STEP 22: Selecting Construction Type as "Masonary" from Data files
    WebUI.selectOptionByIndex(findTestObject('Quote OR/drp_CONSTRUCTION_TYPE'), constructionType)

    // STEP 23: Entering Home Valuation from Data files
    WebUI.setText(findTestObject('Quote OR/txtfield_HOME_VALUATION'), homeValuation)

    //Waiting
    WebUI.delay(2)

    // STEP 24: Clearing HOME BUILD year
    WebUI.setText(findTestObject('Quote OR/txtbx_YEARHOMEBUILD'), '')

    // STEP 26: Clicking on GET QUOTE button
    WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

    // STEP 25: Entering home Build year from Data files
    WebUI.setText(findTestObject('Quote OR/txtbx_YEARHOMEBUILD'), homeBuildYear)

    // STEP 26: Clicking on GET QUOTE button
    WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

    //Waiting
    WebUI.delay(4)

    if (isUsed == 'Y') {
        // STEP 26: Clicking on GET QUOTE button
        WebUI.click(findTestObject('Quote OR/btn-Recalculate'))
    }
    
    WebUI.delay(6)

    // STEP 27: Clicking on SENT QUOTE button
    WebUI.click(findTestObject('Quote OR/btn_SENDQUOTE'))

    // Waiting
    WebUI.delay(6)

    TestObject txtQuoteLastName = findTestObject('Quote OR/txtfield_SENDQUOTE_LASTNAME')

    WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_FIRSTNAME'), '')

    WebUI.setText(txtQuoteLastName, '')

    WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_CONTACTNUMBER'), '')

    WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_EMAIL'), '')

    // STEP 28: Entering FIRSTNAME in Sent Quote popup
    WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_FIRSTNAME'), pFirstName)

    // STEP 17: Entering LASTNAME in Sent Quote popup
    WebUI.setText(txtQuoteLastName, pLastName)

    //Waiting
    WebUI.delay(1)

    // STEP 18: Entering CONTACT NUMBER in Sent Quote popup
    WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_CONTACTNUMBER'), contactNumber)

    //Waiting
    WebUI.delay(1)

    // STEP 19: Entering EMAIL in Sent Quote popup
    WebUI.setText(findTestObject('Quote OR/txtfield_SENDQUOTE_EMAIL'), email)

    //Waiting
    WebUI.delay(1)

    // STEP 20: Clicking on SENT QUOTE DETAILS button
    WebUI.click(findTestObject('Quote OR/btn_SEND_QUOTE_DETAILS'))

    //Waiting
    WebUI.delay(8)

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