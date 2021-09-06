package TestPaso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestP_incorrecto {
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
			System.out.println("Se ingresa el nombre de usuario correcto y contraseña incorrecta");
			driver.findElement(By.id("username")).sendKeys("mespinoza");
			driver.findElement(By.id("password")).sendKeys("321");
	  }
	  

	  @AfterClass
	  public void salir() {
		  System.out.println("Se inicia sesion");
			driver.findElement(By.id("loginBtn")).click();
			driver.quit();
	  }

	}
