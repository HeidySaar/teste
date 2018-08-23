import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste1 {
	private WebDriver driver;
	
	@Test
	public void test() {
		driver = new FirefoxDriver();
		driver.get("www.google.com.br");		
	}
}
