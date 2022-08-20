package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;

public class Project extends TestBase
{
	
	CreateAnAccountPageTest createAccount;
	HomePage homeObject;
	BlouseTest blouseObject;
	SignInTest signInObject;
	CheckOutTest checkoutObject;
	OrdersPageTest ordersObject;
	
	@Test
	public void automationTaskVOIS()
	{
		createAccount = new CreateAnAccountPageTest();
		createAccount.createAccountSuccessfully();
		signInObject = new SignInTest();
		signInObject.userCanSignInSuccessfully();
		homeObject = new HomePage(driver);
		homeObject.openWomenPage();
		blouseObject = new BlouseTest();
		blouseObject.buyingBlouse();
		//Handling Popup Window Thorugh JavaScript
		WebElement butCheckOut = driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", butCheckOut);
		driver.navigate().refresh();
		checkoutObject = new CheckOutTest();
		checkoutObject.testCheckOut();
		ordersObject = new OrdersPageTest();
		ordersObject.validateOrderTest();
	}

}
