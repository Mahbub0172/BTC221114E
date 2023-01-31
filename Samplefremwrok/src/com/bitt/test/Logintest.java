package com.bitt.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basetest b = new Basetest();
		ChromeDriver driver = b.getDriver();
	CoreStep s = new CoreStep();
	s.typeuserid(driver);
	s.password(driver);
	s.ClickOnLoginButton(driver);

	}

}
