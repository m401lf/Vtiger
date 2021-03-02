@Login
Feature: Sign In
  As an employee of the company
  I want to login to application with my credentails
  In order to use the application features.

  Background: User navigates to Application URL
    Given I am on the Login page URL "http://localhost:8888/index.php?"
    Then I should see Log In Page

  @sanity
  Scenario: Sign In with valid credential
    When I enter username as "admin"
    And I enter password as "password"
    And click on login button
    Then I should see application homepage
    And I should see administrator text message on home Page
    # And I logout home page.

  @sanity
  Scenario Outline: Sign In with valid credentials
    When I enter username as "<userName>"
    And I enter password as "<password>"
    And click on login button
    Then I should see application homepage
    And I should see administrator text message on home Page
    # And I logout home page.

    Examples: 
      | userName | password |
      | admin    | password |
