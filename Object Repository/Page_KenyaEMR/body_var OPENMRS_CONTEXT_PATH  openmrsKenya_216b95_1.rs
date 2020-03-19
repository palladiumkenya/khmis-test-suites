<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_var OPENMRS_CONTEXT_PATH  openmrsKenya_216b95_1</name>
   <tag></tag>
   <elementGuidId>0d8a8b4c-939b-4eb4-853c-1047b568bfa1</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ng-app</name>
      <type>Main</type>
      <value>kenyaemr</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>ng-scope</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
		
			var OPENMRS_CONTEXT_PATH = 'openmrs';
		

		

	
	


		
			
	
		
			
		
	
	
		KenyaEMR
		17.1.0, powered by OpenMRS
		
		
			Tesco Pharmacy Limited
			(19184)

		
	

	
		
	
	
		Government of KenyaMinistry of Health
	

	



	
		  HomeRegistration
	
	
		Logged in as Williams Williams WilliamsMy ProfileLog Out  Help
	
	


	function ke_logout() {
		kenyaui.openConfirmDialog({ heading: 'Logout', message: 'Logout and end session?', okCallback: function() {
			ui.navigate('/openmrs/logout');
		}});
	}
	function ke_showHelp() {
		window.open('/help');
	}


	function ke_closeChart() {
		kenyaui.openConfirmDialog({ heading: 'Patient chart', message: 'Close this patient chart?', okCallback: function() {
			ui.navigate('/openmrs/kenyaemr/registration/registrationHome.page');
		}});
	}



	
		
			
		
		Lucy, Maina Onyancha
		♀ Female,
		~43 year(s) (approx 15-Jun-1976)
	
	
	
		
			OpenMRS ID
			M9RXJ
		
	

	
		 Close
	

	

	
		
		
		
	

	
		Current visit
		Outpatient since 04:33
		
	

		

		
			












	

	
	Add Relationship
	
	
	


	
	

	

		

		
		

	
	
		
			
    
        Person
    
    





   Search for a person   







    

		
	
	


		
		

	
	
		
			
    
        Relationship to patient
    
    






    


    
        
    

    
    Doctor
    
    Patient
    
    Sibling
    
    Parent
    
    Child
    
    Aunt/Uncle
    
    Niece/Nephew
    
    Guardian
    
    Dependant
    
    Spouse
    
    Partner
    
    Co-wife
    
    Injectable drug user
    
    Injectable-drug-user
    
    Injectable-druguser
    
    Care-giver
    
    Peer-educator
    
    Peer
    












    

		
	
	


		
		

	
	
		
			
    
        Start date
    
    






	jq(function() {
		jq('#fr5410_date').datepicker({
			dateFormat: 'dd-M-yy',
			changeMonth: true,
			changeYear: true,
			showButtonPanel: true,
			yearRange: '-120:+5',
			autoSize: true
			
			
		});

		jq('#fr5410_date, #fr5410_hour, #fr5410_minute').change(function() {
			kenyaui.updateDateTimeFromDisplay('fr5410', false);
		});
	});











    

		
	
		
			
    
        End date
    
    






	jq(function() {
		jq('#fr4032_date').datepicker({
			dateFormat: 'dd-M-yy',
			changeMonth: true,
			changeYear: true,
			showButtonPanel: true,
			yearRange: '-120:+5',
			autoSize: true
			
			
		});

		jq('#fr4032_date, #fr4032_hour, #fr4032_minute').change(function() {
			kenyaui.updateDateTimeFromDisplay('fr4032', false);
		});
	});











    

		
	
	


		

	
	
		 Save
		 Cancel
	
	



jq(function() {
	jq('#edit-relationship-form .cancel-button').click(function() {
		ui.navigate('/openmrs/kenyaemr/registration/registrationViewPatient.page?patientId=2493&amp;');
	});

	kenyaui.setupAjaxPost('edit-relationship-form', {
		onSuccess: function(data) {
			ui.navigate('/openmrs/kenyaemr/registration/registrationViewPatient.page?patientId=2493&amp;');
		}
	});
});

	





	
		
			
				
					Your session has expired so please authenticate

					Invalid username or password. Please try again.
				
			
			
				Username:
				
			
			
				Password:
				
			
		
	
	
		 Login
	

		
	
 id(&quot;s2id_fr892&quot;)/a[@class=&quot;select2-choice select2-default&quot;]/span[@class=&quot;select2-chosen&quot;]                </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;ng-scope&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
