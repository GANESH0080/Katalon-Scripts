import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



def static runTestCase_0() {
    TestCaseMain.runTestCase('Test Cases/Open_Browser', new TestCaseBinding('Test Cases/Open_Browser',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/Entering Username', new TestCaseBinding('Test Cases/Entering Username',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_2() {
    TestCaseMain.runTestCase('Test Cases/Entering Password', new TestCaseBinding('Test Cases/Entering Password',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_3() {
    TestCaseMain.runTestCase('Test Cases/Wait time', new TestCaseBinding('Test Cases/Wait time',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_4() {
    TestCaseMain.runTestCase('Test Cases/Click Submit', new TestCaseBinding('Test Cases/Click Submit',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_5() {
    TestCaseMain.runTestCase('Test Cases/Wait for Clicking LogOut button', new TestCaseBinding('Test Cases/Wait for Clicking LogOut button',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_6() {
    TestCaseMain.runTestCase('Test Cases/Clicking on Logout Button', new TestCaseBinding('Test Cases/Clicking on Logout Button',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/PPE_Login')

suiteProperties.put('name', 'PPE_Login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Katalon_Practice_Workspace\\Beginner Three\\Reports\\PPE_Login\\20180502_171457\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('PPE_Login', suiteProperties)

(0..6).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

KeywordLogger.getInstance().endSuite('PPE_Login', null)
