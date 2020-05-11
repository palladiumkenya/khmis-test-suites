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

WebUI.navigateToUrl('http://192.168.1.211:7000/openmrs/login.htm')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Username_uname'), 'Admin')

WebUI.setEncryptedText(findTestObject('Page_KenyaEMR/input_Password_pw'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.sendKeys(findTestObject('Page_KenyaEMR/input_Password_pw'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_KenyaEMR/button_Login'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Home'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Registration'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Find or create patient'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_ID or name (3 chars min)_query'), 'Esther')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/table_Esther Esther Esther20 year(s) (DOB a_b8dd79'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Check in for visit'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Triage'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Reason for visit_w8'), 'Followup')

WebUI.setText(findTestObject('Page_KenyaEMR/input_C_w10'), '33')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Pulse Rate_w12'), '13')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w14'), '180')

WebUI.setText(findTestObject('Page_KenyaEMR/input_mmHg_w16'), '70')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Respiratory Rate_w18'), '21')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Oxygen Saturation_w20'), '14')

WebUI.setText(findTestObject('Page_KenyaEMR/input_kg_w22'), '4')

WebUI.doubleClick(findTestObject('Page_KenyaEMR/input_kg_w22'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_kg_w22'), '47')

WebUI.setText(findTestObject('Page_KenyaEMR/input_cm_w24'), '152')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_MUAC_w26'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_LMP_w28-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_10'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_(10-Jul-2017)_submitButton'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_Home_1'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/button_Clinician'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Gender Based Violence Screening'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w10'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w12'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w14'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w16'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_(10-Jul-2017)_submitButton'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Alcohol and Drug Abuse Screening'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_CAGE-AID SCREENING FOR ALCOHOL AND DR_a16da0'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Monthly or less_w10'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Unknown if ever smoked_w12'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_(10-Jul-2017)_submitButton'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Enhanced Adherence Screening'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Session Number_w8'), '1')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date of first session_w10-display'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_10'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Pulse Rate_w12'), '2')

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-3'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-4'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_YesNo_question-5'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_YesNo_question-6'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_YesNo_question-7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Select                            Ne_b764a9'), 
    '1804', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Understanding Viral Load (HighSuppres_6e84c6'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Suppressed_w18'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Unsuppressed_w20'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Unsuppressed_w22'), 'ok')

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Unsuppressed_w24'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Cognitive Barriers_w26'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Behavioural  Barriers_w28'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Behavioural  Barriers_w30'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Behavioural  Barriers_w32'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Behavioural  Barriers_w34'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Behavioural  Barriers_w36'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Emotional Barriers_w38'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Emotional Barriers_w40'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Socio-Economic Barriers_w42'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_No_w44'), 'ok')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_No_w46'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w48'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w50'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w52'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w54'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w56'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Referrals and Networks_w64'))

WebUI.click(findTestObject('Page_KenyaEMR/td_YesNo'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w66'))

WebUI.doubleClick(findTestObject('Object Repository/Page_KenyaEMR/input_Follow up Date_w74-display'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Follow up Date_w74-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/a_7'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_(10-Jul-2017)_submitButton'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Sa_ke-modal-overlay'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_HIV Green Card'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_CAGE-AID SCREENING FOR ALCOHOL AND DR_a16da0'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Monthly or less_w10'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w34'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_WHO Stage1WHO Stage2WHO Stage3WHO Stage4'), '1205', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Visit details                          _cb1839'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w44'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w78'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w80'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_concat(Previous visit  s notes)_w76'), 'ok')

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w82'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w84'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w86'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w90'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w120'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w122'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w124'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w126'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Start IPT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Select indication                   _60c3ac'), 
    '138571', true)

WebUI.click(findTestObject('Page_KenyaEMR/span_Confirm IPT Initiation'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w128'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any known allergie(s)_w128'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_BeefCaffeineChocolateDairy FoodEggsF_899b28'), 
    '162539', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_UnknownAnaemiaAnaphylaxisAngioedemaA_523a49'), 
    '117399', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown'), '160755', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Please specify the allergy_w136-display'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has any chronic illnesse(s)_w170'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Alzheimers Disease and other Dementi_b61b23'), 
    '119481', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Onset Date_w174-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/a_5'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient has adverse drug reaction(s)_w192'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_AbicavirACE inhibitorsAllopurinolAmi_02c072'), 
    '71647', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_UnknownAnaemiaAnaphylaxisAngioedemaA_523a49_1'), 
    '143264', true)

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_MildModerateSevereFatalUnknown_1'), '1498', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Action taken_w200-display'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_CONTINUE REGIMENSWITCHED REGIMENCHAN_cc2e0d'), 
    '981', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_HBV_w246'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Has patient ever had menses_w252'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w252'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_On Family PlanningNot using Family P_cec8bd'), 
    '965', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Injectible_w282'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Examination Findings_w304'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Finding(s) on systems review_w328'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Normal_w328'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_AbscessSwellingGrowthHair LossItchin_6f9ede'), 
    '150555', true)

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Skin_w332'), 'ok')

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/button_Adherence Assessment'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-3'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-4'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_YesNo_question-5'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_YesNo_question-6'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_YesNo_question-7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Select                              _89e439'), 
    '159416', true)

WebUI.click(findTestObject('Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Prophylaxis used_w382'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Adherence_w384'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Fair (F)_w384'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Dispensed_w386'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w394'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w396'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w398'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Positive_w402'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Positive_w404'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w408'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Reason_w410-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/a_7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Follow upLab testsCounselingPharmacy_5d8dbb'), 
    '160523', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Standard Care'), '164942', true)

WebUI.click(findTestObject('Page_KenyaEMR/a_Submit'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Drug Orders'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Standard Regimen Order'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Refill'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_orderDate_date'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_10'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.doubleClick(findTestObject('Page_KenyaEMR/button_Dispense'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Back to client home'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Lab Orders'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Create New Order(s)'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Blood'))

WebUI.click(findTestObject('Page_KenyaEMR/button_HIV MONITORING'))

WebUI.click(findTestObject('Page_KenyaEMR/input_HIV MONITORING_feature'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Confirm'))

WebUI.click(findTestObject('Page_KenyaEMR/button_ROUTINE_fa fa-calendar fa-1x'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_orderDate_date'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_10'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_1'))

WebUI.click(findTestObject('Page_KenyaEMR/button_ROUTINE_fa fa-warning fa-1x'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Clinical treatment failurePregnancyB_cf109a'), 
    '162081AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/button_Save_1_2'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Enter Lab Result(s)'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_(10-03-2020)_feature'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/span_LDL_float-left btn-xl fa fa-calendar f_c0bb34'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_dateOrderVl_date'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_10'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/button_Save_1_2_3'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Back to client home'))

WebUI.click(findTestObject('Page_KenyaEMR/img'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Back'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Check out of visit'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Submit_1'))

