import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// STEP 1: Declaring variable for URL
String url = 'http://test.cogitate.us/PPE.Test/'

// STEP 2: Open an URL
WebUI.openBrowser(url)

// STEP 3: Waiting for Page
WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

// STEP 4: Maximize Window
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'), 'ih.william')

// STEP 10: Entering PASSWORD from Data file in Password textfield
WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'), '10#Hammer')

WebUI.delay(1)

// STEP 11: Clicking on LOGIN button
WebUI.click(findTestObject('Quote OR/btn-LOGIN'))

// STEP 5: Assign variable for PROPERTYDATA Datafile
InternalData propertyDATAA = findTestData('Application-PPEPROPERTYDATA')

// STEP 6: Define an variable and assign total row count of PROPERTYDATA Datafile
int propertyDATARows = propertyDATAA.getRowNumbers()

println(propertyDATARows)

// STEP 7: Assign variable for PPE_Config_File Datafile
InternalData genericDATAA = findTestData('PPE_Config_File')

// STEP 8: Define an variable and assign total row count of PPE_Config_File Datafile
int genericDATARows = genericDATAA.getRowNumbers()

println(genericDATARows)

// STEP 11: For loop for getting an Address, State
for (propertyDataRowCounter = 0; propertyDataRowCounter < propertyDATARows; propertyDataRowCounter++) {
    String Property_Address = propertyDATAA.internallyGetValue('Property_Address', propertyDataRowCounter)

    WebUI.click(findTestObject('UW Application Approval/lnk-AdvanceFilter'))

    WebUI.delay(1)

    WebUI.click(findTestObject('UW Application Approval/txtbx-PropertyAddress'))

    WebUI.delay(1)

    println(Property_Address)

    String Property_AddressTrim = Property_Address.substring(0, 10)

    println(Property_AddressTrim)

    WebUI.setText(findTestObject('UW Application Approval/txtbx-PropertyAddress'), Property_AddressTrim)

    WebUI.delay(4)

    WebUI.click(findTestObject('UW Application Approval/btn-ApplyAdvanceFilter'))

    WebUI.delay(2)

    String applicationStatus = WebUI.getText(findTestObject('UW Application Approval/get-ApplicationStatus'))

    String actualstatus = applicationStatus.substring(0, 8)

    println(actualstatus)

    String expectedStatus = 'Approved'

    if (!(expectedStatus.equalsIgnoreCase(actualstatus))) {
        String PolicyInfoID = WebUI.getAttribute(findTestObject('UW Application Approval/btn-ViewApplicationUW'), 'value')

        println(PolicyInfoID)

        // STEP 66: Creating String to get PolicyInfoID
        String btnId = ('//*[@id="btnLoadApplication_' + PolicyInfoID) + '"]'

        println(btnId)

        // STEP 67: Creating Object
        TestObject btnViewApplication = new TestObject('btnViewApplication')

        // STEP 68: Verify VIEW button
        btnViewApplication.addProperty('xpath', ConditionType.EQUALS, btnId, true)

        // Waiting
        WebUI.delay(3)

        // STEP 69: Clicking on VIEW button
        WebUI.click(btnViewApplication)

        // Waiting
        WebUI.delay(2)

        WebUI.click(findTestObject('Application OR/btn_GENERATE_FORMS'))

        WebUI.delay(2)

        WebUI.click(findTestObject('UW Application Approval/btn-RequestForBind'))

        WebUI.delay(15)

        WebUI.click(findTestObject('Application OR/btn_UW_APPLICATION_STATUS_MENU'))

        WebUI.delay(3)

        WebUI.click(findTestObject('UW Application Approval/btn-YesConfirmationPopUp'))

        WebUI.delay(6)
    }
}