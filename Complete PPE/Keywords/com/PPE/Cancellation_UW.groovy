package com.PPE

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.time.TimeCategory

public class Cancellation_UW {

	Date today = new Date()
    Date NextWeek
	Date NextMonth

	@Keyword
	def CancellationByUW() 
	{
		
		// STEP 4: Getting Policy number and Storing in String
		String policynumber = WebUI.getText(findTestObject('Endorsement_OR/get_POLICYNUMBER'))

		// STEP 5: Printing String / Policy number
		println policynumber;

		// Waiting
		WebUI.delay(4)

		// STEP 74: Clicking on Application Status menu
		WebUI.click(findTestObject('CANCELLATION_BY_UW/menu_CANCELLATION'))

		// Waiting
		WebUI.delay(4)

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

		WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_CANCEL_POLICY'))

		// Waiting
		WebUI.delay(6)

		use(TimeCategory,
				{
					today = new Date()
					NextWeek = (today + 1.week)
					NextMonth = (today + 1.month)
					// STEP 24: Printing NCurrent date + 7 days date
					println ("NextMonth -- " + NextMonth.format('MM/dd/yyyy'))
					println ("NextWeek -- " + NextWeek.format('MM/dd/yyyy'))
					String cancellationEffectivedate =  NextMonth.format('MM/dd/yyyy')
			        println cancellationEffectivedate
				
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
	}
}


