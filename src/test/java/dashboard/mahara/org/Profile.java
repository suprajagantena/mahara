package dashboard.mahara.org;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Profile {
	FirefoxDriver driver;

	@Given("^I login to mahara$")
	public void logintoMahara() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("http://demo.mahara.org");
		driver.findElement(By.id("login_login_username")).sendKeys("student");
		driver.findElement(By.id("login_login_password")).sendKeys("MaharaDemo");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}

	@When("^Hover cursor on content$")
	public void hover_cursor_on_content() throws Throwable {
		driver.findElement(By.className("content")).click();
		Thread.sleep(3000);
	}

	@When("^Enter (.*),(.*),(.*),(.*),Introduction$")
	public void enter_Firstname_Lastname_Student_ID_Displayname_Introduction(String Fname,String LName,String stid,String dispName) throws Throwable {
		driver.findElement(By.id("profileform_firstname")).clear();
		driver.findElement(By.id("profileform_firstname")).sendKeys(Fname);
		driver.findElement(By.id("profileform_lastname")).clear();
		driver.findElement(By.id("profileform_lastname")).sendKeys(LName);
		driver.findElement(By.id("profileform_studentid")).clear();
		driver.findElement(By.id("profileform_studentid")).sendKeys(stid);
		driver.findElement(By.id("profileform_preferredname")).clear();
		driver.findElement(By.id("profileform_preferredname")).sendKeys(dispName);
//		driver.findElement(By.id("")).sendKeys("My Name is Paula.");
	}

	@When("^click on Save Profile$")
	public void click_on_Save_Profile() throws Throwable {
		driver.findElement(By.id("profileform_submit")).click();
		Thread.sleep(2000);
	}

	@Then("^Entered Profile saved$")
	public void entered_Profile_saved() throws Throwable {
		if (driver.findElement(By.xpath("//div[@id='messages']/div/div")).getText().equals("Profile saved successfully"))
		{
			System.out.println("Profile Saved successfully");
		}
		else
		{
			System.out.println("Profile not Saved successfully");
		}
		driver.quit();
	}
}
