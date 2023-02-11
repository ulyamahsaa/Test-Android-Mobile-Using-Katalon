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

Mobile.tap(findTestObject('Object Repository/DemoApp-Latitude_Longitude/android.widget.ImageView - Menu Bar'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-Latitude_Longitude/android.widget.TextView - Geo Location'), 0)

Mobile.tap(findTestObject('DemoApp-Latitude_Longitude/android.widget.TextView - Stop Observing'), 0)

latitude = Mobile.getText(findTestObject('DemoApp-Latitude_Longitude/android.widget.TextView - Latitude Value'), 0)

longitude = Mobile.getText(findTestObject('DemoApp-Latitude_Longitude/android.widget.TextView - Longitude Value'), 0)

Mobile.tap(findTestObject('DemoApp-Latitude_Longitude/android.widget.ImageView - Menu Bar (1)'), 0)

Mobile.tap(findTestObject('Object Repository/DemoApp-Latitude_Longitude/android.widget.TextView - Log In'), 0)

Mobile.setText(findTestObject('DemoApp-Latitude_Longitude/android.widget.EditText - Input Username'), latitude, 0)

Mobile.setText(findTestObject('DemoApp-Latitude_Longitude/android.widget.EditText - Input Password'), longitude, 0)

Mobile.closeApplication()

