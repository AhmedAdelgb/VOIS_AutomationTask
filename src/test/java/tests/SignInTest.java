package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class SignInTest extends TestBase
{
	SignInPage signInObject;

	@Test
	public void userCanSignInSuccessfully()
	{
		signInObject = new SignInPage(driver);
		signInObject.alreadyRegisteredAccount("user_010@gmail.com", "12345");
		signInObject.accountSignIn();
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
	}

}
