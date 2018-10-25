package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistroPage {
	WebDriver driver;

	public void setNombre(String nombre) {
		driver.findElement(By.id("MainContent_txtFirstName")).sendKeys(nombre);
		
	}
	
	public void setPhone (String phone) {
		driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys(phone);
	}
	
	public void	setGender() {
		driver.findElement(By.id("MainContent_Male")).click();
	}
	public void setPassword (String password) {
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
	}
	
	public void verifyPassword (String password) {
	driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys(password);
	}
	
	public void setCountry (String country) {
		Select dropdown = new Select(driver.findElement(By.id("MainContent_menuCountry")));
    	dropdown.selectByValue(country);
	}
	
	public void submit() {
    	
    	driver.findElement(By.id("MainContent_btnSubmit")).click();
	}
	
}
