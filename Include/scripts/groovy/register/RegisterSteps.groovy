package register
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterSteps {
	@Given("User access to shopit application")
	def acessToLoginPage(){
		Windows.startApplicationWithTitle('C:\\Users\\safaf\\Desktop\\Release\\WindowsFormsApp1.exe', '')
		
	}
	@When("User click register button")
	def quitLoginWindow(){
		Windows.click(findWindowsObject('Object Repository/registerTC/registerButton'))
	}
	@And("User acess to register window")
	def accessRegister(){
		Windows.switchToWindowTitle('Register')
	}
	@And("User tapes (.*) and (.*) and (.*) and (.*)")
	def enterNameandEmail(String username, String email, String password,String repassword){
		
		Windows.setText(findWindowsObject('Object Repository/registerTC/username_textBox'), email)
		
		Windows.setText(findWindowsObject('Object Repository/registerTC/email_textBox'), username)
		
		Windows.setText(findWindowsObject('Object Repository/registerTC/password_textBox'), password)
		
		Windows.setText(findWindowsObject('Object Repository/registerTC/repsw_textBox'), repassword)


	}
	
	

	@Then("user account is succeffuly created")
	def createAccount(){
		Windows.click(findWindowsObject('Object Repository/registerTC/okButton'))
		
		
	}
}