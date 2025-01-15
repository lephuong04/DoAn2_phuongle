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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nettruyenrr.com/')

WebUI.click(findTestObject('Object Repository/Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/span_Ti khon'))

WebUI.click(findTestObject('Object Repository/Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/i_ng k_fa fa-pencil-square-o'))

WebUI.setText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Name_name'), name)

WebUI.setText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Email_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Mt khu_password'), 
    matkhau)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Xc nhn mt khu_cf_password'), 
    xacnhanmatkhau)

WebUI.click(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_ng nhp_ctl00_mainContent_login1_Login_ad5eda'))

