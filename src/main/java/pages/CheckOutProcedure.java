package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutProcedure extends PageBase {

	public CheckOutProcedure(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement btnProceedToCheckOut;

	@FindBy(name = "processAddress")
	WebElement btn2ProceedToCheckOut;

	@FindBy(id = "cgv")
	WebElement agreeCheckBox;

	@FindBy(name =  "processCarrier")
	WebElement btn3ProceedToCheckOut;


	@FindBy(className  = "bankwire")
	WebElement payWireBankOption;

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement btnConfirmOrder;

	public void orderProcedure ()
	{
		btnProceedToCheckOut.click();
		btn2ProceedToCheckOut.click();
		agreeCheckBox.click();
		btn3ProceedToCheckOut.click();
		payWireBankOption.click();
		btnConfirmOrder.click();
	}
}
