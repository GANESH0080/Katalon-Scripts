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

public class Saving_PolicyHolderInfo_Page {

	@Keyword
	def PolicyHolderPage() {
		int propertyDataRowCounter = 0;
		InternalData propertyDATA = findTestData("PPEPROPERTYDATA")

		// Waiting
		WebUI.delay(4)

		// STEP 14: Clicking on TO APPLICATION button
		WebUI.click(findTestObject('Application_OR/btn_TOAPPLICATION'))

		// Waiting
		WebUI.delay(4)

		WebUI.click(findTestObject('Application_OR/btn-YES_IS_BNESS_PREMISES'))

		// Waiting
		WebUI.delay(2)

		WebUI.click(findTestObject('Application_OR/btn-YES_FOOT_TRAFFIC'))

		// Waiting
		WebUI.delay(2)

		WebUI.setText(findTestObject('Application_OR/txtfield-Traffic_Percentage'), '11')

		// Waiting
		WebUI.delay(3)

		// STEP 15: Clicking on CONTINUE button of Underwriting Question popup
		WebUI.click(findTestObject('Application_OR/btn_CONTINUE_UW_QUESTIONS'))

		// Waiting
		WebUI.delay(3)

		WebUI.setText(findTestObject('Application_OR/txtfield-Traffic_Percentage'), '10')

		// Waiting
		WebUI.delay(4)

		// STEP 15: Clicking on CONTINUE button of Underwriting Question popup
		WebUI.click(findTestObject('Application_OR/btn_CONTINUE_UW_QUESTIONS'))

		// Waiting
		WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

		// STEP 16: Clicking on FirstName field on Policy Holder Info page
		WebUI.click(findTestObject('Application_OR/txtfield_INSURED_FIRSTNAME'))
		// STEP 17: Entering LASTNAME in FirstName field on Policy Holder Info page
		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_FIRSTNAME'), '')
		// STEP 17: Entering LASTNAME in FirstName field on Policy Holder Info page
		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_FIRSTNAME'), propertyDATA.internallyGetValue("App_FirstName",propertyDataRowCounter))

		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_MIDDLENAME'), '')
		// STEP 18: Entering MIDDLENAME in MiddleName field on Policy Holder Info page
		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_MIDDLENAME'), propertyDATA.internallyGetValue("App_MiddelName",propertyDataRowCounter))

		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_LASTNAME'), '')
		// STEP 19: Entering LASTNAME in LastName field on Policy Holder Info page
		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_LASTNAME'), propertyDATA.internallyGetValue("App_LastName",propertyDataRowCounter))

		// STEP 20: Entering DOB in DOB field on Policy Holder Info page
		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_DOB'), propertyDATA.internallyGetValue("App_DOB",propertyDataRowCounter))
		// Waiting
		WebUI.delay(5)

		// STEP 21: Entering EMAIL in Email field on Policy Holder Info page
		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_EMAIL'), propertyDATA.internallyGetValue("App_EMAIL",propertyDataRowCounter))


		// Waiting
		WebUI.delay(5)

		// STEP 22: Entering CONTACT NUMBER in Contact number field on Policy Holder Info page
		WebUI.setText(findTestObject('Application_OR/txtfield_INSURED_CONTACTNUMBER'), propertyDATA.internallyGetValue("App_ContactNumber",propertyDataRowCounter))

		// Waiting
		WebUI.delay(5)

		// STEP 23: Creating an Object for getting PolicyInfoID
		TestObject hdnPolicyInfoId = findTestObject('Generic_OR/hdnPolicyInfoId')

		// STEP 24: Creating String to get the PolicyInfoID
		String policyInfoid = WebUI.getAttribute(hdnPolicyInfoId, 'value')

		// STEP 25: Set PolicyInfoID in Glibal Variable PolicyInfoID
		GlobalVariable.policyInfoId = policyInfoid

		// STEP 26: EnClicking on SAVE & CONTINUE button on Policy Holder Info page
		WebUI.click(findTestObject('Application_OR/btn_POLICYHOLDER_SAVEANDCONTINUE'))

		// Waiting
		WebUI.delay(1)
	}
}
