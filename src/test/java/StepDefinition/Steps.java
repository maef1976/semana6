package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome(){
		System.out.println("Paso 1: Se abre el navegador google chrome");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8070/login/index.jsp");
	}
	
	@When("ingresar Username {string} y Password {string}")
	public void ingresar_Username_y_Password(String string, String string2) throws InterruptedException{
		System.out.println("Paso 2: Se ingresa las credenciales de usuario");
		driver.findElement(By.id("username")).sendKeys(string);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(string2);
		Thread.sleep(1000);
	}
	
	@Then("inicia sesion")
	public void inicia_sesion() throws InterruptedException{
		System.out.println("Paso 3: Se inicia sesion con los datos ingresados del archivo Mytest.feature");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("salir")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
