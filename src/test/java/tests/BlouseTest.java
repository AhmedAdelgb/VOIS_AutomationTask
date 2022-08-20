package tests;

import org.testng.annotations.Test;

import pages.BlousePage;

public class BlouseTest extends TestBase
{
	BlousePage blouseObject;
	


	@Test
	public void buyingBlouse()
	{
		blouseObject = new BlousePage(driver);
		blouseObject.openBlousePageAndBuyingItem();
	}
}
