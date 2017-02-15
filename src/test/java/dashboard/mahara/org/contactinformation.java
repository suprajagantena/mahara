package dashboard.mahara.org;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactinformation {

	FirefoxDriver driver;

	@Given("^I login to demo mahara$")
	public void logintoMahara() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://demo.mahara.org");
		driver.findElement(By.id("login_login_username")).sendKeys("student");
		driver.findElement(By.id("login_login_password")).sendKeys("MaharaDemo");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}

	@When("^click on contact information in profile$")
	public void click_on_contact_information() throws Throwable {
		driver.findElement(By.className("content")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact information")).click();
		Thread.sleep(3000);
	}

	@When("^click on Radio button$")
	public void click_on_Radio_button() throws Throwable {
		driver.findElement(By.className("text-inline")).click();
	}

	@When("^Enter official,personal web address$")
	public void enter_official_personal_web_address() throws Throwable {
		driver.findElement(By.id("profileform_officialwebsite")).sendKeys("demo");
		driver.findElement(By.id("profileform_personalwebsite")).sendKeys("demam");
		Thread.sleep(3000);
	}

	@When("^Enter Blog,postal address$")
	public void enter_Blog_postal_address() throws Throwable {
		driver.findElement(By.id("profileform_blogaddress")).sendKeys("bbb");
		driver.findElement(By.id("profileform_address")).sendKeys("ttt");
	}

	@When("^Enter Town,city/region,country$")
	public void enter_Town_city_region_country() throws Throwable {
		driver.findElement(By.id("profileform_town")).sendKeys("Falls church");
		driver.findElement(By.id("profileform_city")).sendKeys("church");
		Select ddl = new Select(driver.findElement(By.id("profileform_country")));
		ddl.selectByIndex(3);
		Thread.sleep(3000);
	}

	@When("^Enter Home,Business,Mobile phone ,Fax number$")
	public void enter_Home_Business_Mobile_phone_Fax_number() throws Throwable {
		driver.findElement(By.id("profileform_homenumber")).sendKeys("213213213");
		driver.findElement(By.id("profileform_businessnumber")).sendKeys("312312312");
		driver.findElement(By.id("profileform_mobilenumber")).sendKeys("123123123");
		driver.findElement(By.id("profileform_faxnumber")).sendKeys("0123123123");
	}

	@When("^click on save profile$")
	public void click_on_save_profile() throws Throwable {
		driver.findElement(By.id("profileform_submit")).click();
		Thread.sleep(3000);
	}

	@Then("^profile saved succesfully$")
	public void entered_Profile_saved() throws Throwable {
		if (driver.findElement(By.xpath("//div[@id='messages']/div/div")).getText()
				.equals("Profile saved successfully")) {
			System.out.println("Profile Saved successfully");
		} else {
			System.out.println("Profile not Saved successfully");
		}
		driver.close();
	}
}
