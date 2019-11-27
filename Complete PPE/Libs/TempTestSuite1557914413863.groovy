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
    TestCaseMain.runTestCase('Test Cases/URL Navigation/Navigate To URL', new TestCaseBinding('Test Cases/URL Navigation/Navigate To URL',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/Login In PPE Application/Incorrect Attempt for Login', new TestCaseBinding('Test Cases/Login In PPE Application/Incorrect Attempt for Login',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_2() {
    TestCaseMain.runTestCase('Test Cases/Login In PPE Application/Login With Correct Credentials', new TestCaseBinding('Test Cases/Login In PPE Application/Login With Correct Credentials',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_3() {
    TestCaseMain.runTestCase('Test Cases/Quote Creation/Creating Quote', new TestCaseBinding('Test Cases/Quote Creation/Creating Quote',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_4() {
    TestCaseMain.runTestCase('Test Cases/Application Creation/Creating an Application', new TestCaseBinding('Test Cases/Application Creation/Creating an Application',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_5() {
    TestCaseMain.runTestCase('Test Cases/UW Endorsement/UW END', new TestCaseBinding('Test Cases/UW Endorsement/UW END',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_6() {
    TestCaseMain.runTestCase('Test Cases/Agent Endorsment Req/Agent END', new TestCaseBinding('Test Cases/Agent Endorsment Req/Agent END',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_7() {
    TestCaseMain.runTestCase('Test Cases/Endorsement Approval/END Appproval', new TestCaseBinding('Test Cases/Endorsement Approval/END Appproval',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_8() {
    TestCaseMain.runTestCase('Test Cases/UW Cancellation/UW CAN', new TestCaseBinding('Test Cases/UW Cancellation/UW CAN',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/PPE')

suiteProperties.put('name', 'PPE')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Katalon_Practice_Workspace\\Complete PPE\\Reports\\PPE\\20190515_153013\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('PPE', suiteProperties)

(0..8).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

KeywordLogger.getInstance().endSuite('PPE', null)
