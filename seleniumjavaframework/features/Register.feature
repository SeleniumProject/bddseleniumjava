Feature: Verify the end to end scenario on register demo website

  @smoke
  Scenario: Check register functionality with valid credentials
  Given I want navigate to demo web shop Url "http://demowebshop.tricentis.com/"
  Then User verify the Title of the home Page "Demo Web Shop"
  When I Click on Register link
  Then I verify the title of register page "Demo Web Shop. Register"
  Then I verify the register lable "Register"
  When I Click on Gender Radio button "Male"
  When I Enter the FirstName "fname"
  And I Enter the LastName "lname"
  When I Enter the Email "stephenk22212@gmail.com"
  And I Enter the Password "test123"
  And I Enter the Confirm Password "test123"
  When I Click on register button
  Then I Verify the successfulll message "test"
   @funk
  Scenario: Check validation error message in register functionality with invalid cred
    Given I want navigate to demo web shop Url "http://demowebshop.tricentis.com/"
    Then User verify the Title of the home Page "Demo Web Shop"
    When I Click on Register link
    Then I verify the title of register page "Demo Web Shop. Register"
    When I Click on register button
    Then I verify the Firstname error message <fname>, <lname>, <email>, <password>, <confirmpass>
      | fname                   | lname                  | email              | password              | confirmpass           |
      | First name is required. | Last name is required. | Email is required. | Password is required. | Password is required. |
        Then I Verify the successfulll message "test"
