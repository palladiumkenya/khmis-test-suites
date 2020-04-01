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

WebUI.navigateToUrl('https://data.kenyahmis.org:9100/openmrs/login.htm')

WebUI.setText(findTestObject('Page_KenyaEMR/input_Username_uname'), 'Admin')

WebUI.setEncryptedText(findTestObject('Page_KenyaEMR/input_Password_pw'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Page_KenyaEMR/button_Login'))

WebUI.click(findTestObject('Page_KenyaEMR/a_Home'))

WebUI.click(findTestObject('Page_KenyaEMR/img'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Find or create patient'))

WebUI.click(findTestObject('Page_KenyaEMR/div_Create new patientPatient cant be found'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Register new Patient'))

WebUI.click(findTestObject('Buttons/surName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Buttons/surName'), 'Joselyne')

WebUI.click(findTestObject('Buttons/firstName'))

WebUI.setText(findTestObject('Buttons/firstName'), 'Nyambane')

WebUI.click(findTestObject('Buttons/gender/femal'))

WebUI.click(findTestObject('Buttons/idNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('date/birthDate'))

WebUI.setText(findTestObject('date/birthDate'), '30-May-1973')

WebUI.click(findTestObject('date/birthDateDone'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('date/estimateAge'))

WebUI.click(findTestObject('date/fromAgeButton'))

WebUI.click(findTestObject('date/enterAge'))

WebUI.setText(findTestObject('date/enterAge'), '47')

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

WebUI.setText(findTestObject('Registration/Forms/Phone_Number'), '0736444672')

WebUI.click(findTestObject('Registration/Forms/Alt_Phone_Num'))

WebUI.setText(findTestObject('Registration/Forms/Alt_Phone_Num'), '0734621568')

WebUI.click(findTestObject('Registration/Forms/Postal_Address'))

WebUI.setText(findTestObject('Registration/Forms/Postal_Address'), 'Migori')

WebUI.click(findTestObject('Registration/Forms/Email'))

WebUI.setText(findTestObject('Registration/Forms/Email'), 'lucy@gmail.com')

WebUI.click(findTestObject('Registration/Forms/County'))

WebUI.click(findTestObject('Registration/Forms/County_Name'))

WebUI.click(findTestObject('Registration/Forms/Sub_county'))

WebUI.setText(findTestObject('Registration/Forms/Sub_county'), 'Nyamira')

WebUI.click(findTestObject('Registration/Forms/ward'))

WebUI.setText(findTestObject('Registration/Forms/ward'), 'Kisii')

WebUI.click(findTestObject('Registration/Forms/Location'))

WebUI.setText(findTestObject('Registration/Forms/Location'), 'Kisii')

WebUI.click(findTestObject('Registration/Forms/Sub_location'))

WebUI.setText(findTestObject('Registration/Forms/Sub_location'), 'Kisii')

WebUI.click(findTestObject('Registration/Forms/Village'))

WebUI.setText(findTestObject('Registration/Forms/Village'), 'Kisii')

WebUI.click(findTestObject('Registration/Forms/Landmark'))

WebUI.setText(findTestObject('Registration/Forms/Landmark'), 'kisii school')

WebUI.click(findTestObject('Registration/Forms/Nearest_HC'))

WebUI.setText(findTestObject('Registration/Forms/Nearest_HC'), 'kisii hospital')

WebUI.click(findTestObject('Registration/Forms/Next_Kin'))

WebUI.setText(findTestObject('Registration/Forms/Next_Kin'), 'Maina Mwende')

WebUI.click(findTestObject('Registration/Forms/Rlnship_kin'))

WebUI.click(findTestObject('Registration/Forms/Rlnship'))

WebUI.click(findTestObject('Registration/Forms/NextKin_Contact'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Contact'), '0741234567')

WebUI.click(findTestObject('Registration/Forms/NextKin_Address'))

WebUI.setText(findTestObject('Registration/Forms/NextKin_Address'), 'kisii')

WebUI.click(findTestObject('Registration/Forms/SubmitRegistration'))

WebUI.click(findTestObject('Registration/Forms/home_button'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_provider_button'))

WebUI.click(findTestObject('Registration/KP_Forms/search_patient_all'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_ID or name (3 chars min)_query'), 'joselyne')

WebUI.click(findTestObject('Registration/KP_Forms/patient-search-click'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/KP_Forms/kp_enroll_button'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_enrollment_type'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Unique Identifier code_w9'), 'qwertyuiop1234567890asdfghjkl276')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Alias_w13'), 'Lucky')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Name _w15'), 'Migori')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Telephone number _w17'), '0745178093')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Name _w15'), 'Mary Toto')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Have you been contacted by a peer edu_f68881'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Hot spot mostly frequented_w23'), 'Migori')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Street                              _12d63d'), 
    '165017', true)

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Which year did you start sex work_w29'), '2000')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Which Year Did You Start Using Drugs _134fd6'), '2000')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many sex acts do you h_55a3ba'), '2')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many anal sex acts do _6db2a0'), '2')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/KP_Forms/contact-form_button'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Key Population Type_w8'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Do you have a regular(Non-Paying) sex_09d265'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Which year did you start sex work_w12'), '2000')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Ever experienced sexual violence_w18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Ever experienced physical violence_w20'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Have you ever been tested for HIV_w22'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_enroll_type_of_test'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes I tested positive_w26'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Are you willing to be tested for HIV_w28'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_In case you are due for clinical serv_585be4'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Treatment supporter_w48'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Buddy Name_w56'), 'Mary Toto')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Buddy Mobile Number_w58'), '0756721456')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Registration/KP_Forms/kp_check_in'))

WebUI.click(findTestObject('Registration/Forms/SubmitCheckInButton'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_triage_button'))

WebUI.click(findTestObject('Registration/Forms/TriageDate'))

WebUI.click(findTestObject('Registration/Forms/Reason_Visit'))

WebUI.setText(findTestObject('Registration/Forms/Reason_Visit'), 'New KP Client')

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

WebUI.setText(findTestObject('Registration/Forms/LMP_Date'), '5-03-2020', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Forms/triage_submit'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_form'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Key Population Type_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Do you have a regular(Non-Paying) sex_09d265'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_01'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_02'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_03'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_04'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_STI_09'), '234')

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_05'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_STI_10'), 'Migori hc')

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_06'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_07'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_STI_11'), '231')

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_08'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_STI_12'), '341')

