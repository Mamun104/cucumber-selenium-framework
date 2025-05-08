Feature: Login Functionality


  Scenario Outline: User can't login with empty email and valid password
    Given User is on the login page
    When  User inputs empty email and valid password
    Then  User should see a login error

    Examples:
      | email | password     |
      |       | secret_sauce |

  Scenario Outline: User can't login with valid email and empty password
    Given User is on the login page
    When  User inputs valid email and empty password
    Then  User should see a password login error

    Examples:
      | email         | password |
      | standard_user |          |

  Scenario Outline: User can't login with empty email and empty password
    Given User is on the login page
    When  User inputs empty email and empty password
    Then  User should see a login error message Username is required

    Examples:
      | email | password |
      |       |          |

  Scenario Outline: User can't login with invalid email and valid password
    Given User is on the login page
    When  User inputs invalid email and valid password
    Then  User should see a login error message Username and password do not match any user in this service

    Examples:
      | email | password |
      |       |          |
