package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPage {
	WebDriver driver;

	public void setNombre(String nombre) {
		driver.findElement(By.id("MainContent_txtFirstName")).sendKeys(nombre);
		
	}
	public void setPassword (String password) {
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
	}
	
	public void setPhone (String phone) {
		driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys(phone);
	}
	dsaasdk
}
