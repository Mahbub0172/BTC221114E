package Com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Helper;

public class Basetest {
	Properties prop;
	WebDriver driver ;
	@Before
	
	public void openBrowser() throws IOException {
	prop=Helper.readPropfile("/Users/mahbuburrahman/eclipse-workspace/Maven_Project");
  String b =  prop.getProperty("Browser");
  
  if (b.equals("Chrom")) {
	driver = new ChromeDriver();
	  System.out.println("Open Chrom browser");
  }
	
  
  else  if (b.equals("Firefox")) {
		 
		  driver = new FirefoxDriver();
		  
		  System.out.println("Open Firefox browser");
	  
	  
	  }
	
	}
}