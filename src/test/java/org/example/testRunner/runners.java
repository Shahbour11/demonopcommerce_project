package org.example.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@CucumberOptions (
        features = "src/main/resources/features",
        glue =    {"org.example.stepDefinitions"},
        plugin = {          "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},

        tags = "@smoke"

)

public class runners extends AbstractTestNGCucumberTests {
}
