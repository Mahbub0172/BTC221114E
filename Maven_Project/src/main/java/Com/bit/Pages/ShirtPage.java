package Com.bit.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SelenioumHelper.Shared;

public class ShirtPage {
	WebDriver dr;
	@FindBy(xpath="xpath of frist shirt ") WebElement firstshirt;
	public ShirtPage (WebDriver x) {
		dr= x;
		PageFactory.initElements(dr, this);
	}
	public ProductDetailspage Cliconfristshirt() {
		Shared.clickonElement(null);
		
		return new ProductDetailspage();
		
	}
	
	
}
