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


class CartSteps {
	@Given("User acess to application shopit")
	def acessLoginWindow() {
		Windows.startApplicationWithTitle('C:\\Users\\safaf\\Desktop\\Release\\WindowsFormsApp1.exe', '')
	}

	@When("User enters his (.*) and his (.*)")
	def enterHisCredentials(String email, String password) {
		Windows.setText(findWindowsObject('Object Repository/cartTC/Edit'), 'tunis')

		Windows.setText(findWindowsObject('Object Repository/cartTC/Edit(1)'), 'tunis')
	}
	@And("User click login into application")
	def login(){
		Windows.click(findWindowsObject('Object Repository/cartTC/Button'))
	}
	@And("User access home successfuly")
	def loginSuccessful(){

		Windows.switchToWindowTitle('Home')

		Windows.click(findWindowsObject('Object Repository/cartTC/Button(1)'))
	}
	@And("User click cart button")
	def acessToCart(){
		Windows.click(findWindowsObject('Object Repository/cartTC/Button(2)'))
		
		Windows.switchToWindowTitle('Cart')
	}
	@And("User click remove button of one product")
	def removeProduct(){
		Windows.click(findWindowsObject('Object Repository/cartTC/DataItem'))
		Windows.switchToWindowTitle('Cart')

		Windows.click(findWindowsObject('Object Repository/cartTC/Button(3)'))
	}
	@And("User click order now button")
	def orderProduct(){

		Windows.click(findWindowsObject('Object Repository/cartTC/Button(4)'))

		Windows.switchToWindowTitle('Cart')
	}
	@And("User acess to facutre window")
	def accessFacture(){
		Windows.click(findWindowsObject('Object Repository/cartTC/Button(5)'))

		Windows.switchToWindowTitle('Form9')
	}
	@And("User click place order button")
	def order() {
		Windows.click(findWindowsObject('Object Repository/cartTC/Button(6)'))

		Windows.switchToWindowTitle('Form10')
	}
	@And("User entrer (.*) , (.*) and check payment method")
	def filingForm(String adresse, String contactNo) {
		Windows.setText(findWindowsObject('Object Repository/cartTC/adresse'), 'sayada')
		Windows.switchToWindowTitle('Form10')
		Windows.setText(findWindowsObject('Object Repository/cartTC/contact'), 'tunis')
		Windows.click(findWindowsObject('Object Repository/cartTC/CheckBox_cashOnDelivery'))
		Windows.click(findWindowsObject('Object Repository/cartTC/CheckBox(2)'))
	}
	@And("User click checkout button")
	def checkoutOrder() {
		Windows.click(findWindowsObject('Object Repository/cartTC/Button(7)'))
	}
	@Then("transaction should be saved")
	def finishTransaction() {
		Windows.click(findWindowsObject('Object Repository/cartTC/Text'))
	}
}