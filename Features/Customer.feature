Feature: Customer
Scenario: Add New Customer

 Given User launch chrome browser
 When User opens URL "https://admin-demo.nopcommerce.com/"
 And User enters email as "admin@yourstore.com" and Password as "admin"
 And Click on login
 Then User can view the dashboard
 When User click on Customer Menu
 And User click on customer menu item
 And Click on add new button
 Then User can view add new customer page
 When User enter customer info
 And User can click on save button
 #Then User can view confirmatin message "The new Customer has been added sucessfully."
 Then User can view confirmatin message "Email is already registered"
 And close browser
 
 Scenario: Search 