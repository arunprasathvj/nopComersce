$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/addnewcustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Addcustomer",
  "description": "",
  "id": "addcustomer",
  "keyword": "Feature"
});
formatter.before({
  "duration": 209992600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "common Steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter username \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Click login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify page title \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click customer",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click customers",
  "keyword": "Then "
});
formatter.match({
  "location": "addcusteps.user_open_chrome_browser()"
});
formatter.result({
  "duration": 13040399200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "addcusteps.user_enter_url(String)"
});
formatter.result({
  "duration": 3297642900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 56
    }
  ],
  "location": "addcusteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 472165100,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_Click_login()"
});
formatter.result({
  "duration": 16790159800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 19
    }
  ],
  "location": "addcusteps.verify_page_title(String)"
});
formatter.result({
  "duration": 178133200,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_customer()"
});
formatter.result({
  "duration": 1029576900,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_customers()"
});
formatter.result({
  "duration": 14563463600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Login and Addnew customer",
  "description": "",
  "id": "addcustomer;user-login-and-addnew-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User to be click addnew",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enter email \"prasath123@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enter password \"Adm12in@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enter firstname \"Prasath1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter Lastname \"G\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click date of brith",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User choose date \"11/11/1994\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User enter company name \"MY WON QA\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click save",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User check Response \"The new customer has been added successfully.\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User will close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "addcusteps.user_to_be_click_addnew()"
});
formatter.result({
  "duration": 3966604400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prasath123@gmail.com",
      "offset": 18
    }
  ],
  "location": "addcusteps.user_enter_email(String)"
});
formatter.result({
  "duration": 574211200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adm12in@123",
      "offset": 21
    }
  ],
  "location": "addcusteps.user_enter_password(String)"
});
formatter.result({
  "duration": 909920100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prasath1",
      "offset": 22
    }
  ],
  "location": "addcusteps.user_enter_firstname(String)"
});
formatter.result({
  "duration": 839751600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "G",
      "offset": 21
    }
  ],
  "location": "addcusteps.user_enter_Lastname(String)"
});
formatter.result({
  "duration": 167604000,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_date_of_brith()"
});
formatter.result({
  "duration": 94800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11/11/1994",
      "offset": 18
    }
  ],
  "location": "addcusteps.user_choose_date(String)"
});
formatter.result({
  "duration": 455910300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MY WON QA",
      "offset": 25
    }
  ],
  "location": "addcusteps.user_enter_company_name(String)"
});
formatter.result({
  "duration": 340719400,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_save()"
});
formatter.result({
  "duration": 5393989600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 21
    }
  ],
  "location": "addcusteps.user_check_Response(String)"
});
formatter.result({
  "duration": 89874500,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_will_close_browser()"
});
formatter.result({
  "duration": 4966757600,
  "status": "passed"
});
formatter.before({
  "duration": 1916300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "common Steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter username \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Click login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify page title \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click customer",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click customers",
  "keyword": "Then "
});
formatter.match({
  "location": "addcusteps.user_open_chrome_browser()"
});
formatter.result({
  "duration": 11638216600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "addcusteps.user_enter_url(String)"
});
formatter.result({
  "duration": 3406757400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 56
    }
  ],
  "location": "addcusteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 2659701000,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_Click_login()"
});
formatter.result({
  "duration": 7968097900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 19
    }
  ],
  "location": "addcusteps.verify_page_title(String)"
});
formatter.result({
  "duration": 91671000,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_customer()"
});
formatter.result({
  "duration": 286632200,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_customers()"
});
formatter.result({
  "duration": 18130396700,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "User Login and Addnew customer",
  "description": "",
  "id": "addcustomer;user-login-and-addnew-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "User enter customer email \"prasath123@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User click search",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "chech email showing on the table is \"prasath123@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User will close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prasath123@gmail.com",
      "offset": 27
    }
  ],
  "location": "addcusteps.user_enter_customer_email(String)"
});
formatter.result({
  "duration": 516115400,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_click_search()"
});
formatter.result({
  "duration": 160393900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prasath123@gmail.com",
      "offset": 37
    }
  ],
  "location": "addcusteps.chech_email_showing_on_the_table_is(String)"
});
formatter.result({
  "duration": 799667300,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_will_close_browser()"
});
formatter.result({
  "duration": 4293716199,
  "status": "passed"
});
formatter.before({
  "duration": 1642699,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "common Steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter username \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Click login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify page title \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click customer",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click customers",
  "keyword": "Then "
});
formatter.match({
  "location": "addcusteps.user_open_chrome_browser()"
});
formatter.result({
  "duration": 20005417100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "addcusteps.user_enter_url(String)"
});
formatter.result({
  "duration": 14193470000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 56
    }
  ],
  "location": "addcusteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 17658597200,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_Click_login()"
});
formatter.result({
  "duration": 12719240600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 19
    }
  ],
  "location": "addcusteps.verify_page_title(String)"
});
formatter.result({
  "duration": 490221900,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_customer()"
});
formatter.result({
  "duration": 393463900,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.click_customers()"
});
formatter.result({
  "duration": 13572628000,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User Login and Addnew customer",
  "description": "",
  "id": "addcustomer;user-login-and-addnew-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "User enter UserFirstname \"prasath1\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User will be click search button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "chech firstname showing on the table is \"prasath1\" and lastname \"G\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User will close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prasath1",
      "offset": 26
    }
  ],
  "location": "addcusteps.user_enter_UserFirstname(String)"
});
formatter.result({
  "duration": 648557200,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_will_be_click_search_button()"
});
formatter.result({
  "duration": 248780200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prasath1",
      "offset": 41
    },
    {
      "val": "G",
      "offset": 65
    }
  ],
  "location": "addcusteps.chech_firstname_showing_on_the_table_is_and_lastname(String,String)"
});
formatter.result({
  "duration": 251963000,
  "status": "passed"
});
formatter.match({
  "location": "addcusteps.user_will_close_browser()"
});
formatter.result({
  "duration": 4567336400,
  "status": "passed"
});
});