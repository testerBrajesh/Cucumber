package StepDefinition;

import org.apache.logging.log4j.*;
import org.junit.Assert;
import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import PageObject.CustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	
	
	WebDriver driver;
	LoginPage obj;
	CustomerPage obj1;
	public static Logger log;
	
	@Before
	public void setup() {
		log= LogManager.getLogger("StepDef");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		log.info("Browser Launched Sucessfully.......");
		
	}
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		driver.manage().window().maximize();

	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		Log.warn("Url launched sucessfully..........");
	}

	@When("User enters email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
	  obj= new LoginPage(driver);
	  
	  obj.email(email);
	  obj.password(pwd);
	}

	@When("Click on login")
	public void click_on_login() {
		obj.clickLoginBtn();
		
		log.error("BTN clicked .......");
	   
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expected) {
		
		String actualTitle=driver.getTitle();
		
	   if(expected.equals(actualTitle)) {
		   Assert.assertTrue(true);
		   
		   }
	   
	   else {
		   Assert.assertTrue(false);
	   }
	}

	@When("User click on log out link")
	public void user_click_on_log_out_link() {
		
	    obj.logOut();
	    log.trace("click on link......");
	}

	@Then("close browser")
	public void close_browser() {
		
		driver.close();
		driver.quit();
		log.debug("browser closed Sucessfully.....");
	}
	
	///Costomer Feature
	@Then("User can view the dashboard")
	public void user_can_view_the_dashboard() {
		   obj1= new CustomerPage(driver);
		  String actualTitle= obj1.getTitleViewDashboard();
		  String expectedTitle="Dashboard / nopCommerce administration";
		  
		  if(actualTitle.equals(expectedTitle)) {
			  Assert.assertTrue(true);
			  log.info("Dashboard matched Sucessfully.......");
		  }
		  else {
			  Assert.assertTrue(false);
		  }
	   
	}

	@When("User click on Customer Menu")
	public void user_click_on_customer_menu() {
	 
	    obj1.clickCustomerMenu();
	    log.info("Customer menu matched Sucessfully.......");
	}

	@When("User click on customer menu item")
	public void user_click_on_customer_menu_item() {
		obj1.clickAddCustomer();
		log.info("clickAddCustomer Sucessfully.......");
	}

	@When("Click on add new button")
	public void click_on_add_new_button() {
		obj1.ClickOnAddNew();
		
		log.info("ClickOnAddNew Sucessfully.......");
	}
	

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	   String actualTitle= obj1.getTitleViewDashboard();
	   String expectedTitle="Add a new customer / nopCommerce administration";
	   if(actualTitle.equals(expectedTitle)) {
			  Assert.assertTrue(true);
			  log.info("Add a new customer macthed Sucessfully.......");
		  }
		  else {
			  Assert.assertTrue(false);
		  }
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		obj1.EnterEmail();
		obj1.EnterPassword();
		obj1.EnterFirstName();
		obj1.EnterLastName();
		obj1.SelectGender();
		obj1.EnterDateOfBirth();
		obj1.EnterCompanyName();
		obj1.TickIsTaxExemptCheckBox();
		 obj1.ClickOnNewsletterDropdown();
		obj1.SelectNewsletterOptions();
		
		obj1.EnterAdminComment();
		
		log.info("Entered information ......");
		
	}

	@When("User can click on save button")
	public void user_can_click_on_save_button() {
		obj1.ClickOnSaveButton();
		
		log.info("ClickOnSaveButton sucessfully ......");
		
	    
	}

	@Then("User can view confirmatin message {string}")
	public void user_can_view_confirmatin_message(String expected) {
		String bodyTagText = driver.findElement(By.tagName("body")).getText();
		if(bodyTagText.equals(expected)) {
			Assert.assertTrue(true);
			log.info("Assert.assertTrue(true) matched sucessfully ......");
		}else
		{
			Assert.assertTrue(false);
		}
		
	   
	   
	}



}