WebUI.setText(findTestObject('Registration/KP_Forms/kp_STI_13'), 'doing ok')

WebUI.setText(findTestObject('Registration/KP_Forms/kp_STI_14'), 'Milcah Ochieng')

WebUI.click(findTestObject('Registration/KP_Forms/kp_STI_15'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_STI_15'), '20-May-2020')

WebUI.click(findTestObject('Page_KenyaEMR/span_Next'))

WebUI.click(findTestObject('Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Registration/KP_Forms/PHQ9_button_form'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Little interest or pleasure in doing _aeac6c'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Feeling down depressed or hopeless_qu_2191f0'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Trouble falling or staying asleep or _7ed4ee'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Feeling tired or having little energy_041ec1'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Poor appetite or overeating_question-5'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Poor appetite or overeating_question-7'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Poor appetite or overeating_question-8'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Thoughts that you would be better off_c465de'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Registration/KP_Forms/HCW_overdose_click'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Peer EducatorORW Overdose Encounter R_680ca3'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Peer EducatorORW Overdose Encounter R_680ca3'), 'Migori')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w10-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_4'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w12'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input__w14'), 'Migori')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Bar with lodgingBar without lodgingB_60284d'), 
    '165015', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Ever experienced sexual violence_w18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Alcohol_w24'))

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_RecoveredDiedReferred'), '1272', true)

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Others (Specify)_w38'), 'Mercy Mione')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w40-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_alcohol_abuse_button'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Never_w8'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Monthly or less_w10'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_alcohol_01'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Never_w14'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_alcohol_02'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Never_w18'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_alcohol_03'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_alcohol_4'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_w24'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_alcohol_05'))

WebUI.setText(findTestObject('Page_KenyaEMR/textarea_Remarks_w30'), 'Doing ok')

WebUI.click(findTestObject('Page_KenyaEMR/input_Remarks_submitButton'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_clinic_visit_button'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Key Population Type_w8'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Asymptomatic_w10'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w12'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_IF YES SPECIFY_w14'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Never_w16'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Never_w18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Ever experienced physical violence_w20'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_No_w22'), 'Migori HC')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_The last time you received HIV testin_ae93cb'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_yes during this year_w26'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w34'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w36'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Positive_w38'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w40'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_In case you are due for clinical serv_585be4'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w46'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w54'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_w54'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Employer_w56'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Negative_w56'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Positive_w58'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w60'))

WebUI.click(findTestObject('Page_KenyaEMR/label_No'))

WebUI.click(findTestObject('Page_KenyaEMR/input_No_w66'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Negative_w68'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w70'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w72'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w76'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Negative_w78'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w80'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w82'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w86'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Negative_w88'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Positive_w90'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w92'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_No_w94'), 'migori hc')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w96'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w98'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Initiated_w100'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w102'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w106'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w108'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/div_Harassment                             _e09457'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Harassment_w112'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Discrimination_w122'))

