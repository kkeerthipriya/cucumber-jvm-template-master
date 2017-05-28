
Feature: Contact customer cate
  User should be able to contact customer care for any assistance on orders

  @basicscenario1
  Scenario: Fill the contact customer care details form
    Given  An order placed "421"
    When I fill the form with the details as "Customer service" and "kkk@gmail.com" and "421" and "order is mine"
    Then I should be able click on submit button and send message to customer care

  @basicscenio2
  Scenario: Fill the contact customer care details form
    Given  An order placed "4214"
    When I fill the form with the details as "Customer service" and "kkk@gmail.com" and "421" and "order is mine"
    Then I should be able click on submit button and send message to customer care

@myscenario
  Scenario Outline: Fill cust care details form
    Given  An order placed '<Order reference>'
    When I fill the form with the details as '<Subject Heading>' and '<Email address>' and '<Order reference>' and '<Message>'
    Then I should be able click on submit button and send message to customer care
  Examples:
  | Subject Heading   | Email address  | Order reference |	Message |
  | Customer service  | hello@gmai.com |	987		 |  its my order |


