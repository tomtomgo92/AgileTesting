package test.autonomy;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

// Story 4
public class TeslaAutonomySteps {

	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^je suis sur la page models$")
	public void je_suis_sur_la_page_models() throws Throwable {
		 	 	driver.get("https://www.tesla.com/fr_FR/models");
	}

	@Then("^le premier model doit avoir une autonomie de \"([^\"]*)\" pour une vitesse de \"([^\"]*)\" la température de \"([^\"]*)\" le clim doit être \"([^\"]*)\" et les jantes de \"([^\"]*)\"$")
	public void le_premier_model_doit_avoir_une_autonomie_de_pour_une_vitesse_de_la_température_de_le_clim_doit_être_et_les_jantes_de(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		 	 //	driver.findElement(By.cssSelector(".range-controls--speed >.spinner-container >.controls-data >.spinner-number")).getText();
		 	 		WebElement element = driver.findElement(By.cssSelector(".range-controls--speed>.spinner-container >.controls-data >.spinner-number"));
			  //  element.textContant = arg2;
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementsByClassName('.range-controls--speed>.spinner-container >.controls-data >.spinner-number').innerHTML='" + arg2 + "'", element);
			   // ((JavascriptExecutor)driver).executeScript("arguments[0].innerText = 'arg2'", element);
			//  element.click();
			//  element.clear();
			//  element.sendKeys(arg2);
			 assertEquals(driver.findElement(By.cssSelector(".battery-option.battery-option--75D>.battery-range-content")).getText(), arg1);
	}

	// @Then("^le second model doit avoir une autonomie de \"([^\"]*)\" pour une vitesse de \"([^\"]*)\" la température de \"([^\"]*)\" le clim doit être \"([^\"]*)\" et les jantes de \"([^\"]*)\"$")
	// public void le_second_model_doit_avoir_une_autonomie_de_pour_une_vitesse_de_la_température_de_le_clim_doit_être_et_les_jantes_de(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	// 	 	 	assertEquals(driver.findElement(By.cssSelector(".battery-option.battery-option--100D>.battery-range-content")).getText(), arg1);
	//
	// }

	// @Then("^le  troisieme model doit avoir une autonomie de \"([^\"]*)\" pour une vitesse de \"([^\"]*)\" la température de \"([^\"]*)\" le clim doit être \"([^\"]*)\" et les jantes de \"([^\"]*)\"$")
	// public void le_troisieme_model_doit_avoir_une_autonomie_de_pour_une_vitesse_de_la_température_de_le_clim_doit_être_et_les_jantes_de(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	// 	 	 	assertEquals(driver.findElement(By.cssSelector(".battery-option.battery-option--P100D>.battery-range-content")).getText(), arg1);

	// }



	@After
	public void afterScenario() {
		driver.quit();
	}

}
