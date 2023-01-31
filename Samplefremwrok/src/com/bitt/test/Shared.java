package com.bitt.test;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Shared {

	public static void type(WebElement element, String text ) {
		element.sendKeys(text);
	}
		
		public static void click(WebElement element) {
		element.click();
		
	}
	
	public static void click(List< WebElement > element,int index) {
element.get(index).click();



	}
}