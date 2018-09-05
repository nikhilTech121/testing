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
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.weburl)

WebUI.maximizeWindow()

String title = WebUI.getWindowTitle()

String title1 = 'Amazon.com:Online'

if (title.contains('Amazon')) {
    WebUI.comment('Title matched')
} else {
    WebUI.executeJavaScript('alert(\'Page title not matched or any exception\')', null)
}

WebUI.click(findTestObject('Page_Amazon.com Online Shopping for/span_Hello. Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_email'), GlobalVariable.username)

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/input_continue'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_password'), GlobalVariable.Pswd)

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/input_signInSubmit'))

WebUI.delay(3)

logoname =WebUI.getText(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/Amazon SignOff/AmazonLogo'))

//FileInputStream f = new FileInputStream(new File("C:\\Users\\e004475\\Desktop\\Demo.xls"))



WebUI.callTestCase(findTestCase('amazon_demo/TestCase1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/Amazon SignOff/span_Account  Lists'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/span_Sign Out'))

WebUI.closeBrowser()

