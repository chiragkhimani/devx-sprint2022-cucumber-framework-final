Feature: This file is useful to test logout related scenario

  Scenario Outline: Verify User Cannot Login with Invalid Credentials
    Given user open website
    When user login with username "<username>" and password "<password>"
    When verify element is displayed

    Examples:
      | username | password |
      | admin    | abc123   |
      | chirag   | admin123 |
      | chirag   | devx     |
      |          | admin123 |
      | admin    |          |
