package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.OrdersPage;

public class OrdersPageTest extends TestBase
{
	OrdersPage orderObject;
	HomePage homeObject;
	
	@Test
	public void validateOrderTest()
	{
		homeObject = new HomePage(driver);
		homeObject.openUserPage();
		orderObject = new OrdersPage(driver);
		orderObject.validateOrder();
	}

}
