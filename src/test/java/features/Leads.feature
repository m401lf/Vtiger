@Leads
Feature: Leads Creation
  As a Test Engineer I want to test Leads Creation functionality.

  Background: User should be on Home page
    Given I am on the Login page URL "http://localhost:8888/index.php?"
    When I enter username as "admin"
    And I enter password as "password"
    And click on login button
    Then I should see application homepage

  @CreateLeads
  Scenario: Create Leads
    When User clicks on leads link
    And User clicks on leads plus button
    And User selects First Name title as "Mr."
    And User enters First Name "auto_firstName"
    And User enters last name "auto_lastName"
    And User enters Company name "Vtiger_company"
    And User enters Title "auto_company"
    And User selects Lead Source "Employee"
    And User selects Industry "Banking"
    And User enters Annual Revenue "100"
    And User enters No Of Employees "2"
    And User enters Secondary Email "info.test@gmail.com"
    And User enters Street "7535 Torrey Santa Fe Road"
    And User enters Postal Code "92129"
    And User enters Country "US"
    And User enters Description "auto_Description"
    And User enters Phone "9999999999"
    And User enters Mobile "9999999999"
    And User enters Fax "Fax details"
    And User enters Email "info.test@gmail.com"
    And User enters Website "auto_website"
    And User selects Lead Status "Attempted to Contact"
    And User selects Assigned To "Administrator"
    And User clicks on Save button
    Then User should see lead creation success message
    And User should verify leads information
    And User logouts home page.
