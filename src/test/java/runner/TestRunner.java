package runner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/F05_FollowUs.feature",
        glue = "steps/SD05_FollowUsSteps"
)
public class TestRunner extends TestBase {
}
