package com.PPE

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Endorsement_Approval
 {
	 @Keyword
	 def EndorsementApprovedUW()
	 {
		 
	 // STEP 63: Entering an USERNAME in Username textfield
	 WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), 'ih.william')
	 
	 // STEP 64: Entering an PASSWORD in Username textfield
	 WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), '10#Hammer')
	 
	 // STEP 65: CLicking on LOGIN button
	 WebUI.click(findTestObject('Quote_OR/btn-LOGIN'))
	 
	 // Waiting
	 WebUI.delay(5)
	 
	 // STEP 66: Creating String to get PolicyInfoID
	 String btnId = ('//*[@id="btnLoadApplication_' + GlobalVariable.policyInfoId) + '"]'
	 
	 // STEP 67: Creating Object
	 TestObject btnViewApplication = new TestObject('btnViewApplication')
	 
	 // STEP 68: Verify VIEW button
	 btnViewApplication.addProperty('xpath', ConditionType.EQUALS, btnId, true)
	 
	 // Waiting
	 WebUI.delay(20)
	 
	 // STEP 69: Clicking on VIEW button
	 WebUI.click(btnViewApplication)
	 
	 // Waiting
	 WebUI.delay(8)
	 
	 WebUI.click(findTestObject('Endorsement_OR/btn_GENERATE_FORMS_UW'))
	 
	 WebUI.delay(4)
	 
	 // STEP 35: Unchecking Homeowner Endorsment form
	 WebUI.click(findTestObject('Endorsement_OR/chkbx_HOMEOWNER_END_FORM'))
	 
	 // Waiting
	 WebUI.delay(4)
	 
	 // STEP 41: Clicking on APPROVE ENDORSEMENT button
	 WebUI.click(findTestObject('Endorsement_OR/btn_APPROVE_ENDORSEMENT'))
	 
	 // Waiting
	 WebUI.delay(80)
	 
	 }	 
}
