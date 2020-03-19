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

WebUI.navigateToUrl('http://192.168.1.211:7000/openmrs/login.htm')

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

WebUI.setText(findTestObject('Buttons/clinicNo'), '14000028')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/idNo'), '10000025')

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

WebUI.setText(findTestObject('Registration/Forms/LMP_Date'), '5-02-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/triage_submit'))

WebUI.click(findTestObject('Registration/Forms/HTS_Initial_Button'))

WebUI.click(findTestObject('Registration/Forms/HTS_Date_field'))

WebUI.setText(findTestObject('Registration/Forms/HTS_Date'), '10-Mar-2020')

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_field'))

WebUI.click(findTestObject('Registration/Forms/population_type'))

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Forms/fisherfolks'))

WebUI.click(findTestObject('Registration/Forms/Disability_field'))

WebUI.click(findTestObject('Registration/Forms/disabilty_type'))

WebUI.click(findTestObject('Registration/Forms/hts_test_quiz'))

WebUI.setText(findTestObject('Registration/Forms/hts_test_duration'), '17')

WebUI.click(findTestObject('Registration/Forms/hts_self-test'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_strategy'), '164163', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_entry'), '162050', true)

WebUI.click(findTestObject('Registration/Forms/hts_consent'))

WebUI.click(findTestObject('Registration/Forms/hts_tested_as'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name'), '164960', true)

WebUI.setText(findTestObject('Registration/Forms/hts_kit_lotNum'), '6789')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date'), '29-02-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_result_1'), '703', true)

WebUI.setText(findTestObject('Registration/Forms/hts_lotNum_2'), '4567')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date_2'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date_2'), '29-02-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name_2'), '164961', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_results_2'), '703', true)

