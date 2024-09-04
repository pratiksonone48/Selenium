package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement titleofwebpage = driver
				.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
		String titletext = titleofwebpage.getText();
		String expectedtext = "Wikipedia";

		if (titletext.equals(expectedtext)) {
			System.out.println("Test has Passed");
		} else {
			System.out.println("Test did not Passed");
			driver.close();
			throw new Exception();
		}

	}
}