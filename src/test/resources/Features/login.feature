Feature: LoginPage Functionality

  Scenario: Validating the url
    Given User is on the browser
    When User opens the LMS Website
    Then User should see the Login page

  Scenario Outline: Validating the Login functionality with invalid  username or password
    Given User is on the Login Page
    When User clicks the Login button after entering invalid username or password
    Then User should not be logged in 

    Examples: 
      | username | password | errormessage                                   |
      | abs      |          | Invalid username and password Please try again |
      |          | ams      | Invalid username and password Please try again |

  Scenario Outline: Validating the Login functionality with valid username and password
    Given User is on the Login Page
    When User clicks the Login button after entering valid username and password
    Then User should see the LMS Home page.

    Examples: 
      | username | password |
      | lms      | lms      |
