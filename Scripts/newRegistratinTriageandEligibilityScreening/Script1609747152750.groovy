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

WebUI.openBrowser('')

'Maximize current window'
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://data.kenyahmis.org:9100/openmrs/login.htm')

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

WebUI.setText(findTestObject('Buttons/clinicNo'), RandomStringUtils.randomNumeric(8))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/idNo'), RandomStringUtils.randomNumeric(8))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Buttons/surName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/surName'), 'Roy')

WebUI.click(findTestObject('Buttons/firstName'))

WebUI.setText(findTestObject('Buttons/firstName'), 'Roy')

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

WebUI.click(findTestObject('Registration/Forms/County_Bungoma'))

WebUI.click(findTestObject('Registration/Forms/County_Name'))

WebUI.click(findTestObject('Registration/Forms/Sub_county'))

WebUI.click(findTestObject('Registration/Forms/sirisia_subcounty'))

WebUI.click(findTestObject('Registration/Forms/namwela_ward'))

WebUI.click(findTestObject('Registration/Forms/Location'))

WebUI.setText(findTestObject('Registration/Forms/Location'), 'Majengo')

WebUI.click(findTestObject('Registration/Forms/Sub_location'))

WebUI.setText(findTestObject('Registration/Forms/Sub_location'), 'Pumwani')

WebUI.click(findTestObject('Registration/Forms/Village'))

WebUI.setText(findTestObject('Registration/Forms/Village'), 'Majengo')

WebUI.click(findTestObject('Registration/Forms/Landmark'))

WebUI.setText(findTestObject('Registration/Forms/Landmark'), 'majengo school')

WebUI.click(findTestObject('Registration/Forms/Nearest_HC'))

WebUI.setText(findTestObject('Registration/Forms/Nearest_HC'), 'Pumwani hospital')

WebUI.click(findTestObject('Registration/Forms/Next_Kin'))

WebUI.setText(findTestObject('Registration/Forms/Next_Kin'), 'Jane Doe')

WebUI.click(findTestObject('Registration/Forms/Rlnship_kin'))

WebUI.click(findTestObject('Registration/Forms/Rlnship'))

WebUI.click(findTestObject('Registration/Forms/NextKin_Contact'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Contact'), '0763567145')

WebUI.click(findTestObject('Registration/Forms/NextKin_Address'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Address'), '105 Homabay')

WebUI.click(findTestObject('Registration/Forms/SubmitRegistration'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Registration/Forms/CheckinButton'))

WebUI.click(findTestObject('Registration/Forms/SubmitCheckInButton'))

WebUI.click(findTestObject('Registration/Forms/Trige_Button'))

WebUI.click(findTestObject('Registration/Forms/TriageDate'))

WebUI.click(findTestObject('Registration/Forms/Reason_Visit'))

WebUI.setText(findTestObject('Registration/Forms/Reason_Visit'), 'New Client')

WebUI.setText(findTestObject('Registration/Forms/Temp'), '34')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Pulse Rate_w12'), '120')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w14'), '160')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w16'), '150')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Respiratory Rate_w18'), '45')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Oxygen Saturation_w20'), '42')

WebUI.setText(findTestObject('Page_KenyaEMR/input_kg_w22'), '73')

WebUI.setText(findTestObject('Page_KenyaEMR/input_cm_w24'), '166')

WebUI.setText(findTestObject('Registration/Forms/Muac'), '34567')

WebUI.click(findTestObject('Registration/Forms/LMP_textbox'))

WebUI.setText(findTestObject('Registration/Forms/LMP_Date'), '6-12-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/triage_submit'))

WebUI.click(findTestObject('Registration/Forms/HTS_Initial_Button'))

WebUI.click(findTestObject('Registration/Forms/HTS_Date_field'))

WebUI.setText(findTestObject('Registration/Forms/HTS_Date'), '04-Jan-2021')

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_field'))

WebUI.click(findTestObject('Registration/Forms/np_populationtype'))

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Forms/department_opd'))

WebUI.click(findTestObject('Registration/Forms/historytest_no'))

WebUI.click(findTestObject('Registration/Forms/eligiblefortest_yes'))

WebUI.click(findTestObject('Registration/Forms/enterform_elgibilityscreen'))

