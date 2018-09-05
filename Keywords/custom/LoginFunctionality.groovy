package custom
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

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class LoginFunctionality {
	/**
	 * Login browser
	 */
	@Keyword
	public void loginBrowser() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.url)
		WebUI.click(findTestObject('Page_Amazon.com Online Shopping for/span_Hello. Sign in'))
		WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_email'), GlobalVariable.LoginId)

		WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/input_continue'))
		WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_password'), GlobalVariable.pswd)
		WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/input_signInSubmit'))

		WebUI.delay(3)
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def SearchItem() {
		WebUI.setText(findTestObject('Page_Amazon.com Online Shopping for/Amazon SignOff/Page_Amazon.com Online Shopping for/input_field-keywords'),
				'Motorola  Mobile')

		WebUI.click(findTestObject('Page_Amazon.com Online Shopping for/Amazon SignOff/Page_Amazon.com Online Shopping for/input_nav-input'))

		WebUI.click(findTestObject('Page_Amazon.com Online Shopping for/Amazon SignOff/Amazon Search Box/h2_Motorola Moto C Plus XT1724'))

		WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Page_Amazon.com Online Shopping for/Amazon SignOff/Amazon cart/input_submit.add-to-cart'))

		WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Page_Amazon.com Online Shopping for/Amazon SignOff/Amazon cart/span_Cart'))
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def Logout() {
		WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

		WebUI.mouseOver(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/Amazon SignOff/span_Account  Lists'))

		WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/span_Sign Out'))
	}
}