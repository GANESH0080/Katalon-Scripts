package com.PPE

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.InternalData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Login {

	@Keyword
	def correctlogin() {
		// Declaring Variable
		int propertyDataRowCounter = 0;

		// Path of Data file created under DATA FILES
		InternalData genericDATA = findTestData("PPE_Config_File")

		// Path of Data file created under DATA FILES
		InternalData propertyDATA = findTestData("PPEPROPERTYDATA")

		for (def configDataRowCounter : (0..genericDATA.getRowNumbers() - 1))
		{


			// STEP 5: Creating Object
			String state = new String();

			// STEP 6: Assigning value for created object
			state = genericDATA.internallyGetValue("STATE", configDataRowCounter)

			// STEP 7: Printing Object
			println "State is" +" " +state

			// STEP 8: If condition for Login
			if (state == 'GA')
			{
				// STEP 9: Entering USERNAME from Data files in Username textfield
				WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'),genericDATA.internallyGetValue("GA_USERNAME", configDataRowCounter))

				// STEP 10: Entering PASSWORD from Data file in Password textfield
				WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'),genericDATA.internallyGetValue("PASSWORD", configDataRowCounter))

				// STEP 11: Clicking on LOGIn button
				WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))
			}
			else if (state == 'VA')
			{
				// STEP 12: Entering USERNAME from Data file in Username textfield
				WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'),genericDATA.internallyGetValue("VA_USERNAME", configDataRowCounter))

				// STEP 13: Entering PASSWORD from Data file in Password textfield
				WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'),genericDATA.internallyGetValue("PASSWORD", configDataRowCounter))

				// STEP 14: Clicking on LOGIn button
				WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))
			}
			else
			{
				// STEP 12: Entering USERNAME from Data file in Username textfield
				WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'),genericDATA.internallyGetValue("NC_USERNAME", configDataRowCounter))

				// STEP 13: Entering PASSWORD from Data file in Password textfield
				WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'),genericDATA.internallyGetValue("PASSWORD", configDataRowCounter))

				// STEP 14: Clicking on LOGIn button
				WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))
			}
		}
	}
}
