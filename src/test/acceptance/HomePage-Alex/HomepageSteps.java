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

public class HomepageSteps {

	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		// remplacer "../../../../../Library/Java/JUNIT/chromedriver par "/Library/Java/JUNIT/chromedriver" sur bash
		System.setProperty("webdriver.chrome.driver","../../../../../Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^je suis sur la homepage$")
	public void je_suis_sur_la_homepage() throws Throwable {
		driver.get("https://www.tesla.com/fr_FR/");
	}

	@Then("^le titre doit être\"([^\"]*)\"$")
	public void le_titre_doit_être(String arg1) throws Throwable {
	    assertEquals(driver.findElement(By.cssSelector(".section-title--hed.hide-on-mobile")),arg1);
	}

	@And("^le sous titre doit être \"([^\"]*)\"$")
	public void le_sous_titre_doit_être(String arg1) throws Throwable {
		// By CSS Selector
	    assertEquals(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content"), arg1);
		// By XPATH, si vous préférez...
	    // assertEquals(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"), arg1);
	}

	@Then("^le titre de la page d'accueil doit être\"([^\"]*)\"$")
	public void le_titre_de_la_page_d_accueil_doit_être(String arg1) throws Throwable {
	    assertEquals(driver.getTitle(), arg1);
	}

	@Then("^la description doit être \"([^\"]*)\"$")
	public void la_description_doit_être(String arg1) throws Throwable {
		// By CSS Selector
	    assertEquals(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content"), arg1);
		// By XPATH, si vous préférez...
	    // assertEquals(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"), arg1);
	}

	@After
	public void afterScenario() {
		driver.quit();
	}

}
