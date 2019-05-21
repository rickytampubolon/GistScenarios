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

WebUI.click(findTestObject('Object Repository/Create a public gist/TC01/Page_Discover gists  GitHub/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Create a public gist/TC01/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'rickytampubolon97@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create a public gist/TC01/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'aWiFznaQQ9/aU/+XfrlMyg==')

WebUI.click(findTestObject('Object Repository/Create a public gist/TC01/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.navigateToUrl('https://gist.github.com/')

WebUI.setText(findTestObject('Object Repository/Create a public gist/TC01/Page_Create a new Gist/input_See all of your gists_gistdescription'), 
    'Looping in PHP')

WebUI.click(findTestObject('Object Repository/Create a public gist/TC01/Page_Create a new Gist/div_1'))

WebUI.setText(findTestObject('Object Repository/Create a public gist/TC01/Page_Create a new Gist/div_1php 2for (x  0 x  10 x) 3    echo The number is x br4 5'), 
    '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">&lt;?php </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">2</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">for ($x = 0; $x &lt;= 10; $x++) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">3</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">    echo "The number is: $x &lt;br&gt;";</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">4</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">} </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">5</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">?&gt;</span></pre></div>')

WebUI.click(findTestObject('Object Repository/Create a public gist/TC01/Page_Create a new Gist/button_Create public gist'))

