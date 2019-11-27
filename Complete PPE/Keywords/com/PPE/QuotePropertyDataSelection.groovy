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

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testdata.InternalData

public class QuotePropertyDataSelection {

	@Keyword
	def QuoteCreation() {
		int propertyDataRowCounter = 0;

		// Path of Data file created under DATA FILES
		InternalData propertyDATA = findTestData("PPEPROPERTYDATA")

		// STEP 20: Selecting PROPERTY TYPE as "Single Family" from Data files
		WebUI.selectOptionByIndex(findTestObject('Quote_OR/drp_PROPERTY_TYPE'), propertyDATA.internallyGetValue("PropertyTypeID1", propertyDataRowCounter))

		// STEP 21: Clearing HOME VALUATION
		WebUI.setText(findTestObject('Quote_OR/txtfield_HOME_VALUATION'), '')

		// STEP 26: Clicking on GET QUOTE button
		WebUI.click(findTestObject('Quote_OR/btn_GETQUOTE'))

		// STEP 22: Selecting Construction Type as "Masonary" from Data files
		WebUI.selectOptionByIndex(findTestObject('Quote_OR/drp_CONSTRUCTION_TYPE'), propertyDATA.internallyGetValue("ConstructionTypeID2", propertyDataRowCounter))

		// STEP 23: Entering Home Valuation from Data files
		WebUI.setText(findTestObject('Quote_OR/txtfield_HOME_VALUATION'), propertyDATA.internallyGetValue("HomeValuation", propertyDataRowCounter))

		//Waiting
		WebUI.delay(2)

		// STEP 24: Clearing HOME BUILD year
		WebUI.setText(findTestObject('Quote_OR/txtbx_YEARHOMEBUILD'), '')

		// STEP 26: Clicking on GET QUOTE button
		WebUI.click(findTestObject('Quote_OR/btn_GETQUOTE'))

		// STEP 25: Entering home Build year from Data files
		WebUI.setText(findTestObject('Quote_OR/txtbx_YEARHOMEBUILD'), propertyDATA.internallyGetValue("HomeBuildYear", propertyDataRowCounter))

		// STEP 26: Clicking on GET QUOTE button
		WebUI.click(findTestObject('Quote_OR/btn_GETQUOTE'))

		//Waiting
		WebUI.delay(4)

		// STEP 27: Clicking on SENT QUOTE button
		WebUI.click(findTestObject('Quote_OR/btn_SENDQUOTE'))

		// Waiting
		WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

		// STEP 20: Clicking on SENT QUOTE DETAILS button
		WebUI.click(findTestObject('Quote_OR/btn_SEND_QUOTE_DETAILS'))

		// Waiting
		WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

		// STEP 28: Entering FIRSTNAME in Sent Quote popup
		WebUI.setText(findTestObject('Quote_OR/txtfield_SENDQUOTE_FIRSTNAME'),propertyDATA.internallyGetValue("Quote_FirstName", propertyDataRowCounter))

		// STEP 17: Entering LASTNAME in Sent Quote popup
		WebUI.setText(findTestObject('Quote_OR/txtfield_SENDQUOTE_LASTNAME'), propertyDATA.internallyGetValue("Quote_LastName", propertyDataRowCounter))

		//Waiting
		WebUI.delay(3)

		// STEP 18: Entering CONTACT NUMBER in Sent Quote popup
		WebUI.setText(findTestObject('Quote_OR/txtfield_SENDQUOTE_CONTACTNUMBER'), propertyDATA.internallyGetValue("Quote_ContactNumber", propertyDataRowCounter))

		//Waiting
		WebUI.delay(3)

		// STEP 19: Entering EMAIL in Sent Quote popup
		WebUI.setText(findTestObject('Quote_OR/txtfield_SENDQUOTE_EMAIL'), propertyDATA.internallyGetValue("Quote_Email", propertyDataRowCounter))

		//Waiting
		WebUI.delay(4)

		// STEP 20: Clicking on SENT QUOTE DETAILS button
		WebUI.click(findTestObject('Quote_OR/btn_SEND_QUOTE_DETAILS'))

		//Waiting
		WebUI.delay(4)

		// STEP 21: Selecting CONSTRUCTION TYPE as "FRAME"
		WebUI.selectOptionByIndex(findTestObject('Quote_OR/drp_CONSTRUCTION_TYPE'), propertyDATA.internallyGetValue("ConstructionTypeID1", propertyDataRowCounter))

		//WAITING
		WebUI.delay(8)

		// STEP 22: Clicking on RECALCULATE button
		WebUI.click(findTestObject('Quote_OR/btn_RECALCULATE_PREMIUM'))

	}
}
