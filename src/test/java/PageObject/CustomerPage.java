package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

	private WebDriver driver;

	public CustomerPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//ul[@data-widget='treeview']/li[4]"))
	WebElement CustomerMenu;

	@FindBy(xpath = ("//ul[@data-widget='treeview']/li[4]/ul/li"))
	WebElement AddCustomer;

	@FindBy(xpath = ("//div[@class='float-right']/a"))
	WebElement ClickOnAddNew;

	@FindBy(name = ("Email"))
	WebElement EnterEmail;

	@FindBy(id = ("Password"))
	WebElement EnterPassword;
	@FindBy(name = ("FirstName"))
	WebElement EnterFirstName;
	
	@FindBy(name = ("LastName"))
	WebElement EnterLastName;
	
	@FindBy(id = ("Gender_Male"))
	WebElement SelectGender;
	
	@FindBy(id = ("DateOfBirth"))
	WebElement EnterDateOfBirth;
	
	@FindBy(name = ("Company"))
	WebElement EnterCompany;
	
	@FindBy(id = ("IsTaxExempt"))
	WebElement TickIsTaxExemptCheckBox;
	
	@FindBy(xpath = ("//div[@role='listbox']"))
	WebElement ClickOnNewsletterDropdown;
	@FindBy(xpath = ("//li[text()='Your store name']"))
	WebElement SelectNewsletterOptions;
	
	
	@FindBy(xpath = ("//div[@class='card-body']/div[10]/div[2]"))
	WebElement ClickOnCustomerRolesDropdown;
	
	@FindBy(id = ("AdminComment"))
	WebElement EnterAdminComment;
	
	@FindBy(name = ("save"))
	WebElement ClickOnSaveButton;
	
	
	public String getTitleViewDashboard() {
		return driver.getTitle();
		
	}
	
		public void clickCustomerMenu() {
		CustomerMenu.click();
	}

	public void clickAddCustomer() {
		AddCustomer.click();
	}

	public void ClickOnAddNew() {
		ClickOnAddNew.click();
	}

	public void EnterEmail() {
		EnterEmail.sendKeys("testBrajesh@gmail.com");
	}
	public void EnterPassword() {
		EnterPassword.sendKeys("test@123");
	}
	
	public void EnterFirstName() {
		EnterFirstName.sendKeys("Raj");
	}
	
	public void EnterLastName() {
		EnterLastName.sendKeys("Kumar");
	}
	
	public void SelectGender() {
		SelectGender.click();
	}
	
	
	public void EnterDateOfBirth() {
		EnterDateOfBirth.sendKeys("01/01/2020");
	}
	
	public void EnterCompanyName() {
		EnterCompany.sendKeys("testPrivatelimited");
	}
	
	public void TickIsTaxExemptCheckBox() {
		TickIsTaxExemptCheckBox.click();
	}
	public void ClickOnNewsletterDropdown() {
		 ClickOnNewsletterDropdown.click();
	}
	public void SelectNewsletterOptions() {
		SelectNewsletterOptions.click();
	}
	
	
	
	public WebElement ClickOnCustomerRolesDropdown() {
		return ClickOnCustomerRolesDropdown;
	}
	
	
	public void EnterAdminComment() {
		EnterAdminComment.sendKeys("TestComment");
	}
	
	public void ClickOnSaveButton() {
		ClickOnSaveButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
