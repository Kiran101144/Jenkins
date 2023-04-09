package runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\jenkins\\Jenkins\\CucumberRestAPI\\src\\test\\java\\Feature\\Atest.feature", glue = "stepDefinatios")
public class ARunner {

}
