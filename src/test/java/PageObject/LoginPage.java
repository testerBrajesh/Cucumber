package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy(linkText="Logout")
	WebElement Logout;
	
	
	public void logOut() 
	{
		Logout.click();
		
	}
	
	public void email(String emailadd) 
	{
		Email.clear();
		Email.sendKeys(emailadd);
	}
	
	
	public void password(String pwdadd) 
	{
		Password.clear();
		Password.sendKeys(pwdadd);
	}
	
	public void clickLoginBtn() 
	{
		Loginbtn.click();
	}
	
}
