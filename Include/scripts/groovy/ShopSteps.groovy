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




class ShopSteps {

	@Given("User acess to application")
	def acessLoginWindow() {
		Windows.startApplicationWithTitle('C:\\Users\\safaf\\Desktop\\Release\\WindowsFormsApp1.exe', '')
	}

	@When("User login into app enters (.*) and (.*)")
	def enterCredentials(String email, String password) {
		Windows.setText(findWindowsObject('Object Repository/shopTC/Edit'), email)
		Windows.setText(findWindowsObject('Object Repository/shopTC/Edit(1)'), password)
	}
	@And("User click login button")
	def login(){
		Windows.click(findWindowsObject('Object Repository/shopTC/Button'))
	}
	@And("login successful")
	def loginSuccessful(){

		Windows.switchToWindowTitle('Home')
		Windows.click(findWindowsObject('Object Repository/shopTC/Button(1)'))
	}
	@And("User click shop button")
	def acessProducts(){
		Windows.click(findWindowsObject('Object Repository/shopTC/Button(2)'))
	}
	@And("User acess product window and choose category")
	def chooseProduct(){
		Windows.switchToWindowTitle('Products')
	}
	@And("user click detail button")
	def accessProductChoosed(){
		Windows.click(findWindowsObject('Object Repository/shopTC/Button(3)'))

		Windows.switchToWindowTitle('Smartphone')
	}
	@And("User ckick add to cart button")
	def addProductCart(){
		Windows.click(findWindowsObject('Object Repository/shopTC/DataItem'))
	}
	@Then("product is aded to list of orders")
	def finishShopping() {
		Windows.switchToWindowTitle('Huawei Mate 20 X')
	}
}