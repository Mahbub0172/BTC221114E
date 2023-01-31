import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static ChromeDriver driver = null;

	public static ChromeDriver getDriver() {
		driver =new ChromeDriver();
		driver.get("httt://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
	public void CloseBroweser() {
	driver.quit();

	}
	
}
	

