$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Rahul Sinha/Downloads/BDD/FreeMyPediaV3/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free Pedia",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefination.user_already_on_LoginPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefination.Title_of_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefination.enter_username_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefination.Click_On_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefination.Login_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
});