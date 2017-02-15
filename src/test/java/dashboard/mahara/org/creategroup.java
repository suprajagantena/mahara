package dashboard.mahara.org;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class creategroup {

	FirefoxDriver driver;

	@Given("^mahara web page$")
	public void mahara_web_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://demo.mahara.org");
		driver.findElement(By.id("login_login_username")).sendKeys("admin");
		driver.findElement(By.id("login_login_password")).sendKeys("MaharaDemo");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}

	@When("^click on groups$")
	public void click_on_groups() throws Throwable {
		driver.findElement(By.className("groups")).click();
		Thread.sleep(3000);
	}

	@When("^click on group$")
	public void click_on_group() throws Throwable {
		driver.findElement(By.linkText("Create group")).click();
		Thread.sleep(2000);
	}

	@When("^Enter group name$")
	public void enter_group_name() throws Throwable {
		driver.findElement(By.id("editgroup_name")).sendKeys("vighnesh");
		Thread.sleep(3000);
	}

	@When("^click on open,Request button,Friend invitation,Recommendation$")
	public void click_on_open_Request_button_Request_button_Friend_invitation_Recommendation() throws Throwable {
		driver.findElement(By.id("editgroup_open")).click();
		driver.findElement(By.id("editgroup_controlled")).click();
		driver.findElement(By.id("editgroup_controlled")).click();
		driver.findElement(By.id("editgroup_controlled")).click();
		Thread.sleep(3000);
	}

	@When("^Select create and edit$")
	public void select_create_and_edit() throws Throwable {
		Select ddl = new Select(driver.findElement(By.id("editgroup_editroles")));
		ddl.selectByIndex(1);
		Thread.sleep(3000);
	}

	@When("^click on publicity viewable group,participation report$")
	public void click_on_publicity_viewable_group_participation_report() throws Throwable {
		driver.findElement(By.id("editgroup_public")).click();
		driver.findElement(By.name("groupparticipationreports")).sendKeys("ppp");
		Thread.sleep(3000);
	}

	@When("^select start date and End date$")
	public void select_start_date_and_End_date() throws Throwable {
		// driver.findElement(By.id("editwindowstart_optional")).click();
		// Select ddl = new
		// Select(driver.findElement(By.id("editwindowstart_year")));
		// ddl.selectByIndex(1);
		// Select ddl1 = new
		// Select(driver.findElement(By.id("editwindowstart_month")));
		// ddl1.selectByIndex(1);
		// new Select(driver.findElement(By.id("editwindowstart_day")));
		// ddl.selectByIndex(2);
		// new Select(driver.findElement(By.id("editwindowstart_hour")));
		// ddl.selectByIndex(3);
		// new Select(driver.findElement(By.id("editwindowstart_minute")));
		// ddl.selectByIndex(4);
		// driver.findElement(By.id("editwindowstart_optional")).click();
		// new Select(driver.findElement(By.id("editwindowend_year")));
		// Select ddl = null;
		// ddl.selectByIndex(5);
		// new Select(driver.findElement(By.className("form-control.select")));
		// ddl.selectByIndex(6);
		// new Select(driver.findElement(By.id("editwindowend_day")));
		// ddl.selectByIndex(7);
		// new Select(driver.findElement(By.id("editwindowend_hour")));
		// ddl.selectByIndex(8);
		
		// new Select(driver.findElement(By.id("editwindowend_minute")));
		// ddl.selectByIndex(9);
		// Thread.sleep(3000);
	}
	@When("^select Group category,shared page notification,comment notification$")
	public void select_Group_category_shared_page_notification_comment_notification() throws Throwable {
		new Select(driver.findElement(By.id("editgroup_category"))).selectByIndex(1);
		new Select(driver.findElement(By.id("editgroup_viewnotify"))).selectByIndex(1);
		new Select(driver.findElement(By.id("editgroup_feedbacknotify"))).selectByIndex(1);
	}

	@When("^select save group$")
	public void select_save_group() throws Throwable {
		driver.findElement(By.id("editgroup_submit")).click();
	}

	@Then("^Group saved successfully$")
	public void entered_Profile_saved() throws Throwable {
		if (driver.findElement(By.xpath("//div[@id='messages']/div/div")).getText()
				.equals("Group saved successfully")) {
			System.out.println("Group saved successfully");
		} else {
			System.out.println("Group not saved successfully");
		}
		driver.quit();
	}
}
