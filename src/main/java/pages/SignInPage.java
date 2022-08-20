package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageBase
{

	public SignInPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(name = "email_create")
	WebElement newEmailAddress;
	
	@FindBy(id = "SubmitCreate")
	WebElement buttonCreate;
	
	@FindBy(id = "email")
	WebElement alreadyRegisteredEmail;
	
	@FindBy(id = "passwd")
	WebElement alreadyRegisteredPassword;
	
	@FindBy(id = "SubmitLogin")
	WebElement buttonLogIn;

	public void enterNewEmail(String email)
	{
		newEmailAddress.sendKeys(email);	
	}

	public void buttonCreateNewAccount ()
	{
		buttonCreate.click();	
	}
	
	
	public void alreadyRegisteredAccount(String alrEmail,String alrPassword)
	{
		alreadyRegisteredEmail.sendKeys(alrEmail);
		alreadyRegisteredPassword.sendKeys(alrPassword);
	}
	
	public void accountSignIn()
	{
		buttonLogIn.click();
	}

}
