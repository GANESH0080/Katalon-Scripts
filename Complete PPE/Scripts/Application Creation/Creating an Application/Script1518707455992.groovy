import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Path of Data file created under DATA FILES
int propertyDataRowCounter = 0

int configDataRowCounter = 0

// Path of Data file created under DATA FILES
InternalData genericDATA = findTestData('PPE_Config_File')

InternalData propertyDATA = findTestData('PPEPROPERTYDATA')

//STEP 3: Creating Object
TestObject Address = findTestObject('Endorsement_OR/get_Address')

//STEP 4 : Creating String
String propertyaddress = WebUI.getAttribute(Address, 'value')

// STEP 5: Printing String
println(propertyaddress)

// STEP 6: Comapring Address with Address which is stored in Global variable
GlobalVariable.propertyaddress = propertyaddress

CustomKeywords.'com.PPE.Saving_PolicyHolderInfo_Page.PolicyHolderPage'()

CustomKeywords.'com.PPE.Saving_PropertyInfo_Page.PropertyPage'()

CustomKeywords.'com.PPE.Policy_Creation.ApplicationBind'()

// STEP 43: Creating String for Executing Query
String otpQuery = ('SELECT TOP 1 OtpGenerated FROM PPE_ApplicationForms_trn where PolicyInfoId = ' + GlobalVariable.policyInfoId) + 
' Order BY ModifiedDateTime DESC'

// STEP 44: Printing Query result
println(('otpQuery' + ' ') + otpQuery)

// STEP 45: Database Connection & Execution
'Connect to DB'
CustomKeywords.'com.PPE.Database_Connection.connectDB'('13.58.119.123', '1433', 'TEST_DID', 'PPE', '10#HammerPPEtest')

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
TestObject txtOtp = findTestObject('Application_OR/txtfield-OTP')

// STEP 51: Enterting OTP in OTP field
WebUI.setText(txtOtp, otp.toString())

// Waiting
WebUI.delay(1)

// STEP 52: Clicking on VERIFY button
WebUI.click(findTestObject('Application_OR/btn_OTP_VERIFY'))

// Waiting
WebUI.delay(5)

// STEP 53: Clicking on AGENT SIGNATURE button
WebUI.click(findTestObject('Application_OR/btn_AGENT_SIGNATURE'))

// Waiting
WebUI.delay(2)

// STEP 54: Clicking on Agent Signature textfield
WebUI.click(findTestObject('Application_OR/txtbx_AGENT_SIGNATURE'))

// Waiting
WebUI.delay(2)

if (genericDATA.internallyGetValue('STATE', configDataRowCounter) == 'GA') {
    // STEP 55: Entering AGENT SIGNATURE in Agent Signature textfield
    WebUI.setText(findTestObject('Application_OR/txtbx_AGENT_SIGNATURE'), genericDATA.internallyGetValue('GA_AgentName', 
            configDataRowCounter) // Waiting
        )
} else if (genericDATA.internallyGetValue('STATE', configDataRowCounter) == 'VA') {
    WebUI.setText(findTestObject('Application_OR/txtbx_AGENT_SIGNATURE'), genericDATA.internallyGetValue('VA_AgentName', 
            configDataRowCounter))
} else {
    WebUI.setText(findTestObject('Application_OR/txtbx_AGENT_SIGNATURE'), genericDATA.internallyGetValue('NC_AgentName', 
            configDataRowCounter))

    WebUI.delay(2)
}
// STEP 56: Clicking on SUBMIT button after entering Agent Signature
WebUI.click(findTestObject('Application_OR/btn_SUBMIT_AGENT_SIGNATURE'))

// Waiting
WebUI.delay(5)

// STEP 57: Clicking on SURPLUSLINE ACK form button
WebUI.click(findTestObject('Application_OR/btn_SURPLUSLINE_ACK'))

// Waiting
WebUI.delay(5)

