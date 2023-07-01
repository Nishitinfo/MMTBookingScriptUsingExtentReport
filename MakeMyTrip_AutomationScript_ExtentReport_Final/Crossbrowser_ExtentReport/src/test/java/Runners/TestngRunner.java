package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"/home/poojan/IdeaProjects/MMTBookingScriptUsingExtentReport/MakeMyTrip_AutomationScript_ExtentReport_Final/Crossbrowser_ExtentReport/src/test/resources/Features/"},
        glue = {"Pages"},
        plugin = {"pretty", "json:target/json-report/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        },
        monochrome = true,
        publish = true
)

public class TestngRunner extends AbstractTestNGCucumberTests {

}