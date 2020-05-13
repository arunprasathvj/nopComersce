Feature: Addcustomer
Scenario: User Login and Addnew customer

Given User open chrome browser
When User enter url "https://admin-demo.nopcommerce.com/login"
Then User enter username "admin@yourstore.com" and password "admin"
Then User Click login
Then Verify page title "Dashboard / nopCommerce administration"
Then User click customer
Then click customers
 
And chech firstname showing on the table is "Victoria" and lastname "Terces"
Then User will close browser
