import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// STEP 1 : Navigating to URL
WebUI.openBrowser('http://13.90.102.191:8066/')

// STEP 2 : Maximize Window
WebUI.maximizeWindow()

 
  // Specify the path of file
  File src=new File("D:\\Katalon_Practice_Workspace\\Data_Driven_ExcelSheet\\Data Files\\PPE_Excel.xlsx");
 
   // load file
   FileInputStream fis=new FileInputStream(src);
 
   // Load workbook
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   
   // Load sheet- Here we are loading first sheetonly
      XSSFSheet sh1= wb.getSheetAt(0);

	 String state =  System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());

if (state == 'GA')
{

// STEP 3 : Entering USERNAME in Username textfield
WebUI.setText(findTestObject('txtfield_USERNAME'), 'ih.chelms')

// STEP 4 : Entering PASSWORD in Password textfield
WebUI.setText(findTestObject('txtfield_PASSWORD'), '10#Hammer')

// STEP 5 : Clicking on LOGIn button
WebUI.click(findTestObject('btn-LOGIN'))

}
else
{
	// STEP 3 : Entering USERNAME in Username textfield
	WebUI.setText(findTestObject('txtfield_USERNAME'), 'ih.jbutler')
	
	// STEP 4 : Entering PASSWORD in Password textfield
	WebUI.setText(findTestObject('txtfield_PASSWORD'), '10#Hammer')
	
	// STEP 5 : Clicking on LOGIn button
	WebUI.click(findTestObject('btn-LOGIN'))
	

}
