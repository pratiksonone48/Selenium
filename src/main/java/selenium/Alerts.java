package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"file:///C:/Users/prati/AppData/Local/Temp/Tempfaf406d9-0500-4424-a327-ece03325f5c7_10.1%20seleniumDemo.zip/alerts.html");

		WebElement BasicAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(2)"));
		WebElement ConfirmationAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(5)"));
		WebElement PromtAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(8)"));

		BasicAlertButton.click();

		WebDriverWait wait;
		
		
		driver.getTitle();

	}

}
