package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowSwitch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.qafox.com/");
		String parentWindowId = driver.getWindowHandle();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath(
				"//*[@class='elementor-icon elementor-social-icon elementor-social-icon-youtube elementor-repeater-item-e7e33af']"))
				.click();
		driver.findElement(By.xpath(
				"//a[@class='elementor-icon elementor-social-icon elementor-social-icon-linkedin elementor-repeater-item-6090e14']"))
				.click();
		driver.findElement(By.xpath(
				"//a[@class='elementor-icon elementor-social-icon elementor-social-icon-facebook elementor-repeater-item-8e4108e']"))
				.click();

		driver.findElement(By.xpath(
				"//a[@class='elementor-icon elementor-social-icon elementor-social-icon-twitter elementor-repeater-item-13b9f60']"))
				.click();

		Set<String> handles = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handles);
		if (switchToRightWindow("Facebook", hlist)) {
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
		}
		switchToParentWindow(parentWindowId);
		closeChildWindows(parentWindowId, hlist);

		driver.quit();
	}

	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
	}

	public static void closeChildWindows(String parentWindowId, List<String> hlist) {
		for (String e : hlist) {
			if (!parentWindowId.equals(e)) {
				driver.switchTo().window(e).close();
			}
		}
	}

	public static boolean switchToRightWindow(String windowTitle, List<String> hlist) {
		for (String e : hlist) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("found the right window...");
				return true;
			}
		}
		return false;
	}
}
