$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/AmazonLogin.feature");
formatter.feature({
  "name": "Amazon Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to Amazon.in",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user opens Amazon.in",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonLoginStepdefs.aUserOpensAmazonIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonLoginStepdefs.userClicksOnSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify login text appears on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonLoginStepdefs.verifyLoginTextAppearsOnTheScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email address",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonLoginStepdefs.userEntersEmailAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});