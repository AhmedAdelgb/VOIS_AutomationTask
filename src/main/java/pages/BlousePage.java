package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlousePage extends PageBase {
	

	public BlousePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(id = "add_to_cart")
	WebElement butAddToCart;


	@FindBy(linkText = "Blouse")
	WebElement blousesPage;
	


	public void openBlousePageAndBuyingItem()
	{
		blousesPage.click();
		butAddToCart.click();
	}
	
}
