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

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

// STEP 1 : Entering Property address in Address field on Get Quote page.
WebUI.setText(findTestObject('Application/txtfield-ADDRESS-ON-QUOTE-PAGE'), GlobalVariable.address2)

//Waiting
WebUI.delay(4)

// STEP 2: Clicking on Search address button
WebUI.click(findTestObject('Application/btn-SEARCH-ADDRESS-QUOTE-PAGE'))

//Waiting
WebUI.delay(3)

// STEP 3: Creating Object
TestObject Address = findTestObject('Endorsement_OR/get_Address')

// STEP 4 : Creating String
String propertyaddress = WebUI.getAttribute(Address, 'value')

// STEP 5: Printing String
println(propertyaddress)

// STEP 6: Comapring Address with Address which is stored in Global variable
GlobalVariable.propertyaddress = propertyaddress

// STEP 7: Selecting PROPERTY TYPE as "Single"
WebUI.selectOptionByIndex(findTestObject('Quote/drp-PROPERTY-TYPE'), 1)

// STEP 8: Clearing the existing HOME BUILD YEAR
WebUI.setText(findTestObject('Quote/txtbx-YEARHOMEBUILD'), '')

// STEP 9: Entering HOME BUILD YEAR as "2000"
WebUI.setText(findTestObject('Quote/txtbx-YEARHOMEBUILD'), '2000')

// STEP 10: Selecting CONSTRUCTION TYPE as "Masonary"
WebUI.selectOptionByIndex(findTestObject('Quote/drp-CONSTRUCTION-TYPE'), '2')

// STEP 11: Clearing the existing HOME VALUATION
WebUI.setText(findTestObject('Quote/txtfield-HOME-VALUATION'), '')

// STEP 12: Entering HOME VALUATION as "100000"
WebUI.setText(findTestObject('Quote/txtfield-HOME-VALUATION'), '100000')

// STEP 13: Clicking on GET QUOTE button
WebUI.click(findTestObject('Quote/btn-GETQUOTE'))

// Waiting
WebUI.delay(4)

// STEP 14: Clicking on TO APPLICATION button
WebUI.click(findTestObject('Application/btn-TOAPPLICATION'))

// Waiting
WebUI.delay(10)

// STEP 15: Clicking on CONTINUE button of Underwriting Question popup
WebUI.click(findTestObject('Application/btn-CONTINUE-UW-QUESTIONS'))

// Waiting
WebUI.delay(10)

// Waiting
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

// STEP 16: Clicking on FirstName field on Policy Holder Info page
WebUI.click(findTestObject('Application/txtfield-INSURED-FIRSTNAME'))

// STEP 17: Entering LASTNAME in FirstName field on Policy Holder Info page
WebUI.setText(findTestObject('Application/txtfield-INSURED-FIRSTNAME'), 'Smith')

// STEP 18: Entering MIDDLENAME in MiddleName field on Policy Holder Info page
WebUI.setText(findTestObject('Application/txtfield-INSURED-MIDDLENAME'), 'Racher')

// STEP 19: Entering LASTNAME in LastName field on Policy Holder Info page
WebUI.setText(findTestObject('Application/txtfield-INSURED-LASTNAME'), 'Lastin')

// STEP 20: Entering DOB in DOB field on Policy Holder Info page
WebUI.setText(findTestObject('Application/txtfield-INSURED-DOB'), '09/10/1999')

// Waiting
WebUI.delay(5)

// STEP 21: Entering EMAIL in Email field on Policy Holder Info page
WebUI.setText(findTestObject('Application/txtfield-INSURED-EMAIL'), 'gsalunkhe@cogitate.us')

// Waiting
WebUI.delay(5)

// STEP 22: Entering CONTACT NUMBER in Contact number field on Policy Holder Info page
WebUI.setText(findTestObject('Application/txtfield-INSURED-CONTACTNUMBER'), '9768180080')

// Waiting
WebUI.delay(5)

// STEP 23: Creating an Object for getting PolicyInfoID
TestObject hdnPolicyInfoId = findTestObject('Generic_OR/hdnPolicyInfoId')

// STEP 24: Creating String to get the PolicyInfoID
String policyInfoid = WebUI.getAttribute(hdnPolicyInfoId, 'value')

// STEP 25: Set PolicyInfoID in Glibal Variable PolicyInfoID
GlobalVariable.policyInfoId = policyInfoid

// STEP 26: EnClicking on SAVE & CONTINUE button on Policy Holder Info page
WebUI.click(findTestObject('Application/btn-POLICYHOLDER-SAVEANDCONTINUE'))

