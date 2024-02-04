package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/homePage.feature",glue="org.stepdefinition",dryRun=false,monochrome=true,
plugin={"html:report/WebReport","json:report/jsonreport.json","junit:report/xmlreport.xml"})

public class TestRunner {

}
