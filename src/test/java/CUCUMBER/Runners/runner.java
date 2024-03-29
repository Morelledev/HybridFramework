package CUCUMBER.Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/CUCUMBER/Features/",
        glue = {"StepDefinations"},
        tags = "@Login",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true)
public class runner extends AbstractTestNGCucumberTests {

}
