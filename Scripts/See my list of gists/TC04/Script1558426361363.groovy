import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Object Repository/See my list of gists/TC04/Page_Discover gists  GitHub/a_Signin'))

WebUI.setText(findTestObject('Object Repository/See my list of gists/TC04/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'rickytampubolon97@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/See my list of gists/TC04/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'aWiFznaQQ9/aU/+XfrlMyg==')

WebUI.click(findTestObject('Object Repository/See my list of gists/TC04/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/See my list of gists/TC04/Page_Discover gists/span_Back to GitHub_dropdown-caret'))

WebUI.click(findTestObject('Object Repository/See my list of gists/TC04/Page_Discover gists/a_Your gists'))

