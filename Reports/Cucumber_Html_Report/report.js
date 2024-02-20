$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactintesthotel.feature");
formatter.feature({
  "line": 1,
  "name": "To Test The Adactin Application",
  "description": "",
  "id": "to-test-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 31,
  "name": "To Test The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-application;to-test-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Login3"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "launch The Adactin Url Application",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user Enters The Following Credentials In The Respective Field",
  "rows": [
    {
      "comments": [
        {
          "line": 34,
          "value": "#DataTable"
        }
      ],
      "cells": [
        "Username",
        "Password"
      ],
      "line": 35
    },
    {
      "cells": [
        "santhiya2093",
        "4TWkf"
      ],
      "line": 36
    },
    {
      "cells": [
        "santhiya",
        "Santhiya@20"
      ],
      "line": 37
    },
    {
      "cells": [
        "santghh",
        "hdfjhsd"
      ],
      "line": 38
    },
    {
      "cells": [
        "santhiya2093",
        "4TW8V8"
      ],
      "line": 39
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user Enters The LoginButton And Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefTest.launch_The_Adactin_Url_Application()"
});
formatter.result({
  "duration": 3730480800,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_The_Following_Credentials_In_The_Respective_Field(DataTable)"
});
formatter.result({
  "duration": 1114363000,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_The_LoginButton_And_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 955743200,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "To Test The Search Hotel Page",
  "description": "",
  "id": "to-test-the-adactin-application;to-test-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@searchhotel"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user Select The Location  using Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user Select  The Hotel using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user Select The RoomType using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user Select The Number of Rooms using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user Select The Adults Room using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user Select The Children Room using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user Enters The Search Button in the respective field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefTest.user_Select_The_Location_using_Dropdown()"
});
formatter.result({
  "duration": 451844500,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_The_Hotel_using_Dropdown()"
});
formatter.result({
  "duration": 350350000,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_The_RoomType_using_Dropdown()"
});
formatter.result({
  "duration": 362084500,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_The_Number_of_Rooms_using_Dropdown()"
});
formatter.result({
  "duration": 434227100,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_The_Adults_Room_using_Dropdown()"
});
formatter.result({
  "duration": 290229600,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_The_Children_Room_using_Dropdown()"
});
formatter.result({
  "duration": 277185800,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_The_Search_Button_in_the_respective_field()"
});
formatter.result({
  "duration": 590245900,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "To Test The Select Hotel Page",
  "description": "",
  "id": "to-test-the-adactin-application;to-test-the-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@selecthotel"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "user Select the RadioButton",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "user Enters the Continue Button in the respective field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefTest.user_Select_the_RadioButton()"
});
formatter.result({
  "duration": 174994200,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_the_Continue_Button_in_the_respective_field()"
});
formatter.result({
  "duration": 628512500,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "To Test The Book A Hotel Page",
  "description": "",
  "id": "to-test-the-adactin-application;to-test-the-book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@bookhotel"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "user Enters the Username in the respective field",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "user Enters the Lastname in the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "user Enters the Billing Address in the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user Enters the Credit Card Number in the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user Select the Credit Card Type using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User Select the Expiry Month using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user Select the Expiry Year using Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "user Enters the CCV Number in the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "user Enters the Book Now Button in the respective field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefTest.user_Enters_the_Username_in_the_respective_field()"
});
formatter.result({
  "duration": 266535700,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_the_Lastname_in_the_respective_field()"
});
formatter.result({
  "duration": 296355700,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_the_Billing_Address_in_the_respective_field()"
});
formatter.result({
  "duration": 360017400,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_the_Credit_Card_Number_in_the_respective_field()"
});
formatter.result({
  "duration": 362572200,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_the_Credit_Card_Type_using_Dropdown()"
});
formatter.result({
  "duration": 497128600,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_the_Expiry_Month_using_Dropdown()"
});
formatter.result({
  "duration": 428795700,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Select_the_Expiry_Year_using_Dropdown()"
});
formatter.result({
  "duration": 261669400,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_the_CCV_Number_in_the_respective_field()"
});
formatter.result({
  "duration": 206713200,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_the_Book_Now_Button_in_the_respective_field()"
});
formatter.result({
  "duration": 191573300,
  "status": "passed"
});
formatter.scenario({
  "line": 68,
  "name": "To Test The Booking Conformation Page",
  "description": "",
  "id": "to-test-the-adactin-application;to-test-the-booking-conformation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 67,
      "name": "@conformhotel"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "user Clicks On Myitinerarybutton",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "user Clicks on LogoutButton",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefTest.user_Clicks_On_Myitinerarybutton()"
});
formatter.result({
  "duration": 7080438700,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Clicks_on_LogoutButton()"
});
formatter.result({
  "duration": 481663700,
  "status": "passed"
});
});