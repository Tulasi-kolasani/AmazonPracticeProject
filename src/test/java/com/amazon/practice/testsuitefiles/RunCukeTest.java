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
        format = {"pretty","html:target\\cucumber-reports.html"},
        tags={"@Smoke"}
)

public class RunCukeTest {


}
