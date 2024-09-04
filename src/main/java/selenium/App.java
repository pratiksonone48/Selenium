package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// locator
		// 1.Byid
		long start = System.currentTimeMillis();
		driver.findElement(By.id("js-link-box-en"));
		long end = System.currentTimeMillis();
		System.out.println("Time needed to get Locator by ID is " + (end - start) + " millis second");

		// 2.Byxpath
		start = System.currentTimeMillis();
		driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]"));
		end = System.currentTimeMillis();
		System.out.println("Time needed to get Locator by XPATH is " + (end - start) + " millis second");

		// 3.Bycss Selector
		start = System.currentTimeMillis();
		driver.findElements(
				By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang1"));
		end = System.currentTimeMillis();
		System.out.println("Time needed to get Locator by CSS Locator is " + (end - start) + " millis second");

		// Send Text to Webpage

		driver.findElement(By.id("searchInput")).sendKeys("2022 AVN nominations");

		WebElement searchbutton;
		driver.findElement(By.cssSelector("#search-form > fieldset > button")).click();
	}
}