if (genericDATA.internallyGetValue('STATE', configDataRowCounter) == 'GA') {
    // STEP 58: Clicking on textfield in SURPLUSLINE ACK form
    WebUI.click(findTestObject('Application_OR/txtfield_SURPLUSLINE_FORM_TEXT'))

    // Waiting
    WebUI.delay(2)

    // STEP 59: Entering text in SURPLUSLINE ACK form
    WebUI.setText(findTestObject('Application_OR/txtfield_SURPLUSLINE_FORM_TEXT'), 'Testing')

    // Waiting
    WebUI.delay(2)

    // STEP 60: Clicking on SUBMIT button of SURPLUSLINE ACK form after entering data
    WebUI.click(findTestObject('Application_OR/btn_SUBMIT_SURPLUSLINE'))

} else if (genericDATA.internallyGetValue('STATE', configDataRowCounter) == 'VA') {
    WebUI.click(findTestObject('Application_OR/chkbox_NC_SurPlusLine_Agreement'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Application_OR/btn_SUBMIT_SURPLUSLINE'))
} else {
    WebUI.click(findTestObject('Application_OR/chkbox_NC_SurPlusLine_Agreement'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Application_OR/btn_SUBMIT_SURPLUSLINE'))
}

// Waiting
WebUI.delay(5)

// STEP 61: Clicking on SUBMIT FOR UNDERWRITER APPROVAL button
WebUI.click(findTestObject('Application_OR/btn_SUBMIT_FOR_UW_APPROVAL'))

// Waiting
WebUI.delay(8)

// STEP 62: Clicking on LOGOUT button
WebUI.click(findTestObject('Application_OR/btn_LOGOUT'))

// Waiting
WebUI.delay(5)

// STEP 63: Entering an USERNAME in Username textfield
WebUI.setText(findTestObject('Quote_OR/txtfield_USERNAME'), genericDATA.internallyGetValue('UW_USERNAME', configDataRowCounter))

// STEP 64: Entering an PASSWORD in Username textfield
WebUI.setText(findTestObject('Quote_OR/txtfield_PASSWORD'), genericDATA.internallyGetValue('PASSWORD', configDataRowCounter))

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

// STEP 70: Clicking on DOWNLOAD button
WebUI.click(findTestObject('Application_OR/btn_DOWNLOAD_AFS_UW'))

// Waiting
WebUI.delay(5)

WebUI.click(findTestObject('Application_OR/btn_REVIEW_APPLICATION_AT_UW'))

// Waiting
WebUI.delay(5)

WebUI.setText(findTestObject('Application_OR/txtfield_INSPECTION_FEE'), propertyDATA.internallyGetValue('INSPECTION_FEE', 
        propertyDataRowCounter))

// Waiting
WebUI.delay(3)

WebUI.click(findTestObject('Application_OR/drp_NO_OF_MORTAGAGEE'))

// Waiting
WebUI.delay(3)

// STEP 20: Selecting PROPERTY TYPE as "Single Family" from Data files
WebUI.selectOptionByIndex(findTestObject('Application_OR/drp_NO_OF_MORTAGAGEE'), propertyDATA.internallyGetValue('No_Of_MortgageeID1', 
        propertyDataRowCounter))

// Waiting
WebUI.delay(3)

WebUI.click(findTestObject('Application_OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

// Waiting
WebUI.delay(3)

WebUI.setText(findTestObject('Application_OR/txtfield_Mortagagee_Name1'), propertyDATA.internallyGetValue('MortagageeName1', 
        propertyDataRowCounter))

// Waiting
WebUI.delay(3)

WebUI.setText(findTestObject('Application_OR/txtfield_Mortagagee_Address'), propertyDATA.internallyGetValue('MortagageeAddress1', 
        propertyDataRowCounter))

// Waiting
WebUI.delay(3)

WebUI.setText(findTestObject('Application_OR/txtfield_Mortagagee_LoanNo'), propertyDATA.internallyGetValue('MortagageeLoanNo1', 
        propertyDataRowCounter))

// Waiting
WebUI.delay(3)

WebUI.click(findTestObject('Application_OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

// Waiting
WebUI.delay(4)

WebUI.click(findTestObject('Application_OR/btn_SIGNAPPLICATION_AGENT'))

// Waiting
WebUI.delay(4)

// STEP 71: Clicking on GENERATE FORMS button
WebUI.click(findTestObject('Application_OR/btn_GENERATE_FORMS'))

// Waiting
WebUI.delay(5)

// STEP 72: Clicking on REQUEST FOR BIND button
WebUI.click(findTestObject('Application_OR/btn_REQUEST_FOR_BIND'))

// Waiting
WebUI.delay(20)

// STEP 73: Clicking on VIEW FORMS button after Application gets bind
WebUI.click(findTestObject('Application_OR/btn_VIEW_POLICY_FORMS'))

// Waiting
WebUI.delay(15)

// STEP 74: Clicking on Application Status menu
WebUI.click(findTestObject('Application_OR/btn_UW_APPLICATION_STATUS_MENU'))

// Waiting
WebUI.delay(2)

// STEP 75: Clicking on YES button of cofirmation popup.
WebUI.click(findTestObject('Application_OR/btn_YES_CONFIRMATION'))

// Waiting
WebUI.delay(20)