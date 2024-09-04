package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("https://www.qaclickacademy.com/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerDriver = driver.findElement(By.id("footer-part"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
	}

}
