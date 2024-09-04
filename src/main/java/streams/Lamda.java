package streams;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lamda {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditbox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
		
		WebElement dob= driver.findElement(By.cssSelector("[for=\"dateofBirth\"]"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		WebElement Txt1= driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]"));
		System.out.println(Txt1.getText());
		driver.findElement(with(By.tagName("input")).toLeftOf(Txt1)).click();

	}

}
