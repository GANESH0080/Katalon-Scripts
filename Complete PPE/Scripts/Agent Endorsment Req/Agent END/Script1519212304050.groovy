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



CustomKeywords.'com.PPE.Endorsement_Agent.EndorsementByUW'()

// STEP 33: Creating String for Executing Query
String otpQueryEND = ('SELECT TOP 1 OtpGenerated FROM PPE_ApplicationForms_trn where PolicyInfoId = ' + GlobalVariable.policyInfoId) +
' Order BY ModifiedDateTime DESC'

// STEP 34: Printing Query result
println(('otpQuery' + ' ') + otpQueryEND)

// STEP 35: Database Connection & Execution
'Connect to DB'
CustomKeywords.'com.PPE.Database_Connection.connectDB'('13.58.119.123', '1433', 'TEST_DID', 'PPE',
	'10#HammerPPEtest')

// STEP 36: Executing Query
'ExecQuery'
def recordset1 = CustomKeywords.'com.PPE.Database_Connection.executeQuery'(otpQueryEND)

// STEP 37: Creating String
String otpEndorsement = 0

// STEP 38: While Condition
while (recordset1.next()) {
	otpEndorsement = recordset1.getObject('OtpGenerated')
}

// STEP 39: Printing OTP
println(('otp' + ' ') + otpEndorsement)

// Waiting
WebUI.delay(10)

// STEP 40: Creating Object
TestObject txtOtp = findTestObject('Application_OR/txtfield-OTP')

// STEP 41: Enterting OTP in OTP field
WebUI.setText(txtOtp, otpEndorsement.toString())

// Waiting
WebUI.delay(1)

// STEP 42: Clicking on VERIFY button
WebUI.click(findTestObject('Application_OR/btn_OTP_VERIFY'))

// Waiting
WebUI.delay(5)

// STEP 42: Clicking on SUBMIT FOR UNDERWRITER approval button and sent an Endorsement for UW approval
WebUI.click(findTestObject('Application_OR/btn_SUBMIT_FOR_UW_APPROVAL'))

// Waiting
WebUI.delay(15)

// STEP 62: Clicking on LOGOUT button
WebUI.click(findTestObject('Application_OR/btn_LOGOUT'))

// Waiting
WebUI.delay(10)
