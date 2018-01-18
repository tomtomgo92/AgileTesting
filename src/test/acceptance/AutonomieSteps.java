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
        String str[][] = new String[4][7]; //3 rows, 2 columns
        str[0][0]="Vitesse";
        str[1][0]="Temperature";
        str[2][0]="clim";
        str[3][0]="jante";
        str[4][0]="75D kms";
        str[5][0]="100D kms";
        str[6][0]="P100D kms";

        str[0][1]="100";
        str[1][1]="20";
        str[2][1]="off";
        str[3][1]="19";
        str[4][1]="466";
        str[5][1]="594";
        str[6][1]="572";

        str[0][2]="70";
        str[1][2]="30";
        str[2][2]="off";
        str[3][2]="19";
        str[4][2]="679";
        str[5][2]="865";
        str[6][2]="834";

        str[0][3]="120";
        str[1][3]="10";
        str[2][3]="on";
        str[3][3]="21";
        str[4][3]="333";
        str[5][3]="430";
        str[6][3]="406";
  
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