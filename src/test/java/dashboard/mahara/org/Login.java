package dashboard.mahara.org;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import cucumber.api.java.en.And;


public class Login {
	
	FirefoxDriver driver;
		
	@Given("^I navigate to demo.mahara.org$")
	public void MaharNavigation() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("http://demo.mahara.org");
	}
	@When("^I enter (.*) in the field$")
	public void i_enter_username_in_the_field(String username) throws Throwable {
		driver.findElement(By.id("login_login_username")).sendKeys(username);
	}

	@And("^I enter the password (.*)$")
	public void i_enter_the_password(String password) throws Throwable {
     driver.findElement(By.id("login_login_password")).sendKeys(password);
	}

	@And("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
		driver.findElement(By.name("submit")).click();
	}

	@Then("^Mahara demo page is displayed$")
	public void validate_home()
	{
		System.out.println("Validating home page");
		driver.quit();
	}
	
}