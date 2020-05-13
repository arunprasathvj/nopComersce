Feature: Addcustomer

Background:  common Steps
Given User open chrome browser
When User enter url "https://admin-demo.nopcommerce.com/login"
Then User enter username "admin@yourstore.com" and password "admin"
Then User Click login
Then Verify page title "Dashboard / nopCommerce administration"
Then User click customer
Then click customers
 
Scenario: User Login and Addnew customer

When User to be click addnew
When user enter email "prasath123@gmail.com"
And user enter password "Adm12in@123"
Then user enter firstname "Prasath1"
Then user enter Lastname "G"
And click date of brith 
Then User choose date "11/11/1994"
And User enter company name "MY WON QA"
Then Click save
And User check Response "The new customer has been added successfully."
Then User will close browser

Scenario: User Login and Addnew customer


When User enter customer email "prasath123@gmail.com"
Then User click search 
And chech email showing on the table is "prasath123@gmail.com"
Then User will close browser

Scenario: User Login and Addnew customer

When User enter UserFirstname "prasath1"
Then User will be click search button
And chech firstname showing on the table is "prasath1" and lastname "G"
Then User will close browser
