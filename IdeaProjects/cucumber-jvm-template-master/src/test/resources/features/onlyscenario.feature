
Feature: Contact customer cate
  User should be able to contact customer care for any assistance on orders


  @fbsignup
  Scenario Outline: Face book sign up
    Given  For a valid user id
    When we enter all the signup details '<First Name>' and '<Surname>' and '<Mobile or email>' and '<DOB>' and '<Gender>'
    Then I should be able to sign up for new user
    Examples:
      | First Name        |  Surname       | Mobile or email               |	DOB          | Gender |
      | Keerthi           | Kommu          | keerthipriya0810@gmail.com    |  08-Oct-1986    |  F     |


  @myscenario
  Scenario Outline: Fill cust care details
    Given  An order placed '<Order reference>'
    When I fill the form with the details as '<Subject Heading>' and '<Email address>' and '<Order reference>' and '<Message>'
    Then I should be able click on submit button and send message to customer care
  Examples:
  | Subject Heading   | Email address  | Order reference |	Message |
  | Customer service  | hello@gmai.com |	987		 |  its my order |




