import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.InternalData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import groovy.time.TimeCategory

/*String url = 'http://test.cogitate.us/PPE.Test'

// STEP 1: Navigating to URL
WebUI.openBrowser(url)

// STEP 3: Maximize Window
WebUI.maximizeWindow()

// STEP 9: Entering USERNAME from Data files in Username textfield
WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), 'ih.william')

WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), '10#Hammer')

WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))

WebUI.delay(10)

WebUI.click(findTestObject('CANCELLATION_BY_UW/menu_CANCELLATION'))

// Waiting
WebUI.delay(4)

WebUI.click(findTestObject('Endorsement_OR/btn_YES_CONFIRMATION_ENDORSEMENT'))

WebUI.setText(findTestObject('Endorsement_OR/txtfield_POLICYNUMBER_FOR_ENDORSEMENT'), 'BCIHGA1895034')

// Waiting
WebUI.delay(6)

// STEP 9: Clicking on SEARCH button
WebUI.click(findTestObject('Endorsement_OR/btn_SEARCH_FOR_ENDORSEMENT'))

// Waiting
WebUI.delay(10)

WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_CANCEL_POLICY'))

// Waiting
WebUI.delay(6)

use(TimeCategory, { 
        today = new Date()

        NextWeek = (today + 1.week)

        NextMonth = (today + 1.month)

        // STEP 24: Printing NCurrent date + 7 days date
        println('NextMonth -- ' + NextMonth.format('MM/dd/yyyy'))

        println('NextWeek -- ' + NextWeek.format('MM/dd/yyyy'))

        String cancellationEffectivedate = NextMonth.format('MM/dd/yyyy')

        println(cancellationEffectivedate)

        WebUI.delay(6)

        WebUI.click(findTestObject('CANCELLATION_BY_UW/txtfield_CANCELLATION_EFFECTIVE_DATE'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('CANCELLATION_BY_UW/txtfield_CANCELLATION_EFFECTIVE_DATE'), cancellationEffectivedate)

        WebUI.delay(5)

        WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_SUBMIT_CANCELLATION'))

        WebUI.delay(15)

        WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_APPROVE_CANCELLATION'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Endorsement_OR/btn_YES_CONFIRMATION_ENDORSEMENT'))

        WebUI.delay(20)

        // STEP 41: Clicking on LOGOUT button
        WebUI.click(findTestObject('Endorsement_OR/btn_LOGOUT_UW'))
    })
*/


int propertyDataRowCounter = 0
InternalData propertyDATA = findTestData("PPEPROPERTYDATA")
	int num = propertyDATA.getRowNumbers()
	println num;

	
	for(int i=0;i<=num;i++)
{
	propertyDataRowCounter = i;
	String str = propertyDATA.internallyGetValue("NC_Property_Address", propertyDataRowCounter)
	println str
}