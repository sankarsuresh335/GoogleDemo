Feature: the login for orangehrm 
Scenario Outline: scenario for login page with header and login
Given :  user should be in login page with ans
When : the user enters  "<username>" and password "<password>" 
And : clicked button

Examples:
|username|password|
|Admin   |admin123|
|admin   |Admin123|
|Admin   |admin123|
|Admin   |admin123|


