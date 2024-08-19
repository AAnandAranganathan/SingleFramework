package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Config.ConfigFactory;
import Config.FrameworkConfig;

public class DemoTest {

	//local, remote(Selenium, selenoid, browserStock) chrome or Firefox
	
	
	
	@Test
	public void OpenBrowser() {
		
		//FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
		//FrameworkConfig config =ConfigCache.getOrCreate(FrameworkConfig.class);
		// this will make sure it will create only one Instance
		System.out.println(ConfigFactory.getConfig().browser());
		
		//System.out.println(config.browser());
		//System.out.println(config.browser());
		/*
		 * WebDriver driver =new FirefoxDriver(); driver.get("https://google.co.in");
		 * driver.quit();
		 */
	}
}
