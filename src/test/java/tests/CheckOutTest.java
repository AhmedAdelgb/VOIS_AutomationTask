package tests;

import org.testng.annotations.Test;

import pages.CheckOutProcedure;
import pages.HomePage;

public class CheckOutTest extends TestBase
{
	CheckOutProcedure checkObject;
	HomePage homeObject;
	
	@Test
	public void testCheckOut()
	{
		checkObject = new CheckOutProcedure(driver);
		checkObject.orderProcedure();
		homeObject = new HomePage(driver);
		homeObject.openUserPage();
	}

}
