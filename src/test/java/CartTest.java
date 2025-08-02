import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest extends BaseTest {

	
	@Test
	
	public void  CartTest() throws InterruptedException {
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demowebshop.tricentis.com/login");*/
		
		CartPage cp = new CartPage(driver);
		cp.addcart("fiction");
		Thread.sleep(5500);
		
	}
}
