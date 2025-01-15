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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/span_Ti khon'))

WebUI.click(findTestObject('Object Repository/Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/i_ng nhp_fa fa-user'))

WebUI.setText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Email_email'), 'lethiphuong02102004@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Mt khu_password'), 
    'bs87ZNC4+sk=')

WebUI.click(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_ng k_ctl00_mainContent_login1_LoginCt_5c7369'))

WebUI.scrollToElement(findTestObject('Page_NetTruyen  c Truyn Tranh Online Min Ph - Cp Nht Lin Tc/scroll'), 1)

WebUI.doubleClick(findTestObject('Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/a_Chapter 259'))

WebUI.scrollToElement(findTestObject('Page_Ta Tri Sinh  L Nhn Vt Phn Din Chap 259_337116/a_S dng mi tn tri () hoc phi ()  chuyn chap_438ddf'), 
    1)

WebUI.click(findTestObject('Page_Ta Tri Sinh  L Nhn Vt Phn Din Chap 259_337116/a_S dng mi tn tri () hoc phi ()  chuyn chap_438ddf'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Ta Tri Sinh  L Nhn Vt Phn Din Chap 258_43a2a5/a_S dng mi tn tri () hoc phi ()  chuyn chap_ea74e2'), 
    1)

WebUI.click(findTestObject('Object Repository/Page_Ta Tri Sinh  L Nhn Vt Phn Din Chap 258_43a2a5/i_S dng mi tn tri () hoc phi ()  chuyn chap_4d963c'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Ta Tri Sinh  L Nhn Vt Phn Din Chap 259_337116/a_Theo di'), 
    1)

WebUI.click(findTestObject('Object Repository/Page_Ta Tri Sinh  L Nhn Vt Phn Din Chap 259_337116/a_Theo di'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ta Tri Sinh  L Nhn Vt Phn Din Chap 259_337116/span_B theo di'), 
    'Bỏ theo dõi')

WebUI.closeBrowser()

