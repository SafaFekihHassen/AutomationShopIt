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

Windows.setText(findWindowsObject('Object Repository/shopTC/Edit'), 'tunis')

Windows.setText(findWindowsObject('Object Repository/shopTC/Edit(1)'), 'tunis')

Windows.click(findWindowsObject('Object Repository/shopTC/Button'))

Windows.switchToWindowTitle('Home')

Windows.click(findWindowsObject('Object Repository/shopTC/Button(1)'))

Windows.click(findWindowsObject('Object Repository/shopTC/Button(2)'))

Windows.switchToWindowTitle('Products')

Windows.click(findWindowsObject('Object Repository/shopTC/Button(3)'))

Windows.switchToWindowTitle('Smartphone')

Windows.click(findWindowsObject('Object Repository/shopTC/DataItem'))

Windows.switchToWindowTitle('Huawei Mate 20 X')

Windows.click(findWindowsObject('Object Repository/shopTC/Button(4)'))

Windows.switchToWindowTitle('Huawei Mate 20 X')

Windows.click(findWindowsObject('Object Repository/shopTC/Button(5)'))

Windows.click(findWindowsObject('Object Repository/shopTC/Button(6)'))

Windows.switchToWindowTitle('Smartphone')

Windows.click(findWindowsObject('Object Repository/shopTC/Button(7)'))

Windows.closeApplication()

