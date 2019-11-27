package com.PPE

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.testdata.InternalData

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class Saving_PropertyInfo_Page 


{
	@Keyword
	def PropertyPage()
	{
		int propertyDataRowCounter = 0;
		InternalData propertyDATA = findTestData("PPEPROPERTYDATA")
	// STEP 27: Clicking on ROOF TYPE dropdown on Property page
	WebUI.click(findTestObject('Application_OR/drp_ROOFTYPE_PROPERTYPAGE'))
	
	// Waiting
	WebUI.delay(3)
	
	// STEP 28: Selecting ROOF TYPE as "Composition Shingles" on Property page
	WebUI.selectOptionByIndex(findTestObject('Application_OR/drp_ROOFTYPE_PROPERTYPAGE'), propertyDATA.internallyGetValue("App_RoofTypeID1" , propertyDataRowCounter))
	
	// Waiting
	WebUI.delay(2)
	
	// STEP 29: Selecting FOUNDATION TYPE as "Basement" on Property page
	WebUI.selectOptionByIndex(findTestObject('Application_OR/drp_FOUNDATIONTYPE_PROPERTYPAGE'), propertyDATA.internallyGetValue("App_FoundationTypeID3" , propertyDataRowCounter))
	
	// Waiting
	WebUI.delay(2)
	
	// STEP 30: Selecting HEATING TYPE as "Gas Heaters" on Property page
	WebUI.selectOptionByIndex(findTestObject('Application_OR/drp_HEATINGTYPE_PROPERTYPAGE'), propertyDATA.internallyGetValue("App_HeatingTypeID7" , propertyDataRowCounter))
	
	// Waiting
	WebUI.delay(5)
	
	// STEP 31: Clicking on SAVE & CONTINUE button on Property page
	WebUI.click(findTestObject('Application_OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 32: Clicking on YES button of ROOF AGE confirmation popup
	WebUI.click(findTestObject('Application_OR/btn_YES_ROOFAGE_POPUP'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 33: Clicking on YES button of ELECTRICAL AGE confirmation popup
	WebUI.click(findTestObject('Application_OR/btn_YES_ELECTRICALAGE_POPUP'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 34: Clicking on YES button of PLUMBING AGE confirmation popup
	WebUI.click(findTestObject('Application_OR/btn_YES_ELECTRICALAGE_POPUP'))
	
	// Waiting
	WebUI.delay(5)
}
}