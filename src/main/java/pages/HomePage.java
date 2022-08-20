package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(linkText = "Sign in")
	WebElement signinButton;
	
	@FindBy(linkText = "Sign out")
	WebElement buttonSignOut;
	
	@FindBy(linkText = "Women")
	WebElement womenMenu;
	
	@FindBy(className = "account")
	WebElement accountPage;

	public void openSignInPage()
	{
		signinButton.click();	
	}
	
	public void accountSignOut()
	{
		buttonSignOut.click();
	}
	
	public void openWomenPage()
	{
		womenMenu.click();
	}
	
	public void openUserPage()
	{
		accountPage.click();
	}
}
