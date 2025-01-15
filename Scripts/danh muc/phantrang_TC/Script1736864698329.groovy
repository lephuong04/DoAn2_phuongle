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

WebUI.click(findTestObject('Object Repository/Page_NetTruyen  c Truyn Tranh Online Min Ph_c6bf41/a_Hot'))

WebUI.click(findTestObject('Object Repository/Page_Truyn Tranh Hot - NetTruyen/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Truyn Tranh Hot - NetTruyen - Trang 2/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Truyn Tranh Hot - NetTruyen - Trang 3/a_Manhua'))

WebUI.click(findTestObject('Object Repository/Page_Top Truyn Tranh Manhua  c Truyn Tranh _9d7cfc/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Truyn ang theo di - NetTruyen/a_Manhwa'))

WebUI.click(findTestObject('Object Repository/Page_Top Truyn Tranh Manhwa  c Truyn Tranh _742300/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Top Truyn Tranh Manhwa  c Truyn Tranh _9617f2/a_Ngn tnh'))

WebUI.click(findTestObject('Object Repository/Page_Truyn Tranh Ngn Tnh Hay Nht - Truyn Tr_60b788/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Truyn Tranh Ngn Tnh Hay Nht - Truyn Tr_3d2df0/a_Con gi'))

WebUI.click(findTestObject('Object Repository/Page_Truyn tranh dnh cho con gi - NetTruyen/a_2'))

