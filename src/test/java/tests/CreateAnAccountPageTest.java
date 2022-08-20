package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAnAccountPage;
import pages.HomePage;
import pages.SignInPage;

public class CreateAnAccountPageTest extends TestBase
{
	
	HomePage homeObject;
	SignInPage signInObject;
	CreateAnAccountPage accountObject;
	BlouseTest blouseObject;
	
	@Test
	public void createAccountSuccessfully() 
	{
		homeObject = new HomePage(driver);
		homeObject.openSignInPage();
		signInObject = new SignInPage(driver);
		signInObject.enterNewEmail("user_010@gmail.com");
		signInObject.buttonCreateNewAccount();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		accountObject = new CreateAnAccountPage(driver);
		accountObject.createAccountInfo("Ahmed","Adel","12345","xyzst","cairo","00000","123456789","xyssst");
		accountObject.buttonRegister();
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
		homeObject.accountSignOut();
	}

}
