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

WebUI.navigateToUrl('https://data.kenyahmis.org:8400/openmrs/login.htm;jsessionid=7AF34DFFAB8B52661D0459F9330ACC56?redirect=kenyaemr%2Fclinician%2FclinicianViewPatient.page%3FpatientId%3D2767%26')

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Username_uname'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Password_pw'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Login'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_Drug Orders'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/div_Standard Regimen Order'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Refill'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Date_orderDate_date'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_3'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/textarea_Units_ng-valid ng-dirty'), 'Any other Instructions')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Order Regimen'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Dispense'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/div_Other Drug Orders'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Date_singleDrugorderDate_date'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_3'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_New order for_sel-drug8241input'), 'ctx')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_Sulfamethoxazole 400 MG  Trimethoprim 80 MG Oral'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Instructions_ng-valid-number ng-valid_c89bbd'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Instructions_sel-concept3144input'), '30')

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Instructions_sel-freq6216input'), '3')

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Instructions_sel-concept8936input'), 'or')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/strong_Or'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_As needed for_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_For_ng-valid ng-valid-number ng-valid_f22861'), 
    '30')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_For_sel-concept3910input'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_For_sel-concept3910input'), 'd')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_Days'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/textarea_Units_ng-valid ng-dirty'), 'None')

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_For outpatient orders_ng-valid-number_ed3c96'), 
    '30')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_For outpatient orders_sel-concept1492input'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Instructions_sel-concept3144input'), 'mi')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_Milligram'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Instructions_sel-freq6216input'), 'o')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_Once daily'))

WebUI.setText(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_For outpatient orders_sel-concept1492input'), 
    'mi')

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_Milligram'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Add'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Sign and Save'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Dispense'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Date_singleDrugorderDate_date'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_3'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Sign and Save'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/span_Back to Client home'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_Lab Orders'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/div_Create New Order(s)'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/div_Blood'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_HIV MONITORING'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_HIV MONITORING'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_HIV MONITORING_feature'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_ROUTINE_fa fa-calendar fa-1x'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Date_orderDate_date'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_3'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Close'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/td_HIV VIRAL LOAD_ng-binding'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/td_HIV VIRAL LOAD_ng-binding'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/td_HIV VIRAL LOAD_ng-binding'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_ROUTINE_fa fa-warning fa-1x'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/select_Clinical treatment failurePregnancyB_cf109a'), 
    '162080AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/div_Enter Lab Result(s)'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_(03-03-2020)_feature'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/span_LDL_float-left btn-xl fa fa-calendar f_c0bb34'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/input_Date_dateOrderVl_date'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/a_3'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Save_1_2'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Back to client home'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Check out of visit'))

WebUI.click(findTestObject('Object Repository/Drug and Lab/Page_KenyaEMR/button_Submit'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_HCW_attendee_date'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registration/KP_Forms/kp_HCW_attendee_date'), '02-Apr-2020')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w204-display'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Sign off date_w252-display'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w44-display'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w48-display'))

