package test.story_2;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ConfigurationSteps {

	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Given("^je suis sur la homepage$")
	public void je_suis_sur_la_homepage() throws Throwable {
		driver.get("https://www.tesla.com/fr_FR/");
	}

	@Then("le bouton 1 doit être \"([^\"]*)\"$")
	public void le_bouton_1_doit_être(String arg1) throws Throwable {
		assertEquals("CONFIGURER", driver.findElement(By.cssSelector("a.btn.btn-large.btn-transparent.hide-on-mobile")).getText());
	}

	@Then("le bouton renvoi vers \"([^\"]*)\"$")
	public void le_bouton_renvoi_vers(String arg1) throws Throwable {
		assertNotSame(arg1, driver.findElement(By.cssSelector("a.btn.btn-large.btn-transparent.hide-on-mobile")).getAttribute("href"));
	}
	@Then("le bouton models renvoi vers \"([^\"]*)\"$")
	public void le_bouton_models_renvoi_vers(String arg1) throws Throwable {
		assertNotSame(arg1, driver.findElement(By.cssSelector("a.btn-primary")).getAttribute("href"));
	}


	@Given("^je suis sur la page de la configuration model s$")
	public void je_suis_sur_la_page_de_la_configuration_model_s() throws Throwable {
		driver.get("https://www.tesla.com/fr_FR/models/design");
	}

	@When("^je clic sur LOA \"([^\"]*)\"$")
	public void je_clic_sur_LOA(String arg1) throws Throwable {
		assertEquals(arg1, driver.findElement(By.cssSelector("a.lease")).getAttribute("href"));	
	}

	@Then("^le prix par defaut LOA est \"([^\"]*)\"$")
	public void le_prix_par_defaut_LOA_est(String arg1) throws Throwable {
	Thread.sleep(2000);
	assertEquals(arg1, driver.findElement(By.cssSelector(".tab-content-section.lease.top.effective_monthly_price .price-label.primary-price-label")).getText());
	}

	@When("^je suis sur LOA \"([^\"]*)\"$")
	public void je_suis_sur_LOA(String arg1) throws Throwable {
		assertEquals(arg1, driver.findElement(By.cssSelector("a.lease")).getAttribute("href"));	
	}

	@Then("^le prix en LOA est à \"([^\"]*)\"$")
	public void le_prix_en_LOA_est_à(String arg1) throws Throwable {
		Thread.sleep(2000);
		assertEquals(arg1, driver.findElement(By.cssSelector(".tab-content-section.lease.top.effective_monthly_price .price-label.primary-price-label")).getText());
	}

	@Then("^le text est \"([^\"]*)\"$")
	public void le_text_est(String arg1) throws Throwable {
		Thread.sleep(2000);
		assertEquals(arg1, driver.findElement(By.cssSelector(".tab-content-section.lease.top.effective_monthly_price .tag-line.primary-price-label")).getText());
	}

	@Then("^le prix suivant est \"([^\"]*)\"$")
	public void le_prix_suivant_est(String arg1) throws Throwable {
		Thread.sleep(2000);
		assertEquals(arg1, driver.findElement(By.cssSelector(".tab-content-section.lease.middle .price-label.primary-price-label")).getText());
	}

	@Then("^le text suivant est \"([^\"]*)\"$")
	public void le_text_suivant_est(String arg1) throws Throwable {
		Thread.sleep(2000);
		assertEquals(arg1, driver.findElement(By.cssSelector(".tab-content-section.lease.middle .tag-line.primary-price-label")).getText());
	}

	@After
	public void afterScenario() {
		driver.quit();
	}
}