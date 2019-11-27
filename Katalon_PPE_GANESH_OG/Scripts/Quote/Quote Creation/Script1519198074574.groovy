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

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


// STEP 1 : Navigating to URL
String url = 'http://test.cogitate.us/PPE.Test/';

WebUI.openBrowser(url)

// STEP 2 : Maximize Window
WebUI.maximizeWindow()

// STEP 3 : Entering USERNAME in Username textfield
WebUI.setText(findTestObject('Quote/txtfield-USERNAME'), 'ih.chelms')

// STEP 4 : Entering PASSWORD in Password textfield
WebUI.setText(findTestObject('Quote/txtfield-PASSWORD'), '10#Hammer')

// STEP 5 : Clicking on LOGIn button
WebUI.click(findTestObject('Quote/btn-LOGIN'))

// STEP 6 : Entering PROPERTY ADDRESS in in Address field (Landing page)
WebUI.setText(findTestObject('Quote/txtfield-ADDRESS-ON-LANDING-PAGE'), GlobalVariable.address1)

// STEP 7 : Clicking on SERACH ADDRESS button
WebUI.click(findTestObject('Quote/btn-SEARCH-ADDRESS'))

// Waiting for Page
WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

// STEP 8 : Selecting PROPERTY TYPE as "Single Family"
WebUI.selectOptionByIndex(findTestObject('Quote/drp-PROPERTY-TYPE'), 1)

// STEP 9 : Clearing HOME VALUATION
WebUI.setText(findTestObject('Quote/txtfield-HOME-VALUATION'), '')

// STEP 10 : Selecting Construction Type as "Masonary"
WebUI.selectOptionByIndex(findTestObject('Quote/drp-CONSTRUCTION-TYPE'), 2)

// STEP 11: Entering Home Valuation
WebUI.setText(findTestObject('Quote/txtfield-HOME-VALUATION'), '100000')

//Waiting
WebUI.delay(2)

// STEP 12: Clearing HOME BUILD year
WebUI.setText(findTestObject('Quote/txtbx-YEARHOMEBUILD'), '')

// STEP 13: Entering home Build year
WebUI.setText(findTestObject('Quote/txtbx-YEARHOMEBUILD'), '1968')

// STEP 14: Clicking on GET QUOTE button
WebUI.click(findTestObject('Quote/btn-GETQUOTE'))

//Waiting
WebUI.delay(1)

// STEP 15: Clicking on SENT QUOTE button
WebUI.click(findTestObject('Quote/btn-SENDQUOTE'))

// Waiting
WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

// STEP 16: Entering FIRSTNAME in Sent Quote popup
WebUI.setText(findTestObject('Quote/txtfield-SENDQUOTE-FIRSTNAME'), 'Ganesh')

// STEP 17: Entering LASTNAME in Sent Quote popup
WebUI.setText(findTestObject('Quote/txtfield-SENDQUOTE-LASTNAME'), 'Salunkhe')

//Waiting
WebUI.delay(5)

// STEP 18: Entering CONTACT NUMBER in Sent Quote popup
WebUI.setText(findTestObject('Quote/txtfield-SENDQUOTE-CONTACTNUMBER'), '9768180080')

//Waiting
WebUI.delay(5)

// STEP 19: Entering EMAIL in Sent Quote popup
WebUI.setText(findTestObject('Quote/txtfield-SENDQUOTE-EMAIL'), 'gsalunkhe@cogitate.us')

//Waiting
WebUI.delay(10)

// STEP 20: Clicking on SENT QUOTE DETAILS button
WebUI.click(findTestObject('Quote/btn-SEND-QUOTE-DETAILS'))

//Waiting
WebUI.delay(4)

// STEP 21: Selecting CONSTRUCTION TYPE as "FRAME"
WebUI.selectOptionByIndex(findTestObject('Quote/drp-CONSTRUCTION-TYPE'), 1)

//WAITING
WebUI.delay(8)

// STEP 22: Clicking on RECALCULATE button
WebUI.click(findTestObject('Quote/btn-RECALCULATE-PREMIUM'))

