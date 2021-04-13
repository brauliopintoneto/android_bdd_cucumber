package testclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/SomaEPar.feature", glue = "testclass")
public class RunnerSomaEPar {



}
