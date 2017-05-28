
Feature: Contact customer cate
  User should be able to contact customer care for any assistance on orders

Scenario Outline: Fill the contact customer care details form
    Given  An order placed '<Order reference>'
    When I fill the form with the details as '<Subject Heading>' and '<Email address>' and '<Order reference>' and '<Message>'
    Then I should be able click on submit button and send message to customer care
    Examples:
      | Subject Heading   | Email address  | Order reference |	Message |
      | Customer service  | kerru@gmai.com |	123		 |  pls provide update on order |
      | Webmaster         | kiran@gmai.com |	234	     |  hello |
      | Webmaster         | kiran@gmai.com |	456	     |  pls raise a return req for order |
