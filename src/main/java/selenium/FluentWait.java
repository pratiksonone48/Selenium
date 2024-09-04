package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");
		FluentWait wait = new FluentWait();
		driver.manage().window().maximize();
		System.getProperty("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.cssSelector("[id='start'] button")).click();

		driver.findElement(By.cssSelector("[id='finish'] h4")).getText();

	}

}