WebUI.click(findTestObject('Page_KenyaEMR/input_Yes_w124'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w128'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w130'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Supported_w132'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w134'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w138'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w140'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Not Eligible_w142'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_CondomsDiaphragmEmergency contracept_b374d9'), 
    '160570', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w146'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w150'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Depression unlikely_w152'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Severe Depression_w154'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w156'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Positive_w160'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Universal HTS_w162'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Never tested_w164'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w166'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Not applicable_w168'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Repeat_w170'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Not applicable_w172'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_No_w180'), '45')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_No_w182'), '134')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w184'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w186-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/a_10'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w188'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Repeat_w190'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w202'), 'John Maina')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w204-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Condom educationdemonstration_w220'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Post Abortal Care provided_w222'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Referral_w224'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_MaleFemale_w226'), '42')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_MaleFemale_w228'), '66')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_No of lubes given_w230'), '45')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Number of needles and syringes given_w232'), '67')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Yes_w234'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Link to psychosocial support _w244'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_No_w246'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_No_w248-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/a_20'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Sign off date_w250'), 'John Maina')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Sign off date_w252-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Registration/KP_Forms/Peer_overdose_click'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Peer EducatorORW Overdose Encounter R_680ca3'), 'Migori')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w10-display'))

WebUI.click(findTestObject('Page_KenyaEMR/span_Prev'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input__w12'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input__w14'), 'Migori')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Bar with lodgingBar without lodgingB_60284d'), 
    '165015', true)

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Ever experienced sexual violence_w18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Alcohol_w24'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Others (Specify)_w36'), 'Doing Ok')

WebUI.click(findTestObject('Page_KenyaEMR/input_Died_w38'))

WebUI.setText(findTestObject('Page_KenyaEMR/input__w40'), 'Migori HC')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input__w42'), 'Emma Milka')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w44-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w46'), 'Joyce Odhiambo')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Date_w48-display'))

WebUI.click(findTestObject('Page_KenyaEMR/a_18'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_referal_button'))

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_Key Population Type_w8'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_referal_date'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_referal_date'), '30-Mar-2020')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Referral date can not be before encou_092545'), 'Migori HC')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Care and treatmentSTI treatmentOther'), 
    '5622', true)

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Other specify_w16'), 'Sick')

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/input_Other specify_w18'), 'John')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_KenyaEMR/select_Linked to careOB number provided'), '162978', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_KenyaEMR/textarea_Other specify_w22'), 'Good')

WebUI.click(findTestObject('Object Repository/Page_KenyaEMR/input_On average how many times do you inje_da1a6c'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_dignosis_button'))

WebUI.selectOptionByValue(findTestObject('Registration/KP_Forms/kp_diagnosis_01'), '125201', true)

WebUI.setText(findTestObject('Registration/KP_Forms/kp_diagnosis_02'), 'Doing bad')

WebUI.setText(findTestObject('Registration/KP_Forms/kp_diagnosis_03'), 'num')

WebUI.click(findTestObject('Registration/KP_Forms/kp_diagnosis_04'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_diagnosis_05'), 'given drugs')

WebUI.setText(findTestObject('Registration/KP_Forms/kp_diagnosis_06'), 'will be treated')

WebUI.click(findTestObject('Registration/KP_Forms/kp_diagnosis-submit_button'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_button'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_date'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_followup_date'), '30-Mar-2020')

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_01'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_02'))

WebUI.setText(findTestObject('Registration/KP_Forms/kp_followup_02'), '30-Mar-2020')

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_03'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_04'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_05'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_06'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_07'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_followup_submit_button'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_add_rlnship_button'))

WebUI.click(findTestObject('Page_KenyaEMR/body_var OPENMRS_CONTEXT_PATH  openmrsKenya_7ad206'))

WebUI.setText(findTestObject('Page_KenyaEMR/input_Login_select2-input select2-focused'), 'mar')

WebUI.selectOptionByValue(findTestObject('Page_KenyaEMR/select_Doctor        Patient        Sibling_13a14b'), '12:A', true)

WebUI.click(findTestObject('Page_KenyaEMR/input_Start date_fr5303_date'))

WebUI.click(findTestObject('Page_KenyaEMR/a_26'))

WebUI.click(findTestObject('Page_KenyaEMR/button_Save'))

WebUI.click(findTestObject('Registration/KP_Forms/kp_checkout-button'))

