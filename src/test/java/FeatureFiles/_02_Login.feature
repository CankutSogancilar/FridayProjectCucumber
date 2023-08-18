Feature: Login Functionality
  As a user, When I enter my valid credentials, I should be able to login successfully
  when I enter invalid credentials i should not be able to login

  Background:
    Given Navigate to Parabank website


  Scenario Outline:

    And Enter username as a "<Username>"
    And Enter password as a "<password>"
    And I click login button
    And Confirm that Login Step is unsucssefull


    Examples:
      | Username  | password  |
      | ahmetdsss | 565466664 |
      | sdsdsddsd | 123       |
      | sdsdsdds  | sdfdfdfdf |
      |           | 123       |
      | ahmet8    |           |
      |           |           |

  Scenario Outline: 2
    And Enter username as a "<Username>"
    And Enter password as a "<password>"
    And I click login button
    And Confirm that Login Step is Successful
    Examples:
      | Username | password |
      | ahmet8   | 123      |


