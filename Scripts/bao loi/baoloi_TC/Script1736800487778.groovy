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

WebUI.click(findTestObject('Object Repository/Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Email_email'), 'lethiphuong02102004@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_Mt khu_password'), 
    'bs87ZNC4+sk=')

WebUI.click(findTestObject('Object Repository/Page_NetTruyen Chnh Thc - c Truyn Tranh Online/input_ng k_ctl00_mainContent_login1_LoginCt_5c7369'))

WebUI.click(findTestObject('Object Repository/Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/a_Chapter 173'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Gc Cao Khung Thnh Chap 138 Next Chap 139 - NetTruyen/div_QC'))

WebUI.click(findTestObject('Object Repository/Page_B Ti L c V Chap 173 Next Chap 174 - NetTruyen/a_Bo li'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_B Ti L c V Chap 173 Next Chap 174 - NetTruyen/select_--Chn loi li--   nh li, khng thy nh _96f8c9'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_B Ti L c V Chap 173 Next Chap 174 - NetTruyen/textarea_nh ti lu hay li ton b nh_report_er_ea4cb5'), 
    'rudtuftu')

WebUI.click(findTestObject('Object Repository/Page_B Ti L c V Chap 173 Next Chap 174 - NetTruyen/button_Gi'))

WebUI.click(findTestObject('Object Repository/Page_B Ti L c V Chap 173 Next Chap 174 - NetTruyen/button_OK'))

