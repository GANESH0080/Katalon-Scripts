import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// STEP 1: Declaring variable for URL
String url = 'http://test.cogitate.us/PPE.Test/'

// STEP 2: Open an URL
WebUI.openBrowser(url)

// STEP 3: Waiting for Page
WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

// STEP 4: Maximize Window
WebUI.maximizeWindow()

// STEP 5: Assign variable for PROPERTYDATA Datafile
InternalData propertyDATAA = findTestData('Application-PPEPROPERTYDATA')

// STEP 6: Define an variable and assign total row count of PROPERTYDATA Datafile
int propertyDATARows = propertyDATAA.getRowNumbers()

// STEP 7: Assign variable for PPE_Config_File Datafile
InternalData genericDATAA = findTestData('PPE_Config_File')

// STEP 8: Define an variable and assign total row count of PPE_Config_File Datafile
int genericDATARows = genericDATAA.getRowNumbers()

// STEP 9: Define an username variable
String userName = ''

// STEP 10: Define an password variable
String password = ''

String isUsed = 'N'

String agentName = ''

String agentState = ''

String State = ''

// STEP 11: For loop for getting an Address, State
for (int propertyDataRowCounter = 0; propertyDataRowCounter < propertyDATARows; propertyDataRowCounter++) {
    try {
        isUsed = propertyDATAA.internallyGetValue('Is_Used', propertyDataRowCounter)

        // STEP 12 : Define an State variable
        State = propertyDATAA.internallyGetValue('State', propertyDataRowCounter)

        for (configDataRowCounter = 0; configDataRowCounter < genericDATARows; configDataRowCounter++) {
            agentState = genericDATAA.internallyGetValue('STATE', configDataRowCounter)

            if (agentState == State) {
                userName = genericDATAA.internallyGetValue('USERNAME', configDataRowCounter)

                password = genericDATAA.internallyGetValue('PASSWORD', configDataRowCounter)

                agentName = genericDATAA.internallyGetValue('AgentName', configDataRowCounter)
            }
        }
        
        WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'), userName)

        // STEP 10: Entering PASSWORD from Data file in Password textfield
        WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'), password)

        WebUI.delay(1)

        // STEP 11: Clicking on LOGIN button
        WebUI.click(findTestObject('Quote OR/btn-LOGIN'))

        // Start Variables Declaration
        String Property_Address = propertyDATAA.internallyGetValue('Property_Address', propertyDataRowCounter)

        println(Property_Address)

        String propertyType = propertyDATAA.internallyGetValue('PropertyTypeID', propertyDataRowCounter)

        String constructionType = propertyDATAA.internallyGetValue('ConstructionTypeID', propertyDataRowCounter)

        String homeValuation = propertyDATAA.internallyGetValue('HomeValuation', propertyDataRowCounter)

        String homeBuildYear = propertyDATAA.internallyGetValue('HomeBuildYear', propertyDataRowCounter)

        String pFirstName = propertyDATAA.internallyGetValue('P_FirstName', propertyDataRowCounter)

        String pMiddelName = propertyDATAA.internallyGetValue('P_MiddelName', propertyDataRowCounter)

        String pLastName = propertyDATAA.internallyGetValue('P_LastName', propertyDataRowCounter)

        String contactNumber = propertyDATAA.internallyGetValue('ContactNumber', propertyDataRowCounter)

        String email = propertyDATAA.internallyGetValue('Email', propertyDataRowCounter)

        String pDOB = propertyDATAA.internallyGetValue('P_DOB', propertyDataRowCounter)

        String roofType = propertyDATAA.internallyGetValue('RoofTypeID', propertyDataRowCounter)

        String foundationType = propertyDATAA.internallyGetValue('FoundationTypeID', propertyDataRowCounter)

        String heatingType = propertyDATAA.internallyGetValue('HeatingTypeID', propertyDataRowCounter)

        WebUI.delay(5)

        WebUI.setText(findTestObject('Quote OR/txtfield_ADDRESS_ON_LANDING_PAGE'), Property_Address)

        // STEP 5: Clicking on SERACH ADDRESS button
        WebUI.click(findTestObject('Quote OR/btn_SEARCH_ADDRESS'))

        //Waiting
        WebUI.delay(4)

        if (isUsed == 'Y') {
            // STEP 23: Creating an Object for getting PolicyInfoID
            TestObject hdnPolicyInfoId = findTestObject('Generic OR/hdnPolicyInfoId')

            // STEP 24: Creating String to get the PolicyInfoID
            String policyInfoid = WebUI.getAttribute(hdnPolicyInfoId, 'value')

            // STEP 25: Set PolicyInfoID in Glibal Variable PolicyInfoID
            GlobalVariable.policyInfoId = policyInfoid

            println(policyInfoid)

            // STEP 26: EnClicking on SAVE & CONTINUE button on Policy Holder Info page
            WebUI.click(findTestObject('Application OR/btn_POLICYHOLDER_SAVEANDCONTINUE'))

            // Waiting
            WebUI.delay(5)

            // STEP 27: Clicking on ROOF TYPE dropdown on Property page
            WebUI.click(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'))

            // STEP 28: Selecting ROOF TYPE as "Composition Shingles" on Property page
            WebUI.selectOptionByValue(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'), roofType, false)

            // Waiting
            WebUI.delay(2)

            // STEP 29: Selecting FOUNDATION TYPE as "Basement" on Property page
            WebUI.selectOptionByValue(findTestObject('Application OR/drp_FOUNDATIONTYPE_PROPERTYPAGE'), foundationType, 
                false)

            // Waiting
            WebUI.delay(2)

            // STEP 30: Selecting HEATING TYPE as "Gas Heaters" on Property page
            WebUI.selectOptionByValue(findTestObject('Application OR/drp_HEATINGTYPE_PROPERTYPAGE'), heatingType, false)

            // Waiting
            WebUI.delay(4)

            // STEP 31: Clicking on SAVE & CONTINUE button on Property page
            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            // Waiting
            WebUI.delay(2)

            // STEP 32: Clicking on YES button of ROOF AGE confirmation popup
            WebUI.click(findTestObject('Application OR/btn_YES_ROOFAGE_POPUP'))

            // Waiting
            WebUI.delay(2)

            // STEP 33: Clicking on YES button of ELECTRICAL AGE confirmation popup
            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            // Waiting
            WebUI.delay(2)

            // STEP 34: Clicking on YES button of PLUMBING AGE confirmation popup
            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            // Waiting
            WebUI.delay(5)

            // STEP 35: Clicking on SAVE & CONTINUE button on Occupancy page
            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            // Waiting
            WebUI.delay(5)

            // STEP 36: Checking Agreement checkbox on Coverage page
            WebUI.check(findTestObject('Application OR/chkbx_AGREEMENT'))

            // Waiting
            WebUI.delay(10)

            // STEP 37: Clicking on SAVE & CONTINUE button on Coverage page
            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            // Waiting
            WebUI.delay(5)

            // STEP 38: Clicking on SIGN APPLICATION button on Application summary page
            WebUI.click(findTestObject('Application OR/btn_SIGNAPPLICATION_AGENT'))

            // Waiting
            WebUI.delay(5)

            String getInsuredName = WebUI.getText(findTestObject('Application OR/get_INSUREDNAME_APPLICATION FORMSUMMARY'))

            println(getInsuredName)

            String ele = WebUI.getText(findTestObject('Application OR/btn_INSURED_SIGNATURE'))

            println(ele)

            String stripppedString = ele.trim()

            println(stripppedString)

            if (getInsuredName == stripppedString) {
                // STEP 53: Clicking on AGENT SIGNATURE button
                WebUI.click(findTestObject('Application OR/btn_AGENT_SIGNATURE'))

                // Waiting
                WebUI.delay(2)

                // STEP 54: Clicking on Agent Signature textfield
                WebUI.click(findTestObject('Application OR/txtbx_AGENT_SIGNATURE'))

                // Waiting
                WebUI.delay(2)

                println(agentName)

                WebUI.setText(findTestObject('Application OR/txtbx_AGENT_SIGNATURE'), agentName)

                // STEP 56: Clicking on SUBMIT button after entering Agent Signature
                WebUI.click(findTestObject('Application OR/btn_SUBMIT_AGENT_SIGNATURE'))

                // Waiting
                WebUI.delay(3)

                // STEP 57: Clicking on SURPLUSLINE ACK form button
                WebUI.click(findTestObject('Application OR/btn_SURPLUSLINE_ACK'))

                // Waiting
                WebUI.delay(5)

                if (State == 'NC') {
                    WebUI.click(findTestObject('Application OR/chkbox_NC_SurPlusLine_Agreement'))

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn_SUBMIT_SURPLUSLINE'))

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn_SUBMIT_FOR_UW_APPROVAL'))
                }
                
                if (State == 'GA') {
                    // STEP 58: Clicking on textfield in SURPLUSLINE ACK form
                    WebUI.click(findTestObject('Application OR/txtfield_SURPLUSLINE_FORM_TEXT'))

                    // Waiting
                    WebUI.delay(2)

                    // STEP 59: Entering text in SURPLUSLINE ACK form
                    WebUI.setText(findTestObject('Application OR/txtfield_SURPLUSLINE_FORM_TEXT'), 'Testing')

                    // Waiting
                    WebUI.delay(2)

                    // STEP 60: Clicking on SUBMIT button of SURPLUSLINE ACK form after entering data
                    WebUI.click(findTestObject('Application OR/btn_SUBMIT_SURPLUSLINE'))

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn_SUBMIT_FOR_UW_APPROVAL'))
                }
                
                if (State == 'VA') {
                    WebUI.click(findTestObject('Application OR/chkbx-VA-SURPLUSLINE'))

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn-SUBMIT-SURPLUSLINE'))

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn_SUBMIT_FOR_UW_APPROVAL'))
                }
                
                WebUI.delay(6)

                WebUI.click(findTestObject('Endorsement OR/btn_LOGOUT_UW'))

                WebUI.delay(10)
            } else {
                WebUI.click(findTestObject('Application OR/btn_INSURED_SIGNATURE'))

                WebUI.delay(5)

                WebUI.click(findTestObject('Application OR/txtbx_INSURED_SIGNATURE'))

                WebUI.delay(5)

                WebUI.setText(findTestObject('Application OR/txtbx_INSURED_SIGNATURE'), getInsuredName)

                WebUI.click(findTestObject('Application OR/btn_SUBMIT_INSURED_SIGNATURE'))

                String otpQuery = ('SELECT TOP 1 OtpGenerated FROM PPE_ApplicationForms_trn where PolicyInfoId = ' + GlobalVariable.policyInfoId) + 
                ' Order BY ModifiedDateTime DESC'

                println(('otpQuery' + ' ') + otpQuery)

                'Connect to DB'
                CustomKeywords.'com.PPE.GetingOTP.connectDB'('13.58.119.123', '1433', 'Test_DID', 'PPE', '10#HammerPPEtest')

                'ExecQuery'
                def recordset = CustomKeywords.'com.PPE.GetingOTP.executeQuery'(otpQuery)

                String otp = 0

                while (recordset.next()) {
                    otp = recordset.getObject('OtpGenerated')
                }
                
                println(('otp' + ' ') + otp)

                WebUI.delay(10)

                TestObject txtOtp = findTestObject('Application OR/txtfield-OTP')

                WebUI.setText(txtOtp, otp.toString())

                WebUI.delay(1)

                WebUI.click(findTestObject('Application OR/btn_OTP_VERIFY'))

                WebUI.delay(5)

                WebUI.click(findTestObject('Application OR/btn_AGENT_SIGNATURE'))

                WebUI.delay(2)

                WebUI.click(findTestObject('Application OR/txtbx_AGENT_SIGNATURE'))

                WebUI.delay(2)

                println(agentName)

                WebUI.setText(findTestObject('Application OR/txtbx_AGENT_SIGNATURE'), agentName)

                WebUI.delay(3)

                WebUI.click(findTestObject('Application OR/btn_SUBMIT_AGENT_SIGNATURE'))

                WebUI.delay(5)

                WebUI.click(findTestObject('Application OR/btn_SURPLUSLINE_ACK'))

                WebUI.delay(5)

                if (State == 'NC') {
                    WebUI.click(findTestObject('Application OR/chkbox_NC_SurPlusLine_Agreement'))

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn_SUBMIT_SURPLUSLINE'))
                }
                
                if (State == 'GA') {
                    WebUI.click(findTestObject('Application OR/txtfield_SURPLUSLINE_FORM_TEXT'))

                    WebUI.delay(2)

                    WebUI.setText(findTestObject('Application OR/txtfield_SURPLUSLINE_FORM_TEXT'), 'Testing')

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn_SUBMIT_SURPLUSLINE'))
                }
                
                if (State == 'VA') {
                    WebUI.click(findTestObject('Application OR/chkbx-VA-SURPLUSLINE'))

                    WebUI.delay(2)

                    WebUI.click(findTestObject('Application OR/btn-SUBMIT-SURPLUSLINE'))
                }
                
                WebUI.delay(6)

                WebUI.click(findTestObject('Endorsement OR/btn_LOGOUT_UW'))

                WebUI.delay(10)
            }
        } else {
            WebUI.selectOptionByIndex(findTestObject('Quote OR/drp_PROPERTY_TYPE'), propertyType)

            WebUI.setText(findTestObject('Quote OR/txtfield_HOME_VALUATION'), '')

            WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

            WebUI.selectOptionByIndex(findTestObject('Quote OR/drp_CONSTRUCTION_TYPE'), constructionType)

            WebUI.setText(findTestObject('Quote OR/txtfield_HOME_VALUATION'), homeValuation)

            WebUI.delay(2)

            WebUI.setText(findTestObject('Quote OR/txtbx_YEARHOMEBUILD'), '')

            WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

            WebUI.setText(findTestObject('Quote OR/txtbx_YEARHOMEBUILD'), homeBuildYear)

            WebUI.click(findTestObject('Quote OR/btn_GETQUOTE'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_TOAPPLICATION'))

            WebUI.delay(4)

            WebUI.click(findTestObject('Application OR/btn-YES_IS_BNESS_PREMISES'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn-YES_FOOT_TRAFFIC'))

            WebUI.delay(2)

            WebUI.setText(findTestObject('Application OR/txtfield-Traffic_Percentage'), '11')

            WebUI.delay(3)

            WebUI.click(findTestObject('Application OR/btn_CONTINUE_UW_QUESTIONS'))

            WebUI.delay(3)

            WebUI.setText(findTestObject('Application OR/txtfield-Traffic_Percentage'), '10')

            WebUI.delay(4)

            WebUI.click(findTestObject('Application OR/btn_CONTINUE_UW_QUESTIONS'))

            WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('Application OR/txtfield_INSURED_FIRSTNAME'))

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_FIRSTNAME'), '')

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_FIRSTNAME'), pFirstName)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_MIDDLENAME'), '')

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_MIDDLENAME'), pMiddelName)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_LASTNAME'), '')

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_LASTNAME'), pLastName)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_DOB'), pDOB)

            WebUI.delay(5)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_EMAIL'), email)

            WebUI.delay(5)

            WebUI.setText(findTestObject('Application OR/txtfield_INSURED_CONTACTNUMBER'), contactNumber)

            WebUI.delay(5)

            TestObject hdnPolicyInfoId = findTestObject('Generic OR/hdnPolicyInfoId')

            String policyInfoid = WebUI.getAttribute(hdnPolicyInfoId, 'value')

            GlobalVariable.policyInfoId = policyInfoid

            WebUI.click(findTestObject('Application OR/btn_POLICYHOLDER_SAVEANDCONTINUE'))

            WebUI.delay(8)

            WebUI.click(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'))

            WebUI.delay(3)

            WebUI.selectOptionByValue(findTestObject('Application OR/drp_ROOFTYPE_PROPERTYPAGE'), roofType, false)

            WebUI.delay(2)

            WebUI.selectOptionByValue(findTestObject('Application OR/drp_FOUNDATIONTYPE_PROPERTYPAGE'), foundationType, 
                false)

            WebUI.delay(2)

            WebUI.selectOptionByValue(findTestObject('Application OR/drp_HEATINGTYPE_PROPERTYPAGE'), heatingType, false)

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn_YES_ROOFAGE_POPUP'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/btn_YES_ELECTRICALAGE_POPUP'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            WebUI.delay(5)

            WebUI.check(findTestObject('Application OR/chkbx_AGREEMENT'))

            WebUI.delay(10)

            WebUI.click(findTestObject('Application OR/btn_OCCUPANYPAGE_SAVEANDCONTINUE'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_SIGNAPPLICATION_AGENT'))

            WebUI.delay(5)

            String getInsuredName = WebUI.getText(findTestObject('Application OR/get_INSUREDNAME_APPLICATION FORMSUMMARY'))

            println(getInsuredName)

            WebUI.click(findTestObject('Application OR/btn_INSURED_SIGNATURE'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/txtbx_INSURED_SIGNATURE'))

            WebUI.delay(5)

            WebUI.setText(findTestObject('Application OR/txtbx_INSURED_SIGNATURE'), getInsuredName)

            WebUI.click(findTestObject('Application OR/btn_SUBMIT_INSURED_SIGNATURE'))

            String otpQuery = ('SELECT TOP 1 OtpGenerated FROM PPE_ApplicationForms_trn where PolicyInfoId = ' + GlobalVariable.policyInfoId) + 
            ' Order BY ModifiedDateTime DESC'

            println(('otpQuery' + ' ') + otpQuery)

            'Connect to DB'
            CustomKeywords.'com.PPE.GetingOTP.connectDB'('13.58.119.123', '1433', 'TEST_DID', 'PPE', '10#HammerPPEtest')

            'ExecQuery'
            def recordset = CustomKeywords.'com.PPE.GetingOTP.executeQuery'(otpQuery)

            String otp = 0

            while (recordset.next()) {
                otp = recordset.getObject('OtpGenerated')
            }
            
            println(('otp' + ' ') + otp)

            WebUI.delay(10)

            TestObject txtOtp = findTestObject('Application OR/txtfield-OTP')

            WebUI.setText(txtOtp, otp.toString())

            WebUI.delay(1)

            WebUI.click(findTestObject('Application OR/btn_OTP_VERIFY'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_AGENT_SIGNATURE'))

            WebUI.delay(2)

            WebUI.click(findTestObject('Application OR/txtbx_AGENT_SIGNATURE'))

            WebUI.delay(2)

            WebUI.setText(findTestObject('Application OR/txtbx_AGENT_SIGNATURE'), agentName)

            WebUI.click(findTestObject('Application OR/btn_SUBMIT_AGENT_SIGNATURE'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Application OR/btn_SURPLUSLINE_ACK'))

            WebUI.delay(5)

            if (State == 'NC') {
                WebUI.click(findTestObject('Application OR/chkbox_NC_SurPlusLine_Agreement'))

                WebUI.delay(2)

                WebUI.click(findTestObject('Application OR/btn_SUBMIT_SURPLUSLINE'))

                WebUI.delay(2)

                WebUI.click(findTestObject('Application OR/btn_SUBMIT_FOR_UW_APPROVAL'))
            }
            
            if (State == 'GA') {
                WebUI.click(findTestObject('Application OR/txtfield_SURPLUSLINE_FORM_TEXT'))

                WebUI.delay(2)

                WebUI.setText(findTestObject('Application OR/txtfield_SURPLUSLINE_FORM_TEXT'), 'Testing')

                WebUI.delay(2)

                WebUI.click(findTestObject('Application OR/btn_SUBMIT_SURPLUSLINE'))

                WebUI.delay(2)

                WebUI.click(findTestObject('Application OR/btn_SUBMIT_FOR_UW_APPROVAL'))
            }
            
            if (State == 'VA') {
                WebUI.click(findTestObject('Application OR/chkbx-VA-SURPLUSLINE'))

                WebUI.delay(2)

                WebUI.click(findTestObject('Application OR/btn-SUBMIT-SURPLUSLINE'))

                WebUI.delay(2)

                WebUI.click(findTestObject('Application OR/btn_SUBMIT_FOR_UW_APPROVAL'))
            }
            
            WebUI.delay(6)

            WebUI.click(findTestObject('Endorsement OR/btn_LOGOUT_UW'))

            WebUI.delay(10)
        }
    }
    catch (Exception e) {
        e.printStackTrace()

        WebUI.click(findTestObject('Endorsement OR/btn_LOGOUT_UW'))

        WebUI.delay(10)
    } 
}