import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndTest extends BaseTest {

	public static void main(String[] args) {
	
		ChromeDriver driver = getDriver(); 
	
		HomePage hp = new HomePage(driver);
		hp.verifyHomepageLogo();
	    hp.HoverOveronMenManu();
	    
	
	
	}
}
