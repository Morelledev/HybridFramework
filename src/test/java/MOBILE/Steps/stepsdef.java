package MOBILE.Steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static CUCUMBER.Pages.HomePage.driver;


public class stepsdef extends Base {
    @Given("The app is launched")
    public void the_app_is_launched() {

    }

    @And("User verify that the landing is displayed")
    public void user_verify_that_the_landing_is_displayed() {
        apiDemosPage.verifyLandingPage();
    }

    @And("User click App")
    public void userClickApp() {
        apiDemosPage.clickApp();
    }

    @And("User click alarm")
    public void userClickAlarm() {
        apiDemosPage.clickAlarm();
    }

    @And("user click alarm controller")
    public void userClickAlarmController() {
        apiDemosPage.clickAlarmController();
    }

    @When("user click one shot alarm")
    public void userClickOneShotAlarm() {
        apiDemosPage.clickOneShotAlarm();
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failure Screenshot");
        }
    }
}
