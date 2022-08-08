Feature: This file is useful to test logout related scenario

    Scenario: Verify User Can Logout
      Given user open website
      When user login with valid credentials
      Then verify user is on homepage
      When user clicks on user badge
      And click on logout link
      Then verify login page is displayed