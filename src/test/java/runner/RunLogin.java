package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/feature/edit.feature",glue= {"tests.page", "learninhooks"},monochrome=true)

@RunWith(Cucumber.class)
public class RunLogin {

}
