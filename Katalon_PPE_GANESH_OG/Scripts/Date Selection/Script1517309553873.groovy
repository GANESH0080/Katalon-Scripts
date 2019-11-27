import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.time.TimeCategory as TimeCategory
import internal.GlobalVariable as GlobalVariable

// STEP 1 : Navigating to URL
WebUI.openBrowser(GlobalVariable.url)

// STEP 2 : Maximize Window
WebUI.maximizeWindow()


// STEP 3 : Entering USERNAME in Username textfield
WebUI.setText(findTestObject('Quote/txtfield-USERNAME'), 'ih.william')

// STEP 4 : Entering PASSWORD in Password textfield
WebUI.setText(findTestObject('Quote/txtfield-PASSWORD'), '10#Hammer')

// STEP 5 : Clicking on LOGIn button
WebUI.click(findTestObject('Quote/btn-LOGIN'))

// Waiting
WebUI.delay(10)

// STEP 74: Clicking on Application Status menu
WebUI.click(findTestObject('CANCELLATION_BY_UW/menu_CANCELLATION'))

// Waiting
WebUI.delay(4)

WebUI.click(findTestObject('Endorsement_OR/btn_YES_CONFIRMATION_ENDORSEMENT'))

// Waiting
WebUI.delay(6)

// STEP 8: Entering Policy number in policy number field
WebUI.setText(findTestObject('Endorsement_OR/txtfield_POLICYNUMBER_FOR_ENDORSEMENT'), 'BCIHGA1800132')

// Waiting
WebUI.delay(6)

// STEP 9: Clicking on SEARCH button
WebUI.click(findTestObject('Endorsement_OR/btn_SEARCH_FOR_ENDORSEMENT'))

// Waiting
WebUI.delay(10)

WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_CANCEL_POLICY'))

// Waiting
WebUI.delay(6)

use(TimeCategory, { 
        today = new Date()

        NextWeek = (today + 1.week)

        NextMonth = (today + 1.month)

        // STEP 24: Printing NCurrent date + 7 days date
        println('NextWeek -- ' + NextMonth.format('MM/dd/yyyy'))

        String cancellationEffectivedate = NextMonth.format('MM/dd/yyyy')

        println(cancellationEffectivedate)

        WebUI.delay(8)

        WebUI.click(findTestObject('CANCELLATION_BY_UW/txtfield_CANCELLATION_EFFECTIVE_DATE'))

        WebUI.setText(findTestObject('CANCELLATION_BY_UW/txtfield_CANCELLATION_EFFECTIVE_DATE'), cancellationEffectivedate)

        WebUI.delay(5)

        WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_SUBMIT_CANCELLATION'))
    })