// Waiting
WebUI.delay(1)

// STEP 27: Clicking on ROOF TYPE dropdown on Property page
WebUI.click(findTestObject('Application/drp-ROOFTYPE-PROPERTYPAGE'))

// Waiting
WebUI.delay(3)

// STEP 28: Selecting ROOF TYPE as "Composition Shingles" on Property page
WebUI.selectOptionByIndex(findTestObject('Application/drp-ROOFTYPE-PROPERTYPAGE'), 1)

// Waiting
WebUI.delay(2)

// STEP 29: Selecting FOUNDATION TYPE as "Basement" on Property page
WebUI.selectOptionByIndex(findTestObject('Application/drp-FOUNDATIONTYPE-PROPERTYPAGE'), 3)

// Waiting
WebUI.delay(2)

// STEP 30: Selecting HEATING TYPE as "Gas Heaters" on Property page
WebUI.selectOptionByIndex(findTestObject('Application/drp-HEATINGTYPE-PROPERTYPAGE'), 7)

// Waiting
WebUI.delay(5)

// STEP 31: Clicking on SAVE & CONTINUE button on Property page
WebUI.click(findTestObject('Application/btn-OCCUPANYPAGE-SAVEANDCONTINUE'))

// Waiting
WebUI.delay(4)

// STEP 32: Clicking on YES button of ROOF AGE confirmation popup
WebUI.click(findTestObject('Application/btn-YES-ROOFAGE-POPUP'))

// Waiting
WebUI.delay(4)

// STEP 33: Clicking on YES button of ELECTRICAL AGE confirmation popup
WebUI.click(findTestObject('Application/btn-YES-ELECTRICALAGE-POPUP'))

// Waiting
WebUI.delay(4)

// STEP 34: Clicking on YES button of PLUMBING AGE confirmation popup
WebUI.click(findTestObject('Application/btn-YES-ELECTRICALAGE-POPUP'))

// Waiting
WebUI.delay(5)

// STEP 35: Clicking on SAVE & CONTINUE button on Occupancy page
WebUI.click(findTestObject('Application/btn-OCCUPANYPAGE-SAVEANDCONTINUE'))

// Waiting
WebUI.delay(5)

// STEP 36: Checking Agreement checkbox on Coverage page
WebUI.check(findTestObject('Application/chkbx-AGREEMENT'))

// Waiting
WebUI.delay(10)

// STEP 37: Clicking on SAVE & CONTINUE button on Coverage page
WebUI.click(findTestObject('Application/btn-OCCUPANYPAGE-SAVEANDCONTINUE'))

// Waiting
WebUI.delay(5)

// STEP 38: Clicking on SIGN APPLICATION button on Application summary page
WebUI.click(findTestObject('Application/btn-SIGNAPPLICATION-AGENT'))

// Waiting
WebUI.delay(5)

String getInsuredName= WebUI.getText(findTestObject('Application/get-INSUREDNAME-APPLICATION FORMSUMMARY'))

println getInsuredName

// STEP 39: Clicking on INSURED SIGNATURE button on Application Form Summary page
WebUI.click(findTestObject('Application/btn-INSURED-SIGNATURE'))

// Waiting
WebUI.delay(5)

// STEP 40: Clicking on textfield INSURED SIGNATURE on Insured Signature popup
WebUI.click(findTestObject('Application/txtbx-INSURED-SIGNATURE'))

// Waiting
WebUI.delay(5)

// STEP 41: Entering Insured Singature
WebUI.setText(findTestObject('Application/txtbx-INSURED-SIGNATURE'), getInsuredName)

// STEP 42: Clicking on SUBMIT button after filling Insured Signature
WebUI.click(findTestObject('Application/btn-SUBMIT-INSURED-SIGNATURE'))

// STEP 43: Creating String for Executing Query
String otpQuery = ('SELECT TOP 1 OtpGenerated FROM PPE_ApplicationForms_trn where PolicyInfoId = ' + GlobalVariable.policyInfoId) +
' Order BY ModifiedDateTime DESC'

// STEP 44: Printing Query result
println(('otpQuery' + ' ') + otpQuery)

// STEP 45: Database Connection & Execution
'Connect to DB'
CustomKeywords.'com.PPE.Database_Connection.connectDB'('cts01db01.database.windows.net', '1433', 'TEST_DID', 'ctsindia',
	'cts@india20!6')

