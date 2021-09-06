package TestPaso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestP_vacio {
	private WebDriver driver;
	
	  @BeforeClass
		  public void abrir_chrome() {
			    System.out.println("Se abre el navegador google chrome");
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://localhost:8070/login/index.jsp");
		  }
	  @Test
	  public void login() {
			System.out.println("No se ingresa nombre ni contrase�a en la pagina de login");
			driver.findElement(By.id("username")).sendKeys("");
			driver.findElement(By.id("password")).sendKeys("");
	  }
	  

	  @AfterClass
	  public void salir() {
		  System.out.println("Se inicia sesion con los datos ingresados");
			driver.findElement(By.id("loginBtn")).click();
			driver.quit();
	  }
}