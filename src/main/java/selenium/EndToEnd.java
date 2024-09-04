package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// FOR BANGLORE DROPDOWN
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
		// FOR PUNE DROPDOWN
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (int i = 1; i < 7; i++) 
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	}

}
