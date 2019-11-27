package com.PPE

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class IncorrectLogin 
{
		
	@Keyword
	def login()
	{
		
	// STEP 1 : Entering Incorrect Login credentials 1st time
	// STEP 1.1 : Entering USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'), '125634')
	
	// STEP 1.2 : Entering PASSWORD in Password textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'), '10#Hammer')

	// STEP 1.3 : Clicking on LOGIn button
	WebUI.click(findTestObject('Quote OR/btn-LOGIN'))
	
	// STEP 1.4 : Waiting 
	WebUI.delay(6)
	
	// STEP 2 : Entering Incorrect Login credentials 2nd time
	// STEP 2.1 : Entering USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'),'ih.chelms')
	
	// STEP 2.2 : Entering PASSWORD in Password textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'),'123456')

	// STEP 2.3 : Clicking on LOGIn button
	WebUI.click(findTestObject('Quote OR/btn-LOGIN'))
	
	// STEP 2.4 : Waiting
	WebUI.delay(6)
	
	// STEP 3 : Entering Incorrect Login credentials 3rd time
	// STEP 3.1 : Entering USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'),'ih.jbutler')
	
	// STEP 3.2 : Entering PASSWORD in Password textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'),'123456')

	// STEP 3.3 : Clicking on LOGIn button
	WebUI.click(findTestObject('Quote OR/btn-LOGIN'))
	
	// STEP 3.4 : Waiting
	WebUI.delay(6)
	
	// STEP 4 : Entering Incorrect Login credentials 4th time
	// STEP 4.1 : Entering USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'),'Ganesh')
	
	// STEP 4.2 : Entering PASSWORD in Password textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'),'Salunkhe')

	// STEP 4.3 : Clicking on LOGIn button
	WebUI.click(findTestObject('Quote OR/btn-LOGIN'))
	
	// STEP 4.4 : Waiting
	WebUI.delay(6)
	
	// STEP 5 : Entering Incorrect Login credentials 5th time
	// STEP 5.1 : Entering USERNAME in Username textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_USERNAME'),'ih.william')
	
	// STEP 5.2 : Entering PASSWORD in Password textfield
	WebUI.setText(findTestObject('Quote OR/txtfield_PASSWORD'),'ih.chelms')

	// STEP 5.3 : Clicking on LOGIn button
	WebUI.click(findTestObject('Quote OR/btn-LOGIN'))
	
	// STEP 4.4 : Waiting
	WebUI.delay(6)
	
	}
}