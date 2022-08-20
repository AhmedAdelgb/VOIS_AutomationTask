package tests;

import org.testng.Assert;

import pages.HomePage;

public class ProductHoverMenu extends TestBase
{
	HomePage homeObject;
	
	public void userCanSelectFromWomenMenu()
	{
		homeObject = new HomePage(driver);
		homeObject.openWomenPage();
		Assert.assertEquals(driver.getTitle(),"Blouses - My Store");
	}
}
