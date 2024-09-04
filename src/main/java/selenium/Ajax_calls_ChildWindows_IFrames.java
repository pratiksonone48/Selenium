package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajax_calls_ChildWindows_IFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\Downloads\\Compressed\\chromedriver.exe");
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=3481174291292813839&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301240&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("BALL").doubleClick().perform();
	
	}
}
