

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeSuite
    public void setup() {
        if (driver == null) {
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    		driver.get("https://demowebshop.tricentis.com/login");

        }
    }

    @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
