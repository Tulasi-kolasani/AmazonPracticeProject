package com.amazon.practice.stepdefinitions;
import com.amazon.practice.utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class CommonStepDefinition extends DriverFactory {

    @Given("I navigate to the URL")
    public static void navigateToURL() throws Exception
    {
        getDriver();

    }

    @After
    public void afterEachScenario()
    {
        driver.close();
    }


}
