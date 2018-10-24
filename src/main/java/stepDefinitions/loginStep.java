package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.loginPage;

public class loginStep {
	
	WebDriver driver; 
	loginPage loginpage;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	driver = new ChromeDriver();
    	loginpage = new loginPage(driver);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("el usuario esta en la pagina de login")
    public void usuarioEstaEnLogin (){
    	driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");

    }
    
    @When("^el usuario ingresa credenciales validas \"(.*)\"$")
    public void el_usuario_ingresa_credencialesvalidas(String email){
    	loginpage.setUser(email);
    	
    }
    
    @And("^y el password \"(.*)\"$")
    public void ingresaPasswordValido(String password) {
    	loginpage.setPassword(password);
    }
 
    
    @Then("^el usuario puede ver su panel de administracion \"(.*)\"$")
    public void usuarioIngresaAlPanelDeAdministracion (String message) {
    	loginpage.clicLogin();	
    	}
    
    @When("^el usuario ingresa email erroneo \"(.*)\"$")
    public void usuarioIngresaCredencialesErroneas (String email) {
    	loginpage.setUser(email);
    }
    @And("^y el password incorrecto \"(.*)\"$")
    public void usuarioIngresaPasswordIncorrecto (String password) {
    	loginpage.setPassword(password);
    }
    
    @Then("^el usuario no puede ver su panel de administracion \"(.*)\"$")
    public void usuarioNoDeberiaTenerAcceso (String message) {
    	String texto = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		assertTrue(texto.contains(message));
		
		loginpage.clicLogin();
		
  
    }
}
