Feature: Check adactine in hooks
Scenario Outline: Login to adactine
Given user is on homepage
When they enter username "<username>" and password "<password>"
And user click login button
Then user should go to homepage successfully



Examples:
    | username  | password   |
    |SaravananSaran|Saran@123|
    