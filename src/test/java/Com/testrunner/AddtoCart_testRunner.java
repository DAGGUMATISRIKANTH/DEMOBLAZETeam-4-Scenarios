package Com.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature/Testcase.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@tc02_demoblazeAddtoCart"},
glue= {"steps"},
monochrome=true
)

public class AddtoCart_testRunner 
{

}
