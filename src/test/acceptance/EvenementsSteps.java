package test.acceptance;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class EvenementsSteps {
  public static WebDriver driver;

  @Before
	public void beforeScenario() {
		// remplacer "../../../../../Library/Java/JUNIT/chromedriver par "/Library/Java/JUNIT/chromedriver" sur bash
		System.setProperty("webdriver.chrome.driver","../../../../../Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
