import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://data.kenyahmis.org:8400/openmrs/login.htm')

WebUI.setText(findTestObject('Buttons/userName'), 'Admin')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Buttons/password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Buttons/loginButton'))

WebUI.click(findTestObject('Buttons/homeButton'))

WebUI.click(findTestObject('Buttons/Registrationbutton'))

WebUI.click(findTestObject('Buttons/findCreate'))

WebUI.click(findTestObject('Buttons/createNewPatient'))

WebUI.click(findTestObject('Buttons/newReg'))

WebUI.waitForElementClickable(findTestObject('Buttons/clinicNo'), 0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/clinicNo'), clinicNumber)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/idNo'), idNumber)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Buttons/surName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/surName'), 'Marion')

WebUI.click(findTestObject('Buttons/firstName'))

WebUI.setText(findTestObject('Buttons/firstName'), 'Jonathan')

WebUI.click(findTestObject('Buttons/gender/femal'))

WebUI.click(findTestObject('Buttons/idNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('date/birthDate'))

WebUI.setText(findTestObject('date/birthDate'), '20-Feb-1990')

WebUI.click(findTestObject('date/birthDateDone'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('date/estimateAge'))

WebUI.click(findTestObject('date/fromAgeButton'))

WebUI.click(findTestObject('date/enterAge'))

WebUI.setText(findTestObject('date/enterAge'), '15')

WebUI.click(findTestObject('date/submitEstAge'))

WebUI.delay(2)

WebUI.click(findTestObject('maritalStatus/mainStatus'))

WebUI.click(findTestObject('maritalStatus/polygamous'))

WebUI.delay(2)

WebUI.click(findTestObject('Buttons/occup/Occupation'))

WebUI.click(findTestObject('Buttons/occup/farmer'))

WebUI.delay(2)

WebUI.click(findTestObject('education/education'))

WebUI.click(findTestObject('education/secondarySchool'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/Phone_Number'))

WebUI.setText(findTestObject('Registration/Forms/Phone_Number'), '0734567892')

WebUI.click(findTestObject('Registration/Forms/Alt_Phone_Num'))

WebUI.setText(findTestObject('Registration/Forms/Alt_Phone_Num'), '0734621568')

WebUI.click(findTestObject('Registration/Forms/Postal_Address'))

WebUI.setText(findTestObject('Registration/Forms/Postal_Address'), '4444 Kisumu')

WebUI.click(findTestObject('Registration/Forms/Email'))

WebUI.setText(findTestObject('Registration/Forms/Email'), 'val123@gmail.com')

WebUI.click(findTestObject('Registration/Forms/County'))

WebUI.click(findTestObject('Registration/Forms/County_Name'))

WebUI.click(findTestObject('Registration/Forms/Sub_county'))

WebUI.setText(findTestObject('Registration/Forms/Sub_county'), 'Kisumu')

WebUI.click(findTestObject('Registration/Forms/ward'))

WebUI.setText(findTestObject('Registration/Forms/ward'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Location'))

WebUI.setText(findTestObject('Registration/Forms/Location'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Sub_location'))

WebUI.setText(findTestObject('Registration/Forms/Sub_location'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Village'))

WebUI.setText(findTestObject('Registration/Forms/Village'), 'kajulu')

WebUI.click(findTestObject('Registration/Forms/Landmark'))

WebUI.setText(findTestObject('Registration/Forms/Landmark'), 'kajulu school')

WebUI.click(findTestObject('Registration/Forms/Nearest_HC'))

WebUI.setText(findTestObject('Registration/Forms/Nearest_HC'), 'kajulu hospital')

WebUI.click(findTestObject('Registration/Forms/Next_Kin'))

WebUI.setText(findTestObject('Registration/Forms/Next_Kin'), 'katalon tester')

WebUI.click(findTestObject('Registration/Forms/Rlnship_kin'))

WebUI.click(findTestObject('Registration/Forms/Rlnship'))

WebUI.click(findTestObject('Registration/Forms/NextKin_Contact'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Contact'), '0763567145')

WebUI.click(findTestObject('Registration/Forms/NextKin_Address'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Address'), '4444 kisumu')

WebUI.click(findTestObject('Registration/Forms/SubmitRegistration'))

