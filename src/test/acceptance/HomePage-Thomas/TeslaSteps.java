package test.homepage;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

// Story 1
public class TeslaSteps {

	public static WebDriver driver;
	public WebDriverWait wait;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","../../../../../Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^je suis sur la homepage$")
	public void je_suis_sur_la_homepage() throws Throwable {
		driver.get("https://www.tesla.com/fr_FR/");
	}

	@Then("^le titre de la page d'accueil doit être \"([^\"]*)\"$")
	public void le_titre_de_la_page_d_accueil_doit_être(String arg1) throws Throwable {
		assertEquals(driver.getTitle(), arg1);
	}

	@Then("^la description de la page d'accueil doit être \"([^\"]*)\"$")
	public void la_description_de_la_page_d_accueil_doit_être(String arg1) throws Throwable {
		//System.out.println(arg1.contains(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content")));
		//assertEquals(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content"), arg1;
	}

	@Then("^la punchline du site doit être \"([^\"]*)\"$")
	public void la_punchline_du_site_doit_être(String arg1) throws Throwable {
		assertEquals(driver.findElement(By.cssSelector("h1.section-title--hed.hide-on-mobile")).getText().replaceAll("\n", " "),arg1);
	}

	@Then("^le titre du bouton doit être \"([^\"]*)\"$")
	public void le_titre_du_bouton_doit_être(String arg1) throws Throwable {
		List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile"));
		for (int i = 0; i < butons.size(); i++) {
			if (butons.get(i).getText().trim() == arg1) {
				assertEquals(butons.get(i).getText().trim().toLowerCase(), arg1.toLowerCase());
			}
		}
	}
	
	@When("^je clique sur le bouton \"([^\"]*)\" qui a pour lien \"([^\"]*)\"$")
	public void je_clique_sur_le_bouton_qui_a_pour_lien(String arg1, String arg2) throws Throwable {
		List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile"));
		for (int i = 0; i < butons.size(); i++) {
			if (butons.get(i).getText().trim().toLowerCase().equals(arg1.toLowerCase())) {
				if(butons.get(i).getText().trim().toLowerCase().equals("essais")) {
					driver.findElement(By.cssSelector("a[title='Essais']")).click();
					Thread.sleep(2000);
				} else {
					if (arg1.toLowerCase().equals("configurer")) {
						driver.findElement(By.cssSelector("a[title=' Configurer']")).click();
						Thread.sleep(2000);
					}
				}
			}
		}
	}

	@When("^je clique sur le burger menu$")
	public void je_clique_sur_le_burger_menu() throws Throwable {
		driver.findElement(By.cssSelector("span.tsla-header-main--trigger_icon")).click();
	}

	@Then("^j arrive sur la page \"([^\"]*)\" a partir du lien \"([^\"]*)\"$")
	public void j_arrive_sur_la_page_a_partir_du_lien(String arg1, String arg2) throws Throwable {
		List<WebElement> butons =  driver.findElements(By.cssSelector(".btn.btn-large.btn-transparent.hide-on-mobile"));
			for (int i = 0; i < butons.size(); i++) {
				if (butons.get(i).getText().trim().toLowerCase().equals(arg1.toLowerCase())) {
					if(arg1.equals("")) {
						assertNotEquals(driver.findElement(By.id("test-drive-modal")).getCssValue("display"), "none");
					} else {
						if (arg1.toLowerCase().equals("configurer")) {
							if(arg2.equals("https://www.tesla.com/fr_FR/modelx/design")) {
								assertEquals(driver.findElement(By.cssSelector("a[href='modelx/design']")).getAttribute("href"), arg1);
							} else {
								assertEquals(driver.findElement(By.cssSelector("a[href='models/design']")).getAttribute("href"), arg1);
							}
						} else {
							if (butons.get(i).getText().toLowerCase().trim().equals("modèle d'exposition")) {
								assertEquals(driver.findElement(By.cssSelector("a[href='/fr_FR/new']")).getAttribute("href"), arg1);
							} else {
								assertEquals(driver.findElement(By.cssSelector("a[href='/fr_FR/used']")).getAttribute("href"), arg1);
							}
						}
					}
				}
			}
		}
	
	@Then("^le lien suivant est disponible \"([^\"]*)\" pour \"([^\"]*)\"$")
	public void le_lien_suivant_est_disponible_pour(String arg1, String arg2) throws Throwable {
		List<WebElement> link = driver.findElements(By.cssSelector("li.tsla-header-nav--list_item > a"));
		for(int i = 0; i < link.size(); i++) {
			//System.out.println("\n\n"+link.get(i).getText());
			//System.out.println("\n\n"+arg1);
			if (link.get(i).getText().toLowerCase().trim().equals(arg2.toLowerCase())) {
				//System.out.println("\n\n"+arg1);
				//System.out.println(arg2);
				assertEquals(link.get(i).getAttribute("href"), arg1);
			}
		}		
	}

	@After
	public void afterScenario() {
		driver.quit();
	}

}