package basicpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Script1 
{
	@Test
	public void testCase() throws InterruptedException
	{
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver= new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://fb.com");
		Thread.sleep(2000);
		driver.quit();  
	}

}
