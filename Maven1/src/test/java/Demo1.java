import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1
{
	public WebDriver driver;
	@BeforeMethod
	public void before()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void after() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	@Test //Test method 1
	public void google()
	{
		driver.get("https://www.google.com");
	}
	@Test //Test method 2
	public void facebook()
	{
		driver.get("https://www.facebook.com");
	}

}
