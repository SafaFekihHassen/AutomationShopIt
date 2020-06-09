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

Windows.startApplicationWithTitle('C:\\Users\\safaf\\Desktop\\Release\\WindowsFormsApp1.exe', '')

Windows.setText(findWindowsObject('Object Repository/orderTC/Edit'), 'tunis')

Windows.setText(findWindowsObject('Object Repository/orderTC/Edit(1)'), 'tunis')

Windows.click(findWindowsObject('Object Repository/orderTC/Button'))

Windows.switchToWindowTitle('Home')

Windows.click(findWindowsObject('Object Repository/orderTC/Button(1)'))

Windows.click(findWindowsObject('Object Repository/orderTC/Button(2)'))

Windows.switchToWindowTitle('Form11')

Windows.click(findWindowsObject('Object Repository/orderTC/Button(3)'))

Windows.switchToWindowTitle('Form11')

Windows.click(findWindowsObject('Object Repository/orderTC/Text'))

Windows.closeApplication()

