package com.testinium.works.gittigidiyor.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = {"stepDefinition"})
public class GgdrRunner {


}
