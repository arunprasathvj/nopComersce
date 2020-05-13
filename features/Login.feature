Feature: Login

Scenario:  User Sucessfully login valid credentials
    Given User open chromebrowser
    When User open url "https://admin-demo.nopcommerce.com/login"
    Then  Then User enter username "admin@yourstore.com" and password "admin"
    And  Click login
    When User check to be "Dashboard / nopCommerce administration"
    Then User click logout
    And User close browser
    
    Scenario Outline: User Sucessfully login valid credentials
    
    Given User open chromebrowser
    When User open url "https://admin-demo.nopcommerce.com/login"
    Then  Then User enter username "<email>" and password "<password>"
    And  Click login
    When User check to be "Dashboard / nopCommerce administration"
    Then User click logout
    And User close browser
  
Examples:
| email |password |
|admin@yourstore.com|admin|
|admin112@yourstore.com|admin123|
    