// STEP 46: Executing Query
'ExecQuery'
def recordset = CustomKeywords.'com.PPE.Database_Connection.executeQuery'(otpQuery)

// STEP 47: Creating String
String otp = 0

// STEP 48: While Condition
while (recordset.next()) {
	otp = recordset.getObject('OtpGenerated')
}

// STEP 49: Printing OTP
println(('otp' + ' ') + otp)

// Waiting
WebUI.delay(10)

// STEP 50: Creating Object
TestObject txtOtp = findTestObject('Application/txtfield-OTP')

// STEP 51: Enterting OTP in OTP field
WebUI.setText(txtOtp, otp.toString())

// Waiting
WebUI.delay(1)

// STEP 52: Clicking on VERIFY button
WebUI.click(findTestObject('Application/btn-OTP-VERIFY'))

// Waiting
WebUI.delay(5)

// STEP 53: Clicking on AGENT SIGNATURE button
WebUI.click(findTestObject('Application/btn-AGENT-SIGNATURE'))

// Waiting
WebUI.delay(2)

// STEP 54: Clicking on Agent Signature textfield
WebUI.click(findTestObject('Application/txtbx-AGENT-SIGNATURE'))

// Waiting
WebUI.delay(2)

// STEP 55: Entering AGENT SIGNATURE in Agent Signature textfield
WebUI.setText(findTestObject('Application/txtbx-AGENT-SIGNATURE'), 'clement helms')

// Waiting
WebUI.delay(2)

// STEP 56: Clicking on SUBMIT button after entering Agent Signature
WebUI.click(findTestObject('Application/btn-SUBMIT-AGENT-SIGNATURE'))

// Waiting
WebUI.delay(5)

// STEP 57: Clicking on SURPLUSLINE ACK form button
WebUI.click(findTestObject('Application/btn-SURPLUSLINE-ACK'))

// Waiting
WebUI.delay(5)

// STEP 58: Clicking on textfield in SURPLUSLINE ACK form
WebUI.click(findTestObject('Application/txtfield-SURPLUSLINE-FORM-TEXT'))

// STEP 59: Entering text in SURPLUSLINE ACK form
WebUI.setText(findTestObject('Application/txtfield-SURPLUSLINE-FORM-TEXT'), 'Testing')

// Waiting
WebUI.delay(5)

// STEP 60: Clicking on SUBMIT button of SURPLUSLINE ACK form after entering data
WebUI.click(findTestObject('Application/btn-SUBMIT-SURPLUSLINE'))

// Waiting
WebUI.delay(5)

// STEP 61: Clicking on SUBMIT FOR UNDERWRITER APPROVAL button
WebUI.click(findTestObject('Application/btn-SUBMIT-FOR-UW-APPROVAL'))

// Waiting
WebUI.delay(8)

// STEP 62: Clicking on LOGOUT button
WebUI.click(findTestObject('Application/btn-LOGOUT'))

// Waiting
WebUI.delay(5)

// STEP 63: Entering an USERNAME in Username textfield
WebUI.setText(findTestObject('Quote/txtfield-USERNAME'), 'ih.william')

// STEP 64: Entering an PASSWORD in Username textfield
WebUI.setText(findTestObject('Quote/txtfield-PASSWORD'), '10#Hammer')

// STEP 65: CLicking on LOGIN button
WebUI.click(findTestObject('Quote/btn-LOGIN'))

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

// STEP 70: Clicking on DOWNLOAD button
WebUI.click(findTestObject('Application/btn-DOWNLOAD-AFS-UW'))

// Waiting
WebUI.delay(5)

// STEP 71: Clicking on GENERATE FORMS button
WebUI.click(findTestObject('Application/btn-GENERATE-FORMS'))

// Waiting
WebUI.delay(5)

// STEP 72: Clicking on REQUEST FOR BIND button
WebUI.click(findTestObject('Application/btn-REQUEST-FOR-BIND'))

// Waiting
WebUI.delay(20)

// STEP 73: Clicking on VIEW FORMS button after Application gets bind
WebUI.click(findTestObject('Application/btn-VIEW-POLICY-FORMS'))

// Waiting
WebUI.delay(15)

// STEP 74: Clicking on Application Status menu
WebUI.click(findTestObject('Application/btn-UW-APPLICATION-STATUS-MENU'))

// Waiting
WebUI.delay(2)

// STEP 75: Clicking on YES button of cofirmation popup.
WebUI.click(findTestObject('Application/btn-YES-CONFIRMATION'))

// Waiting
WebUI.delay(20)

