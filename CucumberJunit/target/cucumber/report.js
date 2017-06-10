$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/testFeature/Test.feature");
formatter.feature({
  "id": "test-cucumber-with-bose",
  "description": "",
  "name": "Test Cucumber with Bose",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 13659175155,
  "status": "passed"
});
formatter.scenario({
  "id": "test-cucumber-with-bose;successful-login-with-valid-credentials",
  "description": "",
  "name": "Successful Login with Valid Credentials",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "User enters UserName and Password",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "StepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 10521655008,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 8864477,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 28841,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 37151,
  "status": "passed"
});
formatter.after({
  "duration": 2782352973,
  "status": "passed"
});
});