import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test

	public void logintest() {
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * 
		 * driver.get("https://demowebshop.tricentis.com/login");
		 */

		LoginPage lp = new LoginPage(driver);
		lp.Login();
		// Assert.assertTrue(product.contains(search), "Product does not contain the
		// search keyword");
		
		//test1

	}

}
