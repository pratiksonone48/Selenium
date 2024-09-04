package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.udemy.com/");

		WebElement LoginButton = driver.findElement(By.cssSelector(
				"#udemy > div.ud-main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.ud-header.ud-app-loaded > div.ud-header.ud-text-sm.desktop-header-module--header--3nb6v.desktop-header-module--flex-middle--1e7c8 > div:nth-child(8) > a > span"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", LoginButton);

		((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");

		((JavascriptExecutor) driver).executeScript("window.location = 'https://wikipedia.com'");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

		driver.close();

	}
}
