import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shieldqa-adflegalrv2.cs92.force.com/ApplicationBlackstoneCommunity/s/login/SelfRegister')

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Registration objects/Page_Register/input__firstname'), 'Test')

WebUI.setText(findTestObject('Object Repository/Registration objects/Page_Register/input__lastname'), 'Katalon2')

WebUI.setText(findTestObject('Object Repository/Registration objects/Page_Register/input__email'), 'TestKatalon2@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Registration objects/Page_Register/form_First NameLast NameEmail AddressUserna_ae5153'), 
    'TestKatalon2')

WebUI.click(findTestObject('Object Repository/Registration objects/Page_Register/button_Register'))

