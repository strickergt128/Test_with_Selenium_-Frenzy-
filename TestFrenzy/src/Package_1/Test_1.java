package Package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException {
		//Varables Datos Usuario
		
		String Nombre = "Dilan";
		String Correo = "dilancastro7@hotmail.com";
		String Contraseña = "PlayStation4";
		String Fecha = "04/08/2000";
		
		//Variables Localización Botones y Campos
		
		String btnCorreoElec = "//DIV[@class='email flexVerticalCenter justifyContentCenter']";
		String btnRegistrate = "//DIV[@class='signUp flexVerticalCenter justifyContentCenter']";
		String InpNombre = "(//INPUT[@type='text'])[1]";
		String InpCorreoElec = "//INPUT[@type='email']";
		String InpContraseña = "//INPUT[@type='password']";
		String InpGenero = "(//DIV[@class='genre flexVerticalCenter justifyContentCenter'])[1]";
		String InpFecha = "//INPUT[@type='date']";
		String btnCrear = "//DIV[@class='accessOrCreate flexVerticalCenter justifyContentCenter']";
		String btnOK = "//BUTTON[@type='button'][text()='OK']";
		String btnLoginCorreo = "//DIV[@class='signUp flexVerticalCenter justifyContentCenter']";
		String btnEntar = "//DIV[@class='accessOrCreate flexVerticalCenter justifyContentCenter']";
		
		//Links Navbar
		
		String Frenzy = "https://testing-frenzy-web.netlify.com/#/menu/home";
		String QueEsFrenzy = "https://testing-frenzy-web.netlify.com/#/menu/what_is_frenzy";
		String Favoritos = "https://testing-frenzy-web.netlify.com/#/menu/favorites";
		String Bits = "https://testing-frenzy-web.netlify.com/#/menu/points";
		String Premios = "https://testing-frenzy-web.netlify.com/#/menu/awards";
		String Supermercado = "https://testing-frenzy-web.netlify.com/#/menu/customer/Supermercado";
		
		//Links 
		
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilan\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		//Abrir el navegador
		WebDriver driver = new ChromeDriver();
		//Ir a la ruta
		driver.get(Frenzy);
		//Esperar que el boton sea clickleable
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnCorreoElec)));
		//Click en Correo Electronico
		driver.findElement(By.xpath(btnCorreoElec)).click();
		//Click en Registrate
		driver.findElement(By.xpath(btnRegistrate)).click();
		//Llenar campo nombre
		driver.findElement(By.xpath(InpNombre)).sendKeys(Nombre);
		//Llenar Campo Correo Electronico
		driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo);
		//Llenar Campo Contraseña
		driver.findElement(By.xpath(InpContraseña)).sendKeys(Contraseña);
		//Click Genero
		driver.findElement(By.xpath(InpGenero)).click();
		//Llenar Campo Fecha
		driver.findElement(By.xpath(InpFecha)).sendKeys(Fecha);
		//Click en Crear
		driver.findElement(By.xpath(btnCrear)).click();
		//Esperar 1 segundo
		Thread.sleep(2000);
		//boton OK
		WebElement  btn = driver.findElement(By.xpath(btnOK));
		// Condicional Cuenta Ya Existente
		if(btn.isEnabled()) {
			driver.findElement(By.xpath(btnOK)).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(btnLoginCorreo)).click();
			
		}
		//LLenar Campos de Login
		driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo);
		driver.findElement(By.xpath(InpContraseña)).sendKeys(Contraseña);
		driver.findElement(By.xpath(btnEntar)).click();
		
		
		//botones navbar
		Thread.sleep(5000);
		driver.navigate().to(QueEsFrenzy);
		Thread.sleep(1000);
		driver.navigate().to(Favoritos);
		Thread.sleep(1000);
		driver.navigate().to(Bits);
		Thread.sleep(1000);
		driver.navigate().to(Premios);
		Thread.sleep(1000);
		driver.navigate().to(Frenzy);
		
		//Categorias
		Thread.sleep(5000);
		driver.navigate().to(Supermercado);
		
	}

}
