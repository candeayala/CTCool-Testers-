package Test1;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;// Setear la ruta de nuestro chromedriver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //inicializando nuestro chrome driver
		driver.get("https://www.google.com");
  }
}
