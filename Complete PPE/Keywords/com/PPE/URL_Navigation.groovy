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
import com.kms.katalon.core.testdata.InternalData

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



public class url_Navigation
{

	@Keyword
	def gotoURL()
	{
		int configDataRowCounter = 0;
		// Path of Data file created under DATA FILES
		InternalData genericDATA = findTestData("PPE_Config_File")
		
		// STEP 1: Navigating to URL
		WebUI.openBrowser(genericDATA.internallyGetValue("URL", configDataRowCounter))
		
		// STEP 2: Waiting for Page
		WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)
		
		// STEP 3: Maximize Window
		WebUI.maximizeWindow()
	
	}
}
