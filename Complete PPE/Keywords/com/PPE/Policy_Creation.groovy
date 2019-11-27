package com.PPE

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.InternalData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class Policy_Creation
{
	@Keyword
	def ApplicationBind()
	{
	
		int propertyDataRowCounter = 0;
		int configDataRowCounter = 0;
		
		// Path of Data file created under DATA FILES
		InternalData genericDATA = findTestData("PPE_Config_File")
		InternalData propertyDATA = findTestData("PPEPROPERTYDATA")
		
		// STEP 35: Clicking on SAVE & CONTINUE button on Occupancy page
		WebUI.click(findTestObject('Application_OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))
		
		// Waiting
		WebUI.delay(5)
		
		// STEP 36: Checking Agreement checkbox on Coverage page
		WebUI.check(findTestObject('Application_OR/chkbx_AGREEMENT'))
		
		// Waiting
		WebUI.delay(10)
		
		// STEP 37: Clicking on SAVE & CONTINUE button on Coverage page
		WebUI.click(findTestObject('Application_OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))
		
		// Waiting
		WebUI.delay(5)
		
		// STEP 38: Clicking on SIGN APPLICATION button on Application summary page
		WebUI.click(findTestObject('Application_OR/btn_SIGNAPPLICATION_AGENT'))
		
		// Waiting
		WebUI.delay(5)
		
		String getInsuredName= WebUI.getText(findTestObject('Application_OR/get_INSUREDNAME_APPLICATION FORMSUMMARY'))
		
		println getInsuredName
		
		// STEP 39: Clicking on INSURED SIGNATURE button on Application Form Summary page
		WebUI.click(findTestObject('Application_OR/btn_INSURED_SIGNATURE'))
		
		// Waiting
		WebUI.delay(5)
		
		// STEP 40: Clicking on textfield INSURED SIGNATURE on Insured Signature popup
		WebUI.click(findTestObject('Application_OR/txtbx_INSURED_SIGNATURE'))
		
		// Waiting
		WebUI.delay(5)
		
		// STEP 41: Entering Insured Singature
		WebUI.setText(findTestObject('Application_OR/txtbx_INSURED_SIGNATURE'), getInsuredName)
		
		// STEP 42: Clicking on SUBMIT button after filling Insured Signature
		WebUI.click(findTestObject('Application_OR/btn_SUBMIT_INSURED_SIGNATURE'))
		
		
		
		
	}}