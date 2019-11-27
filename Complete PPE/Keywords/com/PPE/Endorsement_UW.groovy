package com.PPE

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.InternalData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.time.TimeCategory
import internal.GlobalVariable


public class Endorsement_UW {
	Date today = new Date()
	Date NextWeek
	Date NextMonth

	@Keyword
	def EndorsementByUW() {

		int UWEndorsementDataRowCounter = 0;

		// Path of Data file created under DATA FILES
		InternalData EndorsementDATA = findTestData("UW_EndorsementData")


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
		String policynumber = WebUI.getText(findTestObject('Endorsement_OR/get_POLICYNUMBER'))

		// STEP 5: Printing String / Policy number
		println policynumber;

		// Waiting
		WebUI.delay(10)

		// STEP 6: Clicking on ENDORSEMENT menu
		WebUI.click(findTestObject('Endorsement_OR/btn_ENDORSEMENT_MENU'))

		// Waiting
		WebUI.delay(3)

		// STEP 7: Clicking on YES button of Confirmation popup
		WebUI.click(findTestObject('Endorsement_OR/btn_YES_CONFIRMATION_ENDORSEMENT'))

		// Waiting
		WebUI.delay(6)

		// STEP 8: Entering Policy number in policy number field
		WebUI.setText(findTestObject('Endorsement_OR/txtfield_POLICYNUMBER_FOR_ENDORSEMENT'),policynumber)

		// Waiting
		WebUI.delay(6)

		// STEP 9: Clicking on SEARCH button
		WebUI.click(findTestObject('Endorsement_OR/btn_SEARCH_FOR_ENDORSEMENT'))

		// Waiting
		WebUI.delay(10)

		// STEP 10: Clicking on ENDORSE button
		WebUI.click(findTestObject('Endorsement_OR/btn_ENDORSE_UW'))

		// Waiting
		WebUI.delay(6)

		// STEP 12: Clicking EDIT button of Policy Holder Info section
		WebUI.click(findTestObject('Endorsement_OR/btn_EDIT_APPLICANTINFO_UW'))

		// Waiting
		WebUI.delay(6)

		// STEP 12: Clicking RECALCULATE button
		WebUI.click(findTestObject('Endorsement_OR/btn_RECALCULATE_UW'))

		// Waiting
		WebUI.delay(6)

		// STEP 14: Entering / Changing Primary Insured's FirstName
		WebUI.setText(findTestObject('Endorsement_OR/txtfield_PRIFIRSTNAME_UW'),EndorsementDATA.internallyGetValue("INSURED_FNAME", UWEndorsementDataRowCounter))

		// Waiting
		WebUI.delay(2)

		// STEP 15: Clicking UPDATE button of Policy Holder Info section
		WebUI.click(findTestObject('Endorsement_OR/btn_UPDATE_APPLICANTINFO_UW'))

		// Waiting
		WebUI.delay(2)

		// STEP 16: Clicking RECALCULATE button
		WebUI.click(findTestObject('Endorsement_OR/btn_RECALCULATE_UW'))

		// Waiting
		WebUI.delay(6)

		// STEP 17: Scrolling the page
		WebUI.scrollToPosition(0,50)

		// Waiting
		WebUI.delay(3)

		// STEP 18: Clicking EDIT button of Coverage section
		WebUI.click(findTestObject('Endorsement_OR/btn_EDIT_COVERAGE_UW'))

		// Waiting
		WebUI.delay(6)

		// STEP 19: Clicking on SETTLEMENT TYPE dropdown
		WebUI.click(findTestObject('Endorsement_OR/drp_SETTLEMENTTYPE_UW'))

		// Waiting
		WebUI.delay(3)

		String str = EndorsementDATA.internallyGetValue("SettlementTypeName2", UWEndorsementDataRowCounter);
		println str

		// STEP 20: Selecting Settlement type as "ACV"
		WebUI.selectOptionByLabel(findTestObject('Endorsement_OR/drp_SETTLEMENTTYPE_UW'),str,false)

		WebUI.delay(6)

		// STEP 21: Clicking UPDATE button of Coverage section
		WebUI.click(findTestObject('Endorsement_OR/btn_UPDATE_COVERAGE_UW'))

		// Waiting
		WebUI.delay(2)

		// STEP 22: Clicking on RECALCULATE button
		WebUI.click(findTestObject('Endorsement_OR/btn_RECALCULATE_UW'))

		// Waiting
		WebUI.delay(5)

		//STEP 23: Clicking on Endorsement Effective date
		//WebUI.click(findTestObject('Endorsement_OR/txtfield_ENDORSEMENTEFFECTIVEDATE_UW'))

		use(TimeCategory,
				{
					today = new Date()
					NextWeek = (today + 1.week)
					NextMonth = (today + 1.month)
					// STEP 24: Printing NCurrent date + 7 days date
					println ("NextWeek -- " + NextWeek.format('MM/dd/yyyy'))
					String date = NextMonth = (today + 1.month)
					println date
				})

		// STEP 25: Scrolling the page
		WebUI.scrollToPosition(0,50)

		// STEP 26: Clicking EDIT button of Property section
		WebUI.click(findTestObject('Endorsement_OR/btn_EDIT_PROPERTY_UW'))

		// Waiting
		WebUI.delay(2)

		//STEP 27: Entering Home Build year as "1970"
		WebUI.setText(findTestObject('Endorsement_OR/txtfield_HOME_BUILD_ENDORSEMENT_UW'), '1970')

		// Waiting
		WebUI.delay(4)

		//STEP 28: Entering Estimation valuation as "500000"
		WebUI.setText(findTestObject('Endorsement_OR/txtfield_EXIMATED_VALUATION_UW'), '74999')

		// Waiting
		WebUI.delay(4)

		// STEP 29: Clicking on Construction Type dropdown
		WebUI.click(findTestObject('Endorsement_OR/drp_CONSTRUCTION_TYPE_UW'))

		// STEP 30: Selecting Construction Type as Masonry Vaneer
		WebUI.selectOptionByIndex(findTestObject('Endorsement_OR/drp_CONSTRUCTION_TYPE_UW'), 3)

		// Waiting
		WebUI.delay(4)

		// STEP 31: Clicking UPDATE button of Property section
		WebUI.click(findTestObject('Endorsement_OR/btn_UPDATE_ENDORSEMENT_PROPERTY_UW'))

		// Waiting
		WebUI.delay(4)


		//STEP 28: Entering Estimation valuation as "500000"
		WebUI.setText(findTestObject('Endorsement_OR/txtfield_EXIMATED_VALUATION_UW'), '500000')

		// Waiting
		WebUI.delay(4)

		// STEP 31: Clicking UPDATE button of Property section
		WebUI.click(findTestObject('Endorsement_OR/btn_UPDATE_ENDORSEMENT_PROPERTY_UW'))

		// Waiting
		WebUI.delay(4)

		// STEP 32: Clicking UPDATE button
		WebUI.click(findTestObject('Endorsement_OR/btn_RECALCULATE_UW'))

		// Waiting
		WebUI.delay(4)

		// STEP 33: Clicking GENERATE FORMS button
		WebUI.click(findTestObject('Endorsement_OR/btn_GENERATE_FORMS_UW'))

		// Waiting
		WebUI.delay(4)

		// STEP 34: Clicking APPROVE ENDORSEMENT button
		WebUI.click(findTestObject('Endorsement_OR/btn_APPROVE_ENDORSEMENT'))

		// Waiting
		WebUI.delay(6)

		// STEP 35: Unchecking Homeowner Endorsment form
		WebUI.click(findTestObject('Endorsement_OR/chkbx_HOMEOWNER_END_FORM'))

		// Waiting
		WebUI.delay(4)

		// STEP 36: Checking Homeowner Endorsment form
		WebUI.click(findTestObject('Endorsement_OR/chkbx_HOMEOWNER_END_FORM'))

		// Waiting
		WebUI.delay(4)

		// STEP 37: Clicking on FILLDATA button of Homeowner Endorsment form
		WebUI.click(findTestObject('Endorsement_OR/btn_FILLDATA_HOMEOWNER_END_FORM'))

		// Waiting
		WebUI.delay(10)

		// STEP 38: Entering text in Homeowner Endorsment form
		WebUI.setText(findTestObject('Endorsement_OR/txtfield_HOMEOWNER_END_FORM'), 'Testing')

		// Waiting
		WebUI.delay(4)

		// STEP 39: Clicking or Submitting Homeowner Endorsment form
		WebUI.click(findTestObject('Endorsement_OR/btn_SUBMIT_HOMEOWNER_END_FORM'))

		// Waiting
		WebUI.delay(4)

		// STEP 40: Clicking on VIEW DARFT button
		WebUI.click(findTestObject('Endorsement_OR/btn_VIEW_DRAFT_END'))

		// Waiting
		WebUI.delay(4)

		// STEP 41: Clicking on APPROVE ENDORSEMENT button
		WebUI.click(findTestObject('Endorsement_OR/btn_APPROVE_ENDORSEMENT'))

		// Waiting
		WebUI.delay(100)


		// STEP 41: Clicking on LOGOUT button
		WebUI.click(findTestObject('Endorsement_OR/btn_LOGOUT_UW'))

		// Waiting
		WebUI.delay(10)


	}

}
