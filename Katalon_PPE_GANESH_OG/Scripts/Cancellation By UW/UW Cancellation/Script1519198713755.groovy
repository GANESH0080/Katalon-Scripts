import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.time.TimeCategory


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
 println ("NextWeek -- " + NextMonth.format('MM/dd/yyyy'))
 String cancellationEffectivedate = NextMonth.format('MM/dd/yyyy')
 println cancellationEffectivedate;

 WebUI.delay(8)
 
 WebUI.click(findTestObject('CANCELLATION_BY_UW/txtfield_CANCELLATION_EFFECTIVE_DATE'))
 
 WebUI.setText(findTestObject('CANCELLATION_BY_UW/txtfield_CANCELLATION_EFFECTIVE_DATE'),cancellationEffectivedate)
 
 WebUI.delay(5)
 
 WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_SUBMIT_CANCELLATION'))
 
 WebUI.delay(5)
 
 WebUI.click(findTestObject('CANCELLATION_BY_UW/btn_APPROVE_CANCELLATION'))
 
 WebUI.delay(1)
 
 WebUI.click(findTestObject('Endorsement_OR/btn_YES_CONFIRMATION_ENDORSEMENT'))
 
 WebUI.delay(10)
 
})
