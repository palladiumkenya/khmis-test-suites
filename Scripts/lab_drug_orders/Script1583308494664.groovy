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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://data.kenyahmis.org:8400/openmrs/login.htm;jsessionid=EFF8EE6937456239E5308A930833D9F8?redirect=kenyaemr%2Fclinician%2FclinicianViewPatient.page%3FpatientId%3D2787%26')

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Username_uname'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Password_pw'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Login'))

WebUI.click(findTestObject('Lab_Drug_Orders/Clinician_orders'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Drug Orders'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Standard Regimen Order'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Refill'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Date_orderDate_date'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Order Regimen'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Dispense'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Other Drug Orders'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Date_singleDrugorderDate_date'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_4'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_New order for_sel-drug2009input'), 'ctx')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Sulfamethoxazole 800 MG  Trimethoprim 160_0befe6'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Instructions_ng-valid-number ng-valid_c89bbd'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Instructions_sel-concept4524input'), 
    'm')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Milligram'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Instructions_sel-freq4719input'), 'on')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Once daily'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Instructions_sel-concept9460input'), 
    'o')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Oral'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_For_ng-valid ng-valid-number ng-valid_f22861'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_For_sel-concept1781input'), 'm')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Months'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/textarea_total_ng-valid ng-dirty'), '')

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_For outpatient orders_ng-valid-number_ed3c96'), 
    '30')

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_For outpatient orders_sel-concept9963input'), 
    'm')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Milligram'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Add'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Sign and Save'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Dispense'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Sign and Save'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Back to Client home'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Lab Orders'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Create New Order(s)'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Blood'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_HIV MONITORING'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_HIV MONITORING_feature'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_ROUTINE_fa fa-calendar fa-1x'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Date_orderDate_date'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_ROUTINE_fa fa-warning fa-1x'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/select_Clinical treatment failurePregnancyB_cf109a'), 
    '162080AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Enter Lab Result(s)'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_(04-03-2020)_vload'), '3561')

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/span_LDL_float-left btn-xl fa fa-calendar f_c0bb34'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/span_LDL_float-left btn-xl fa fa-calendar f_c0bb34'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Date_dateOrderVl_date'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Save_1_2'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Back to client home'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Check out of visit'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Submit'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Other name(s)_personNamemiddleName'), 'Onyancha')

WebUI.click(findTestObject('Page_KenyaEMR/input_FemaleMale_gender'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date of Birth _patient-birthdate_date'))

WebUI.click(findTestObject('Page_KenyaEMR/button_from age'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Age in years_age'), '44')

WebUI.click(findTestObject('Page_KenyaEMR/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Married polygamous        Married mo_938552'), 
    '1058', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Farmer        Trader        Employee_ba7a0b'), 
    '159466', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_None        Primary school education_05c1b0'), 
    '1714', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_Telephone contact_telephoneContact'), '0736444672')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Alternate phone number_alternatePhoneContact'), '0723567891')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Address_personAddressaddress1'), 'Migori')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Email address_emailAddress'), 'lucy@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Kwale                               _b52610'), 
    'Nyamira', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_Ward_personAddressstateProvince'), 'Kisii')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Ward_personAddressaddress4'), 'Kisii')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Location_personAddressaddress6'), 'Kisii')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Sub-location_personAddressaddress5'), 'Kisii')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Village_personAddresscityVillage'), 'Kisii')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Landmark_personAddressaddress2'), 'School')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Nearest Health Center_nearestHealthFacility'), 'Kisii HC')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Relationship_nameOfNextOfKin'), 'Maina Mwende')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Partner                             _ba2457'), 
    'Friend', true)

WebUI.setText(findTestObject('Page_KenyaEMR/input_Phone Number_nextOfKinContact'), '0741234567')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Address_nextOfKinAddress'), 'Kisii')

WebUI.click(findTestObject('Page_KenyaEMR/button_Create Patient'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Depression Screening PHQ-9'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Others (Specify)_w36'), 'Doing Ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input__w40'), 'Migori HC')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input__w42'), 'Emma Milka')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w44-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w46'), 'Joyce Odhiambo')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w48-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Others (Specify)_w38'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Violence Reporting Form'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Peer EducatorORW Overdose Encounter R_680ca3'), 'Migori')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w10-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w12'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Verbal Abuse_w16'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes I tested positive_w26'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w28'))

WebUI.click(findTestObject('Page_KenyaEMR/td_YesNo'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w30'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Client_w32'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w44'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w46'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w48'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w50'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w34'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w36'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Died_w38'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w40'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w42'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w52'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w54'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Employer_w56'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Other_w58'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Other KP (specify)_w60'), 'Friend')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Other KP (specify)_w62-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/a_5'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Type of post violence support prov_afa2fa'), 'Given Drugs')

WebUI.doubleClick(findTestObject('Object Repository/Page_KenyaEMR/input_Duration of servicesProvided within 5_54002a'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Duration of services Provided within _02c6bf'), '6')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w106'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Duration of services Provided within _b5429c'), '6')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w110'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Duration of services Provided within _2d2b54'), '4')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Duration of services Provided within _141857'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Duration of services Provided within _c5da8e'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/td_Duration of services                    _885eb6'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Duration of services Provided within _c5da8e'), '7')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w118'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/td_DeadImprisonedHospitalizedAt homeSafe place'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Hospitalized_w120'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Follow up action plan_w122'), 'Police Case')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w124-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_10'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.rightClick(findTestObject('Registration/KP_Forms/patient-search-click'))

WebUI.click(findTestObject('Page_KenyaEMR/a_6'))

