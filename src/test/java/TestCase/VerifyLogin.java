/**
 * 
 */
package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Page.LoginPage;

/**
 * @author Pc
 *
 */
public class VerifyLogin {
	
	@Test
	public void verifyValidLogin() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qtpselenium.com/");
		
		LoginPage login = new LoginPage(driver);
		login.buttonLogin();
		login.typeUserName("aanand.aranganathan@gmail.com");
		login.typePassword("Rakshan9");
		login.loginbutton();
		driver.quit();
			
	}

}
