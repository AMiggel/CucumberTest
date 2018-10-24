package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	public void setUser(String username) {
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(username);
	}
	public void setPassword(String password) {
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);	
	}
	public void clicLogin() {
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}
	public void clicCreateAccount() {
		driver.findElement(By.linkText("Create Account")).click();
		/*driver.findElement(By.xpath("//[*@id='ctl01']/div[3]/div[2]/div/div[2]/a")).click();*/
	}
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
}
