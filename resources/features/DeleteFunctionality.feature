@Smoke @Regression
Feature: Delete Button Functionality
			
			User should be able to delete stocks from the table view and data base
			by clicking on the delete button

	
Scenario:  Verify that user can successfully delete stock table in UI

		Given User is on the Homepage after sign in
		When the user clicks on the delete button
		Then a pop-up modal should appear with the text: Are you sure you want to delete this record?
		When the user clicks on Ok button
		Then the modal should close and the system should delete that particular stock from the table view
	
		
Scenario: Verify that user can navigate from deleting a stock back to home page
		
		Given User is on the Homepage after sign in
		When the user clicks on the delete button
		Then a pop-up modal should appear with the text: Are you sure you want to delete this record?
		When the user clicks on Cancel button
		Then the modal should close without anything been deleted
		
		
		

