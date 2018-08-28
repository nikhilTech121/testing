import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

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
/*WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)
String title = WebUI.getText(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/seelItem'))
println(title)*/
//String text = WebUI.getText(findTestObject('Object Repository/searchbtn'))

//CustomKeywords.'custom.keywordCustom.DemoKey'(title)

File fis = new File("C:\\Users\\e004475\\Desktop\\test.xls")
FileInputStream f = new FileInputStream(fis)
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.getSheet("Sheet1");
Row r = new Row();
print(sheet);
String r = sheet.getRow(1).createCell(1).setCellValue("pass");
print(r);
FileOutputStream out = new FileOutputStream(fis)
workbook.write(out);
out.close()
	

//WebUI.closeBrowser()
