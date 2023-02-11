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

Mobile.startApplication('C:\\Users\\asus\\AppData\\Local\\Android\\Sdk\\platform-tools\\Android-MyDemoAppRN.1.3.0.build-244.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup (2)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup (4)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.widget.TextView - Add To Cart (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup (7)'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.widget.TextView - Proceed To Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/DemoApp-pembelian/android.widget.EditText'), 'bob@example.com', 0)

Mobile.setText(findTestObject('Object Repository/DemoApp-pembelian/android.widget.EditText (1)'), '10203040', 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-pembelian/android.view.ViewGroup (8)'), 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - Rebecca Winter'), 'Rececca Winter', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - Mandorley 112'), 'Mandorley 112', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - Entrance 1'), 'Entrance 123', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - Truro'), 'Bekasi', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - Cornwall'), 'Jakbar', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - 89750'), '12345', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - United Kingdom'), 'Indonesia', 0)

Mobile.tap(findTestObject('DemoApp-pembelian/android.widget.TextView - To Payment'), 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - Rebecca Winter (1)'), 'Rececca Winter', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - 3258 1265 7568 789'), '111124245958776', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - 0325'), '0426', 0)

Mobile.setText(findTestObject('DemoApp-pembelian/android.widget.EditText - 123'), '678', 0)

Mobile.tap(findTestObject('DemoApp-pembelian/android.widget.TextView - Review Order'), 0)

Mobile.tap(findTestObject('DemoApp-pembelian/android.widget.TextView - Place Order'), 0)

Mobile.closeApplication()

