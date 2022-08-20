package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchDriver()
	{
		String chromePath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();	
	}

}
