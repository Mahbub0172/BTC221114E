package Com.bit.Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v107.dom.model.ShadowRootPopped;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SelenioumHelper.Shared;

public class HomePage {
WebDriver dr;
@FindBy(xpath="xpath of main manu") WebElement manmanubar;
@FindBy(xpath="xpath of shirt sub manu") WebElement allshirtsubmanu;

public HomePage(WebDriver x) {
	dr= x;
	PageFactory.initElements(dr, this);
}
	public void hoveroveronmanmanue() {
	
		Shared.hoverover(manmanubar);

	}
	public ShirtPage clickallshirtsubmanu() {
		Shared.clickonElement(allshirtsubmanu);
		return new ShirtPage(dr);
	
		
	}
	
	
}
