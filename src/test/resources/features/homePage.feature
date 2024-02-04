Feature: Check adactine in hooks
Scenario Outline: Login to adactine
Given user is on homepage
When they enter username "<username>" and password "<password>"
And user click login button
Then user should go to homepage successfully
And select location drop down
And select the Hotels 
And select the Room types
And select number of rooms
Then Add check in date 
And Add check out date 
And select adults per room drop down 
Then select childrens per room drop down


Examples:
    | username  | password   |
    |SaravananSaran|Saran@123|
    
    