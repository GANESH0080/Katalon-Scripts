import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.InternalData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Path of Data file created under DATA FILES
InternalData data = findTestData("Get_Data_Using_Script")

// STEP 2 : Navigating to URL
WebUI.openBrowser(data.internallyGetValue(2, 0))

// STEP 3 : Maximize Window
WebUI.maximizeWindow()

for (def index : (0..data.getRowNumbers() - 1))

String state = new String();
state = data.internallyGetValue(0, 0)


println "State is" +" " +state

if (state == 'GA')
{
       // STEP 4 : Entering USERNAME in Username textfield
       WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), 'ih.chelms')

       // STEP 5 : Entering PASSWORD in Password textfield
       WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), '10#Hammer')

       // STEP 6 : Clicking on LOGIn button
       WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))
       }
else
{
	// STEP 7 : Entering USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), 'ih.jbutler')
	
	// STEP 8 : Entering PASSWORD in Password textfield
	WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), '10#Hammer')
	
	// STEP 5 : Clicking on LOGIn button
	WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))
	
	
}

 if (state == 'GA')
 {
	 WebUI.setText(findTestObject('Quote_OR/txtfield_PropertyAddress'), data.internallyGetValue(1, 1))
 }
else
{
	
	WebUI.delay(6)
	WebUI.setText(findTestObject('Quote_OR/txtfield_PropertyAddress'), data.internallyGetValue(1, 0))
	WebUI.delay(6)
}