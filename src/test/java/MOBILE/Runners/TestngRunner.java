package MOBILE.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/java/MOBILE/Features",
        glue = {"Steps"},
        tags = "@MusicPlayer",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true)
public class TestngRunner extends AbstractTestNGCucumberTests {
}
