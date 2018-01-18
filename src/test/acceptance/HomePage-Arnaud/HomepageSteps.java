package test.homepage;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HomepageSteps {

	public static WebDriver driver;

	@Before
		public void beforeScenario() {
			System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Given("^je suis sur la homepage$")
public void je_suis_sur_la_homepage() throws Throwable {
    driver.get("https://www.tesla.com/fr_FR/");
    
}

@Then("^le titre doit être \"([^\"]*)\"$")
public void le_titre_doit_être(String arg1) throws Throwable {
    assertEquals(driver.getTitle(), arg1);
}

@Then("^la puchlines doit être \"([^\"]*)\"$")
public void la_puchlines_doit_être(String arg1) throws Throwable {
assertEquals(driver.findElement(By.cssSelector("h1.section-title--hed.hide-on-mobile")).getText().replace("\n", " "),arg1); //verification de la punchline
}


// !!!!!!!!!!!!!!!!! A CHANGER PAR UNE ERREUR A LA FIN !!!!!!!!!!!!!!!!!
@Then("^la puchline ne finit pas par etoile \"([^\"]*)\"$") // ce test verifie la presence ou non d'un * a la fin de la puchline
public void la_puchline_ne_finit_pas_par_etoile(String arg1) throws Throwable {
assertNotSame(driver.findElement(By.cssSelector("h1.section-title--hed.hide-on-mobile")).getText().replace("\n", " "),arg1); //verification de la punchline    
}

@Then("^il y a un bouton0 <\"([^\"]*)\">$") 
public void il_y_a_un_bouton0(String arg1) throws Throwable {
List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile")); // Rempli une liste pour pouvoir tester les boutons
assertNotSame(butons.get(0),null);
assertEquals(butons.get(0).getText(),arg1);
}

@Then("^il y a un bouton1 <\"([^\"]*)\">$")
public void il_y_a_un_bouton1(String arg1) throws Throwable {
List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile")); // Rempli une liste pour pouvoir tester les boutons
assertNotSame(butons.get(1),null);
assertEquals(butons.get(1).getText(),arg1);
}
@Then("^il y a un bouton2 <\"([^\"]*)\">$")
public void il_y_a_un_bouton2(String arg1) throws Throwable {
List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile")); // Rempli une liste pour pouvoir tester les boutons
assertNotSame(butons.get(2),null);
assertEquals(butons.get(2).getText(),arg1);
}
@Then("^il y a un bouton3 <\"([^\"]*)\">$")
public void il_y_a_un_bouton3(String arg1) throws Throwable {
List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile")); // Rempli une liste pour pouvoir tester les boutons
assertNotSame(butons.get(3),null);
assertEquals(butons.get(3).getText(),arg1);
}
@Then("^le bouton configurer mène à <\"([^\"]*)\">$")
public void le_bouton_configurer_mène_à(String arg1) throws Throwable {
assertEquals(driver.findElement(By.cssSelector("a.btn.btn-large.btn-transparent.hide-on-mobile")).getAttribute("href"),arg1);
}


@Then("^le bouton modèle mène à <\"([^\"]*)\">$")
public void le_bouton_modèle_mène_à(String arg1) throws Throwable {
assertEquals(driver.findElement(By.cssSelector("a.btn.btn-large.btn-transparent.hide-on-mobile.hide-on-variant-2")).getAttribute("href"),arg1);

}

@Then("^le bouton Véhicules <\"([^\"]*)\">$")
public void le_bouton_Véhicules(String arg1) throws Throwable {
List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile"));
assertEquals(butons.get(2).getAttribute("href"),arg1);

}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! A VERIFIER CAR RENVOI VERS #
@Then("^le bouton Essais mène à <\"([^\"]*)\">$")
public void le_bouton_Essais_mène_à(String arg1) throws Throwable {
List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile"));
assertEquals(butons.get(3).getAttribute("href"),arg1);
}


@When("^je clique sur le burger")
public void je_clique_sur_le_burger() throws Throwable {
    driver.findElement(By.cssSelector(".tsla-header-main--trigger_icon")).click();
    throw new PendingException();


@Then("^le burger menu mène au lien Actualités <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Actualités(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Modèles d'exposition <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Modèles_d_exposition(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Véhicules d'occasion <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Véhicules_d_occasion(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Entreprises <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Entreprises(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Recharger <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Recharger(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Nous trouver <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Nous_trouver(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Evénements <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Evénements(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Empreinte carbone <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Empreinte_carbone(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le burger menu mène au lien Assistance <\"([^\"]*)\">$")
public void le_burger_menu_mène_au_lien_Assistance(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

	@After
		public void afterScenario() {
			driver.quit();
	}

}
