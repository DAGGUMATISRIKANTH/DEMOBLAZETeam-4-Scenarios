$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "DemoBlaze Website",
  "description": "",
  "id": "demoblaze-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DemoBlaze_Feature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "Login in to demo blaze steps",
  "id": "demoblaze-website;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc01_demoblazelogin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launched the chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user open the Demoblaze website",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on login button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "demoblaze-website;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "demoblaze-website;;;1"
    }
  ],
  "keyword": "Examples"
});
});