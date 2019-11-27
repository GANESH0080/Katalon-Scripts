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

public class Endorsement_Agent {

	
	@Keyword
	def EndorsementByUW()
	{
		int configDataRowCounter = 0;
		InternalData genericDATA = findTestData("PPE_Config_File")
		if(genericDATA.internallyGetValue("STATE", configDataRowCounter) == "GA")
		{
		
	// STEP 3: Entering an USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), 'ih.chelms')
	
	// STEP 4: Entering an PASSWORD in Username textfield
	WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), '10#Hammer')
		}
	else if (genericDATA.internallyGetValue("STATE", configDataRowCounter) == "VA")
	{
		
		// STEP 3: Entering an USERNAME in Username textfield
		WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), 'ih.va1')
		// STEP 4: Entering an PASSWORD in Username textfield
		WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), '10#Hammer')
	}
else
{
	// STEP 3: Entering an USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), 'ih.va1')
	// STEP 4: Entering an PASSWORD in Username textfield
	WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), '10#Hammer')
}
	
	// STEP 5: CLicking on LOGIN button
	WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))
	
	// Waiting
	WebUI.delay(15)
	
	// STEP 74: Clicking on Application Status menu
	WebUI.click(findTestObject('Application_OR/btn_UW_APPLICATION_STATUS_MENU'))
	
	// Waiting
	WebUI.delay(5)
	
	// STEP 7: Clicking on YES button of Confirmation popup
	WebUI.click(findTestObject('Endorsement_OR/btn_YES_CONFIRMATION_ENDORSEMENT'))
	
	// Waiting
	WebUI.delay(20)
	
	// STEP 1 : Clicking on ADVANCE FILTER button / Link
	WebUI.click(findTestObject('Endorsement_OR/btn_ADVANCE_FILTER'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 2: Entering Property Address in Property address field
	WebUI.setText(findTestObject('Endorsement_OR/txtfield_AdvanceFilter_PROPERTY_ADDRESS'),GlobalVariable.propertyaddress)
	
	// Waiting
	WebUI.delay(15)
	
	// STEP 3: Clicking on APPLY button of Advance Filter popup
	WebUI.click(findTestObject('Endorsement_OR/btn_APPLY_Advance_Filter'))
	
	// Waiting
	WebUI.delay(18)
	
	// STEP 4: Getting Policy number and Storing in String
	String policynumber = WebUI.getText(findTestObject('ENDORSEMENT_AGENT_OR/get_POLICYNUMBER'))
	
	// STEP 5: Printing String / Policy number
	println policynumber;
	
	// Waiting
	WebUI.delay(5)
	
	// STEP 6: Clicking on ENDORSEMENT menu
	WebUI.click(findTestObject('Endorsement_OR/btn_ENDORSEMENT_MENU'))
	
	// Waiting
	WebUI.delay(3)
	
	// STEP 7: Clicking on YES button of Confirmation popup
	WebUI.click(findTestObject('Endorsement_OR/btn_YES_CONFIRMATION_ENDORSEMENT'))
	
	// STEP 7: Entering POLICY NUMBER in Policy number textfield
	WebUI.setText(findTestObject('Endorsement_OR/txtfield_POLICYNUMBER_FOR_ENDORSEMENT'),policynumber)
	
	// Waiting
	WebUI.delay(6)
	
	// STEP 8: Clicking on SEARCH button
	WebUI.click(findTestObject('Endorsement_OR/btn_SEARCH_FOR_ENDORSEMENT'))
	
	// Waiting
	WebUI.delay(10)
	
	// STEP 9: Clicking on ENDORSE button
	WebUI.click(findTestObject('Endorsement_OR/btn_ENDORSE_UW'))
	
	// Waiting
	WebUI.delay(6)
	
	// STEP 10: Clicking EDIT button of Coverage section
	WebUI.click(findTestObject('Endorsement_OR/btn_EDIT_COVERAGE_UW'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 11: Clicking on PERSONAL PROPERTY dropdown
	WebUI.click(findTestObject('ENDORSEMENT_AGENT_OR/drp_PERSONAL_PROPERTY'))
	
	// Waiting
	WebUI.delay(3)
	
	// STEP 12: Selecting Personal Property type as "35%"
	WebUI.selectOptionByValue(findTestObject('ENDORSEMENT_AGENT_OR/drp_PERSONAL_PROPERTY'),'35', false)
	
	// STEP 13: Clicking on WATER BACKUP dropdown
	//WebUI.click(findTestObject('ENDORSEMENT_AGENT_OR/drp_WATER_BACKUP'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 14: Selecting WATER BACKUP as "25000"
	//WebUI.selectOptionByValue(findTestObject('ENDORSEMENT_AGENT_OR/drp_WATER_BACKUP'),'25000',false)
	
	// STEP 15: Clicking UPDATE button of Coverage section
	WebUI.click(findTestObject('Endorsement_OR/btn_UPDATE_COVERAGE_UW'))
	
	// STEP 16: Scrolling the page
	WebUI.scrollToPosition(0,50)
	
	// STEP 17: Clicking UPDATE button of CLAIM section
	WebUI.click(findTestObject('ENDORSEMENT_AGENT_OR/btn_EDIT_CLAIM_Details'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 18: Clicking Number Of claim dropdown
	WebUI.click(findTestObject('ENDORSEMENT_AGENT_OR/drp_NUMOFCLAIMS'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 19: Selecting Number of claim as "1"
	WebUI.selectOptionByValue(findTestObject('ENDORSEMENT_AGENT_OR/drp_NUMOFCLAIMS'),'1',false)
	
	// Waiting
	WebUI.delay(4)
	
	
	
	// STEP 20: Clicking UPDATE button of Claim dropdown
	WebUI.click(findTestObject('ENDORSEMENT_AGENT_OR/btn-UPDATE_NUMOFCLAIMS'))
	
	// Waiting
	WebUI.delay(4)
	
	// STEP 22: Selction Date Of Loss date
	WebUI.setText(findTestObject('ENDORSEMENT_AGENT_OR/txtfield-DATE_OF_LOSS_CLAIM'),'01/03/2017')
	
	// STEP 23: Entering Loss amount
	WebUI.setText(findTestObject('ENDORSEMENT_AGENT_OR/txtfield-LOSSAMOUNT_CLAIM'),'50000')
	
	// STEP 24: Selecting Type Of Incident
	WebUI.selectOptionByValue(findTestObject('ENDORSEMENT_AGENT_OR/drp-TYPEOFINCIDENT'),'2',false)
	
	// Waiting
	WebUI.delay(4)
	
	WebUI.scrollToPosition(0,50)
	
	// STEP 25: Clicking UPDATE button of Claim section
	WebUI.click(findTestObject('ENDORSEMENT_AGENT_OR/btn-UPDATE_NUMOFCLAIMS'))
								
	// Waiting
	WebUI.delay(8)
	
	// STEP 26: Clicking Recalculate button
	WebUI.click(findTestObject('Endorsement_OR/btn_RECALCULATE_UW'))
	
	// Waiting
	WebUI.delay(3)
	
	// STEP 27: Getting Insured name and Save into the String
	String getInsuredName = WebUI.getText(findTestObject('Generic_OR/get_INSURED_NAME'))
	
	// STEP 28: Printing String (Insured Name)
	println getInsuredName
	
	// STEP 23: Creating an Object for getting PolicyInfoID
	TestObject hdnPolicyInfoIdEND = findTestObject('Generic_OR/hdnPolicyInfoId')
	
	// STEP 24: Creating String to get the PolicyInfoID
	String policyInfoid = WebUI.getAttribute(hdnPolicyInfoIdEND, 'value')
	
	// STEP 25: Set PolicyInfoID in Global Variable PolicyInfoID
	GlobalVariable.policyInfoId = policyInfoid
	
	// STEP 29: Clicking Insured Signature button
	WebUI.click(findTestObject('ENDORSEMENT_AGENT_OR/btn_INSURED_SIGNATURE'))
	
	// Waiting
	WebUI.delay(3)
	
	// STEP 30: Clicking on textfield INSURED SIGNATURE on Insured Signature popup
	WebUI.click(findTestObject('Application_OR/txtbx_INSURED_SIGNATURE'))
	
	// Waiting
	WebUI.delay(2)
	
	// STEP 31: Entering Insured Signture in Insured Signature textfield
	WebUI.setText(findTestObject('Application_OR/txtbx_INSURED_SIGNATURE'),getInsuredName)
	
	// Waiting
	WebUI.delay(2)
	
	// STEP 32: Clicking SUBMIT button after entering Insured Signature
	WebUI.click(findTestObject('Application_OR/btn_SUBMIT_INSURED_SIGNATURE'))
	}
	
}