WebUI.click(findTestObject('Registration/Forms/hts_tb_screening'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts-result_given'), '1065', true)

WebUI.setText(findTestObject('Registration/Forms/hts_remarks'), 'good')

WebUI.click(findTestObject('Registration/Forms/hts_submit_form'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_Retest_button'))

WebUI.click(findTestObject('Registration/Forms/HTS_Date_field'))

WebUI.setText(findTestObject('Registration/Forms/HTS_Date'), '10-Mar-2020')

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_field'))

WebUI.click(findTestObject('Registration/Forms/population_type'))

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Forms/fisherfolks'))

WebUI.click(findTestObject('Registration/Forms/Disability_field'))

WebUI.click(findTestObject('Registration/Forms/disabilty_type'))

WebUI.click(findTestObject('Registration/Forms/hts_test_quiz'))

WebUI.setText(findTestObject('Registration/Forms/hts_test_duration'), '17')

WebUI.click(findTestObject('Registration/Forms/hts_self-test'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_strategy'), '164163', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_entry'), '162050', true)

WebUI.click(findTestObject('Registration/Forms/hts_consent'))

WebUI.click(findTestObject('Registration/Forms/hts_tested_as'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name'), '164960', true)

WebUI.setText(findTestObject('Registration/Forms/hts_kit_lotNum'), '6789')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date'), '29-12-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_result_1'), '703', true)

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_kit_name_2'), '164961', true)

WebUI.setText(findTestObject('Registration/Forms/hts_lotNum_2'), '4567')

WebUI.click(findTestObject('Registration/Forms/hts_kit_expiry_date_2'))

WebUI.setText(findTestObject('Registration/Forms/hts_kit_expiry_date_2'), '29-12-2020')

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_results_2'), '703', true)

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Forms/hts_result_given_2'))

WebUI.click(findTestObject('Registration/Forms/resultgivenYes'))

WebUI.click(findTestObject('Registration/Forms/hts_tb_Screening_2'))

WebUI.setText(findTestObject('Registration/Forms/hts_remarks_2'), 'good')

WebUI.click(findTestObject('Registration/Forms/hts_submit_form'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/hts_linkage_button'))

WebUI.click(findTestObject('Page_KenyaEMR/input_This facility_default-facility'))

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_CCC_number'), '1968692755')

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_hcw_name'), 'Mary Kwamboka')

WebUI.click(findTestObject('Registration/Forms/hts_linkage_hcw_cadre'))

WebUI.selectOptionByValue(findTestObject('Registration/Forms/hts_linkage_hcw_cadre_select'), '1577', true)

WebUI.click(findTestObject('Registration/Forms/hts_enrollment_date_field'))

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_date_enrolled_field'), '10-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/free_field_click'))

WebUI.click(findTestObject('Registration/Forms/hts_linkage_art_field_date'))

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_remark'), 'Enrolled')

WebUI.setText(findTestObject('Registration/Forms/hts_linkage_art_date'), '10-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/hts_linkage _submit-button'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Enroll'))

WebUI.setText(findTestObject('Registration/Forms/hiv_enrollment_date'), '10-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/hiv_free_click'))

WebUI.click(findTestObject('Registration/Forms/hiv_patient-type'))

WebUI.click(findTestObject('Registration/Forms/hiv-entry-point'))

WebUI.setText(findTestObject('Registration/Forms/hiv_enrollmrnt_number'), '1985885044')

WebUI.click(findTestObject('Registration/Forms/hiv_enrollment_who_stage_field'))

WebUI.click(findTestObject('Registration/Forms/hiv_enrollment_who_stage'))

WebUI.click(findTestObject('Registration/Forms/hiv_enrollment_in_school'))

WebUI.click(findTestObject('Registration/Forms/hiv_enrollement-orphan'))

WebUI.setText(findTestObject('Registration/Forms/hiv_enrollment_guardian_name'), 'Milka Wainaina')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Addrress_w91'), '44 Kisumu')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Postal Addrress_w93'), '0721567890')

WebUI.click(findTestObject('Page_KenyaEMR/input_Postal Addrress_submitButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/home_button'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Registration/Forms/clinician_button'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Registration/Forms/hiv_arvs_start_button'))

WebUI.click(findTestObject('Registration/Forms/hiv_new_ regimen_start_button'))

WebUI.click(findTestObject('Registration/Forms/hiv_regimen_start_date_field'))

WebUI.setText(findTestObject('Registration/Forms/hiv_arvs_start_date'), '10-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/hive_arvs_start_date_done_button'))

WebUI.click(findTestObject('Registration/Forms/hiv_regimen_field'))

WebUI.click(findTestObject('Registration/Forms/hiv_regimen'))

WebUI.click(findTestObject('Registration/Forms/hiv_start_regimen_save_button'))

WebUI.click(findTestObject('Registration/Forms/back_button'))

WebUI.click(findTestObject('Registration/Forms/gender_based_violence_button'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w10'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w12'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w14'))

WebUI.click(findTestObject('Page_KenyaEMR/td_YesNo'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w16'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_submitButton'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Alcohol and Drug Abuse Screening'))

WebUI.click(findTestObject('Registration/Forms/alcohol_drink'))

WebUI.click(findTestObject('Registration/Forms/smoking'))

WebUI.click(findTestObject('Registration/Forms/drug_usage'))

WebUI.click(findTestObject('Registration/Forms/Submit_alcohol_Screening'))

WebUI.click(findTestObject('Page_KenyaEMR/b_Enhanced Adherence Screening'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Session Number_w8'), '1')

WebUI.click(findTestObject('Registration/Forms/Adherance_date_first_session'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_date_first_session'), '10-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/Adherance_pill_count'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_pill_count'), '2')

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-3'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-4'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-1'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-2'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-3'))

WebUI.click(findTestObject('Page_KenyaEMR/input_YesNo_question-4'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w16'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Unsuppressed_w24'), 'virall load sample  taken')

WebUI.click(findTestObject('Registration/Forms/Adherance_cognative_barriers'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_cognative_barriers'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_01'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_01'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_02'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_02'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_03'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_03'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_04'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_04'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_05'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Behavioural Barriers_05'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_01'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_01'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_02'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_EmotionalBarriers_02'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_01'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_02'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_02'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_03'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_03'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_04'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_05'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_06'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_07'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Socio-Economic Barriers_08'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_01'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_02'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_03'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_03'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_04'))

WebUI.click(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_05'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Referrals_and_Networks_05'), 'good')

WebUI.click(findTestObject('Registration/Forms/Adherance_Followup_Date'))

WebUI.setText(findTestObject('Registration/Forms/Adherance_Followup_Date'), '28-Mar-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/Adherance_Form_Submit'))

WebUI.click(findTestObject('Page_KenyaEMR/b_HIV Green Card'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_w10'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_People who inject drugs_w38'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_People who inject drugs_w38'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_General Population_w34'))

WebUI.click(findTestObject('Page_KenyaEMR/input_People who inject drugs_w38'))

WebUI.click(findTestObject('Registration/Forms/GreenCard_Child_WHO'))

WebUI.click(findTestObject('Registration/Forms/green-card-next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Patient having complaint(s) today_w44'))

WebUI.click(findTestObject('Registration/Forms/green-card-complains'))

WebUI.click(findTestObject('Registration/Forms/pain-duration'))

WebUI.setText(findTestObject('Registration/Forms/pain-duration'), '1')

WebUI.click(findTestObject('Registration/Forms/complain-date'))

WebUI.setText(findTestObject('Registration/Forms/complain-date'), '03-Mar-2020')

WebUI.click(findTestObject('Registration/Forms/complaints_notes'))

WebUI.setText(findTestObject('Registration/Forms/complaints_notes'), 'given  drugs')

WebUI.click(findTestObject('Registration/Forms/No-anti-tb'))

WebUI.click(findTestObject('Registration/Forms/NoIPT'))

WebUI.click(findTestObject('Registration/Forms/everIPT'))

WebUI.click(findTestObject('Registration/Forms/cough-at-duration'))

WebUI.click(findTestObject('Registration/Forms/screening-fever'))

WebUI.click(findTestObject('Registration/Forms/screening-lethergy'))

WebUI.click(findTestObject('Registration/Forms/poorweightgain'))

WebUI.click(findTestObject('Registration/Forms/contactwithTB'))

WebUI.click(findTestObject('Registration/Forms/TBSigns'))

WebUI.click(findTestObject('Registration/Forms/yellow-urine'))

WebUI.click(findTestObject('Registration/Forms/numbness'))

WebUI.click(findTestObject('Registration/Forms/yellowness-eyes'))

WebUI.click(findTestObject('Registration/Forms/tenderness'))

WebUI.click(findTestObject('Registration/Forms/allergies'))

WebUI.click(findTestObject('Registration/Forms/carmobidities'))

WebUI.click(findTestObject('Registration/Forms/drugReaction'))

WebUI.click(findTestObject('Registration/Forms/BCG'))

WebUI.click(findTestObject('Registration/Forms/Menses'))

WebUI.click(findTestObject('Registration/Forms/yellowCard-next'))

WebUI.click(findTestObject('Registration/Forms/general-examination'))

WebUI.click(findTestObject('Registration/Forms/examination-normal'))

WebUI.click(findTestObject('Registration/Forms/diagnosis'))

WebUI.setText(findTestObject('Registration/Forms/diagnosis'), 'Normal Tissue')

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Forms/normal-tissue'))

WebUI.click(findTestObject('Registration/Forms/treatment-plan'))

WebUI.setText(findTestObject('Registration/Forms/treatment-plan'), 'Normal Treatment')

WebUI.click(findTestObject('Registration/Forms/examination-next'))

WebUI.click(findTestObject('Registration/Forms/prophylaxis'))

WebUI.click(findTestObject('Registration/Forms/condoms'))

WebUI.click(findTestObject('Registration/Forms/substance-abuse'))

WebUI.click(findTestObject('Registration/Forms/hiv-disclosure'))

WebUI.click(findTestObject('Registration/Forms/partner-testing'))

WebUI.click(findTestObject('Registration/Forms/CaCx'))

WebUI.click(findTestObject('Registration/Forms/STI-screening'))

WebUI.click(findTestObject('Registration/Forms/patient-stable'))

WebUI.click(findTestObject('Registration/Forms/return-day'))

WebUI.setText(findTestObject('Registration/Forms/return-day'), '29-Mar-2020')

WebUI.click(findTestObject('Registration/Forms/differentiated'))

WebUI.click(findTestObject('Registration/Forms/standard-care'))

WebUI.click(findTestObject('Registration/Forms/reasontovisit'))

WebUI.click(findTestObject('Registration/Forms/followup-reason'))

WebUI.click(findTestObject('Registration/Forms/submit-greencard'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_Drug Orders'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Standard Regimen Order'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Refill'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Date_orderDate_date'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Units_ng-valid ng-dirty'), '30')

WebUI.selectOptionByValue(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/select_BagBoxCartridgeDose packEachInhalerK_52462a'), 
    '1513AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', true)

WebUI.click(findTestObject('Registration/Forms/drug_quantity_01'))

WebUI.setText(findTestObject('Registration/Forms/drug_quantity_01'), '30')

WebUI.click(findTestObject('Registration/Forms/drug_unit_01'))

WebUI.click(findTestObject('Registration/Forms/drug_quantity_02'))

WebUI.setText(findTestObject('Registration/Forms/drug_quantity_02'), '30')

WebUI.click(findTestObject('Registration/Forms/drug_unity_02'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Order Regimen'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Dispense'))

WebUI.click(findTestObject('Registration/Forms/drug_backto_client_button'))

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

WebUI.click(findTestObject('Registration/Forms/lab_save_button_02'))

WebUI.click(findTestObject('Registration/Forms/lab_order_reason_save'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/div_Enter Lab Result(s)'))

WebUI.setText(findTestObject('Lab_Drug_Orders/Page_KenyaEMR/input_(04-03-2020)_vload'), '3557')

WebUI.click(findTestObject('Registration/Forms/lab_enter-result_date_click'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/input_Date_dateOrderVl_date'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Registration/Forms/lab_results_save'))

WebUI.click(findTestObject('Registration/Forms/lab_results_save_02'))

WebUI.click(findTestObject('Object Repository/Lab_Drug_Orders/Page_KenyaEMR/button_Back to client home'))

WebUI.click(findTestObject('Registration/Forms/check_out_button'))

WebUI.click(findTestObject('Registration/Forms/check_out_button_submit'))

