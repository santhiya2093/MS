Feature: To Test The Adactin Application 
@login 
Scenario: To Test The Login Page 
	Given  launch The Adactin Url Application 
	When user Enters The Username in the respective field 
	And user Enters The Password in the respective field 
	Then user Enters the LoginButton in the respective field 
	
@login1 
Scenario: To Test The Login Page 
	Given  launch The Adactin Url Application 
	When user Enters The Username <"santhiya2093"> in the respective field 
	And user Enters The Password <"4TW8V8"> in the respective field 
	Then user Enters the LoginButton in the respective field 
	
@login2 
Scenario Outline: To Test The Login Page 
	Given  launch The Adactin Url Application 
	When user Enters The Username "<username>" in the respective field 
	And user Enters The Password "<password>" in the respective field 
	Then user Enters the LoginButton in the respective field 
	
	Examples: 
	
		| username     | password    |
		| santhiya2093 | 4TW8V8      |
		| santhiya     | Santhiya@20 |
		| santghh      | hdfjhsd     |
		
@Login3 
Scenario: To Test The Login Functionality 
	Given launch The Adactin Url Application 
	When user Enters The Following Credentials In The Respective Field 
	#DataTable
		|Username    |Password     |
		|santhiya2093|4TWkf        |
		| santhiya   | Santhiya@20 |
		| santghh    | hdfjhsd     |
		|santhiya2093|4TW8V8|
				
	Then user Enters The LoginButton And Navigate To The Search Hotel Page 
			
@searchhotel 
Scenario: To Test The Search Hotel Page 
			When user Select The Location  using Dropdown 
			And user Select  The Hotel using Dropdown 
			And user Select The RoomType using Dropdown 
			And user Select The Number of Rooms using Dropdown 
			And user Select The Adults Room using Dropdown 
			And user Select The Children Room using Dropdown 
			Then user Enters The Search Button in the respective field 
@selecthotel 
Scenario: To Test The Select Hotel Page 
			When user Select the RadioButton 
			Then user Enters the Continue Button in the respective field 
@bookhotel 
		Scenario: To Test The Book A Hotel Page 
			When user Enters the Username in the respective field 
			And user Enters the Lastname in the respective field 
			And user Enters the Billing Address in the respective field 
			And user Enters the Credit Card Number in the respective field 
			And user Select the Credit Card Type using Dropdown 
			And User Select the Expiry Month using Dropdown 
			And user Select the Expiry Year using Dropdown 
			And user Enters the CCV Number in the respective field 
			Then user Enters the Book Now Button in the respective field 
@conformhotel 
		Scenario: To Test The Booking Conformation Page 
			When user Clicks On Myitinerarybutton 
			Then user Clicks on LogoutButton 
			
	