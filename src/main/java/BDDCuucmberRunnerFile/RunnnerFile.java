package BDDCuucmberRunnerFile;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"feature"},
                 glue =     {"StepDefination"},
                 plugin =    { "pretty",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 //tags="@regression",
                  monochrome = true )

public class RunnnerFile extends AbstractTestNGCucumberTests
{
	
}	
