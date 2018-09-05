import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.event.KeyEvent

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

CustomKeywords.'custom.LoginFunctionality.loginBrowser'()
WebUI.delay(2)
WebUI.rightClick(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/Amazon SignOff/Page_Amazon.com Online Shopping for/BrowserHistory'))
Robot rb = new Robot()
rb.keyPress(KeyEvent.VK_RIGHT)
rb.keyRelease(KeyEvent.VK_RIGHT)
rb.keyPress(KeyEvent.VK_ENTER)
rb.keyRelease(KeyEvent.VK_ENTER)
Thread.sleep(2)
rb.keyPress(KeyEvent.VK_CONTROL)
rb.keyPress(KeyEvent.VK_SHIFT)
rb.keyPress(KeyEvent.VK_TAB)
rb.keyRelease(KeyEvent.VK_CONTROL)
rb.keyRelease(KeyEvent.VK_TAB)
Thread.sleep(2)
rb.keyPress(KeyEvent.VK_CONTROL)
rb.keyPress(KeyEvent.VK_W)
Thread.sleep(2000)
text=WebUI.getText(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/Amazon SignOff/Page_Amazon.com Online Shopping for/BrowserHistory'))
println 'text'

