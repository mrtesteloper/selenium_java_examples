import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjemploPruebaSelenium {
		
	public static void main(String args[]) throws InterruptedException {
		// Agrega la ubicación del driver
		System.setProperty("webdriver.chrome.driver", "../chromedriver/chromedriver.exe");
		
		// Crea nueva instancia del driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		// Encuentra el elemento usando su nombre
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		
		// Pausa para ver el explorador
		Thread.sleep(5000);
		
		// Cerrar explorador
		driver.close();				
	}
}
