import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Declaring Variable
int propertyDataRowCounter = 0

int configDataRowCounter = 0

// Path of Data file created under DATA FILES
InternalData genericDATA = findTestData('PPE_Config_File')

// Path of Data file created under DATA FILES
InternalData propertyDATA = findTestData('PPEPROPERTYDATA')

// STEP 4: If condition for putting address in Address field
if (genericDATA.internallyGetValue('STATE', configDataRowCounter) == 'GA') {
    // STEP 16: Entering PROPERTY ADDRESS from Data file in Address textfield
    WebUI.setText(findTestObject('Quote_OR/txtfield_ADDRESS_ON_LANDING_PAGE'), propertyDATA.internallyGetValue('GA_Property_Address', 
            propertyDataRowCounter)) // STEP 17: Entering PROPERTY ADDRESS from Data file in Address textfield
    //Waiting Time
} else if (genericDATA.internallyGetValue('STATE', configDataRowCounter) == 'VA') {
    WebUI.setText(findTestObject('Quote_OR/txtfield_ADDRESS_ON_LANDING_PAGE'), propertyDATA.internallyGetValue('VA_Property_Address', 
            propertyDataRowCounter))

    WebUI.delay(6)
} else {
    WebUI.setText(findTestObject('Quote_OR/txtfield_ADDRESS_ON_LANDING_PAGE'), propertyDATA.internallyGetValue('VA_Property_Address', 
            propertyDataRowCounter))
}

// STEP 5: Clicking on SERACH ADDRESS button
WebUI.click(findTestObject('Quote_OR/btn_SEARCH_ADDRESS'))

// STEP 6: Waiting for Page
WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.PPE.QuotePropertyDataSelection.QuoteCreation'()