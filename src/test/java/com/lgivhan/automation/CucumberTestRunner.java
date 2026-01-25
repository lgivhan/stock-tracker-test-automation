package com.lgivhan.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.lgivhan.automation",
        plugin = "pretty"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}