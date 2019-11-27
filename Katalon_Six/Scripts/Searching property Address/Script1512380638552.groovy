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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://13.90.102.191:8066')

WebUI.setText(findTestObject('input_userName'), 'ih.chelms')

WebUI.setText(findTestObject('input_password'), '10#Hammer')

WebUI.click(findTestObject('input_name'))

def info = WebUI.callTestCase(findTestCase('Prepare_property_Address'), [:], FailureHandling.STOP_ON_FAILURE)

def prAddress = info.prAddress

//.replace('[', '').replace(']', '')
print(prAddress)

//def prAddress = data1.to
WebUI.setText(findTestObject('input_formattedAddress'), prAddress)

WebUI.click(findTestObject('button_btnSearchAddress'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('input_PropertyInfo.ValuationRa'), '')

WebUI.selectOptionByIndex(findTestObject('select_PropertyInfo.ExteriorPr'), 2)

WebUI.setText(findTestObject('input_PropertyInfo.ValuationRa'), '100000')

WebUI.click(findTestObject('button_GET QUOTE'))

WebUI.click(findTestObject('input_btnSendQuote'))

WebUI.waitForElementClickable(findTestObject('input_PrimaryApplicant.Applica'), 5)

WebUI.setText(findTestObject('input_PrimaryApplicant.Applica'), 'Ganesh')

WebUI.setText(findTestObject('input_PrimaryApplicant.Applica (1)'), 'Salunkhe')

WebUI.click(findTestObject('input_PropertyInfo.PropertyAdd'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('input_PropertyInfo.PropertyAdd'), '9768180080')

WebUI.setText(findTestObject('input_PropertyInfo.PropertyAdd (1)'), 'gsalunkhe@cogitate.us')

WebUI.click(findTestObject('button_Send Quote Detail'))

WebUI.selectOptionByIndex(findTestObject('select_PropertyInfo.ExteriorPr'), 1)

WebUI.waitForElementClickable(findTestObject('a_RE-CALCULATE PREMIUM'), 5)

WebUI.click(findTestObject('a_RE-CALCULATE PREMIUM'))

for (int i = 1; i <= info.length; i++) {
    if (i > 1) {
		
		Address = i
		print Address
        def infoAdd = WebUI.callTestCase(findTestCase('Pro_Address_Excel_list'), [:], FailureHandling.STOP_ON_FAILURE)
        
        def InfoprAddress = infoAdd.prAddress
        print InfoprAddress
       // WebUI.setText(findTestObject('input_PropertyInfo.ValuationRa'), '')
    }
    
    //println(i)
}

