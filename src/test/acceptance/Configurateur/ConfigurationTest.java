package test.story_2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"../src/test/story_2/"}, // ou se situe votre fichier .feature
	plugin = {"pretty"}
	)
public class ConfigurationTest {

}