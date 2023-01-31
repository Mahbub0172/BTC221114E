import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	ChromeDriver driver;
	
	public HomePage(ChromeDriver x ) {
		
		driver = x;
	
	}

	public void verifyHomepageLogo() {
   boolean result =	 Helper.VerifyElement(driver.findElement(By.xpath("XpathofLogo")));
	}
   public void HoverOveronMenManu() {
	Helper.hoverOveronElement(driver, driver.findElement(By.xpath("xpathofMenManu")));

   }
  public void clickOnNewArrival() { 
  Helper.click(driver.findElement(By.xpath("xpathOfNewArrival")));


  }
}