package test.acceptance;

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

	@Given("^je suis sur la page autonomie$")
	public void je_suis_sur_la_homepage() throws Throwable {
		driver.get("https://www.tesla.com/fr_FR/events");
	}

    @Then("^l'autonomie est \"([^\"]*)\"$")
    public static void main(String[] args) {
        String str[][] = new String[3][2]; //3 rows, 2 columns
        str[0][0]="user_1";
        str[1][0]="user_2";
        str[2][0]="user_3";
        str[0][1]="pwd_1";
        str[1][1]="pwd_2";
        str[2][1]="pwd_3";
  
  for(int i=0; i<str.length; i++){//This for loop will be total executed 3 times.
   for(int j=0; j<str[i].length; j++){//This for loop will be executed for 2 time on every iteration.
    System.out.println(str[i][j]);
   }
  }
 }
}

	@After
	public void afterScenario() {
		driver.quit();
	}

}