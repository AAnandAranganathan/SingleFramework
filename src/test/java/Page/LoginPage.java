package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By userName = By.id("eMailAddress");
	By password = By.xpath("//*[@id='userPassword']");
	By loginbutton = By.className("btn-login");
	By login = By.xpath("//button[@type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUserName(String UName) {
		
		driver.findElement(userName).sendKeys(UName);
	}
	
	public void typePassword(String Password) {
		driver.findElement(password).sendKeys(Password);
	}
	
	public void buttonLogin() {
		
		driver.findElement(loginbutton).click();
	}
	
	public void loginbutton() {
		driver.findElement(login).click();
		
	}
}
