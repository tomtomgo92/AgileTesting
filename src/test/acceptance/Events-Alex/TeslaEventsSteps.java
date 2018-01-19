package test.events;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

// Story 3
public class TeslaEventsSteps {

	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^je suis sur evenement$")
public void je_suis_sur_evenement() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://www.tesla.com/fr_FR/events");
}



@Then("le nombre d'evenements doit etre 15")
public void le_nombre_d_evenements_doit_etre() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.cssSelector(".views-row-15"));
}

@When("^je clique sur le burger-menu$")
public void je_clique_sur_le_burger_menu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("label[for='tsla-header-main--trigger']")).click();

}

@When("^je clique sur events$")
public void je_clique_sur_events() throws Throwable {
	driver.findElement(By.cssSelector("a[href*='/fr_FR/events']")).click();
}

@Then("^je suis sur l'URL \"([^\"]*)\"$")
public void je_suis_sur_l_URL(String arg1) throws Throwable {
  assertEquals(driver.getUrl(),arg1);
}

@Then("^je dois etre \"([^\"]*)\"$")
public void je_dois_etre(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

@Then("^envoyer à \"([^\"]*)\"$")
public void envoyer_à(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^j'ai un formulaire \"([^\"]*)\"$")
public void j_ai_un_formulaire(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^je doit contenir l'input \"([^\"]*)\"$")
public void je_doit_contenir_l_input(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^je doit contenir la checkBox \"([^\"]*)\"$")
public void je_doit_contenir_la_checkBox(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^je valide avec un button value \"([^\"]*)\"$")
public void je_valide_avec_un_button_value(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^je recois \"([^\"]*)\"$")
public void je_recois(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^l'input doit etre \"([^\"]*)\"$")
public void l_input_doit_etre(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

	@After
	public void afterScenario() {
		driver.quit();
	}

}
