package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage extends HomePage {

	public CreateAnAccountPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(id = "id_gender1")
	WebElement maleGender;

	@FindBy(id = "customer_firstname")
	WebElement txtFirstName;

	@FindBy(id = "customer_lastname")
	WebElement txtLastName;

	@FindBy(id = "email")
	WebElement txtEmail;

	@FindBy(id = "passwd")
	WebElement txtPassword;

	@FindBy(id = "firstname")
	WebElement txtAddressFirstName;

	@FindBy(id = "lastname")
	WebElement txtAddressLastName;

	@FindBy(id = "address1")
	WebElement txtAddress;

	@FindBy(id = "city")
	WebElement txtCity;

	@FindBy(id = "id_state")
	WebElement selectState;
	
	Select stateOptions = new Select(selectState);

	@FindBy(id = "postcode")
	WebElement txtPostalCode;

	@FindBy(id = "id_country")
	WebElement selectCountry;
	
	Select countryOptions = new Select(selectCountry);

	@FindBy(id = "phone_mobile")
	WebElement txtPhoneNumber;

	@FindBy(id = "alias")
	WebElement txtAliasAddress;

	@FindBy(id = "submitAccount")
	WebElement buttonRegister;
	
	public void createAccountInfo(String firstName,String lastName,String password,String address,String city,String postalCode,String phoneNumber,String aliasAddress)
	{
		maleGender.click();
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		txtPassword.sendKeys(password);
		txtAddress.sendKeys(address);
		txtCity.sendKeys(city);
		stateOptions.selectByVisibleText("Alaska");
		txtPostalCode.sendKeys(postalCode);
		countryOptions.selectByVisibleText("United States");
		txtPhoneNumber.sendKeys(phoneNumber);
		txtAliasAddress.clear();
		txtAliasAddress.sendKeys(aliasAddress);
	}
	
	public void buttonRegister()
	{
		buttonRegister.click();
	}

}
