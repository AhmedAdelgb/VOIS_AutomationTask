package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends PageBase
{

	public OrdersPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
	WebElement ordersPage;
	
	@FindBy(id = "block-history")
	WebElement historyBox;

	
	public void validateOrder()
	{
		ordersPage.click();
		System.out.println(historyBox.getText());
	}
}
