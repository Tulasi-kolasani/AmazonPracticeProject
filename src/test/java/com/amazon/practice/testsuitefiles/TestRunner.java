package com.amazon.practice.testsuitefiles;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "classpath:features",
        glue={"classpath:com.amazon.practice.stepdefinitions"},
        monochrome = true,
        plugin = {"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml"},
        tags={"@TC2","@TC3"}
)

public class TestRunner {


}
