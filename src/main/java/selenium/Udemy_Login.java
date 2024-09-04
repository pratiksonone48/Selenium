package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Udemy_Login {

	public static void main(String[] args) throws InterruptedException {
		// for chrome
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");

		// for Firefox
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prati\\Downloads\\Compressed\\geckodriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get(
				"https://www.udemy.com/join/login-popup/?locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2F&response_type=html&skip_suggest=1");
		driver.findElement(By.name("email")).sendKeys("bhushansingrajput@gmail.com");
		driver.findElement(By.name("password")).sendKeys("846890339455");
		driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/div/form/button")).click();
		// Thread.sleep(2000);
		System.out.println(
				driver.findElement(By.cssSelector("div[data-purpose='safely-set-inner-html:auth:error']")).getText());

		Assert.assertEquals(
				driver.findElement(By.cssSelector("div[data-purpose='safely-set-inner-html:auth:error']")).getText(),
				"Sorry, something went wrong." + "");

	}
}