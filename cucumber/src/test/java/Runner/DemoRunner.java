package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\jenkins\\Jenkins\\cucumber\\src\\test\\java\\FeatureFile\\First.feature", glue = "/StepDefination")
public class DemoRunner {

}
