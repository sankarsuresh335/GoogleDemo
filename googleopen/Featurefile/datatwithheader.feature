@datadriven
Feature: the login for ORNG.com application to use
Scenario: scenario for login page with header and login
Given :  user should be in login page
When : the user to give the correct crendtial for with datatable with hearder
|username|password|
|Admin   |admin123|
And : the user should be click the login button and see the homepage
Then : the user should be in home page and see