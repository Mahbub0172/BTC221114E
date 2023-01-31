package com.bitt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreStep {

	public void typeuserid(ChromeDriver driver) {
	Shared.type(driver.findElement(Object.emailTextbox), TestData.Userid);
	}
	public void password(ChromeDriver driver) {
	Shared.type(driver.findElement(Object.passwordtextbox), TestData.password );
	}
	
	public void Fristname(ChromeDriver driver) {
	Shared.type(driver.findElement(By.id("Frist Name")), "kasif");
	
	}
	public void ClickOnLoginButton(ChromeDriver driver ) {
		Shared.click(driver.findElement(Object.Loginbutton));
		
	}
	}
