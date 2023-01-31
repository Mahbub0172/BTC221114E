import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManNewArrivalPage {
ChromeDriver driver;
	
	public ManNewArrivalPage(ChromeDriver x ) {
		
		driver = x;
	}
	public void clickonFirstProduct() {
	Helper.click(driver.findElement(By.xpath("xpathofFirstProduct")));
		
		
}
}