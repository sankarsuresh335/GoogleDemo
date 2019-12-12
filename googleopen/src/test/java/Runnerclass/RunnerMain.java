package Runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Featurefile",glue= {"stepdefinition","hookes"},

dryRun=false,
monochrome=true,
format= {"html:report/Webreport","json:report/jsonreport.json"},
tags= {"@backgoundfile"}

)


public class RunnerMain {
	

}
