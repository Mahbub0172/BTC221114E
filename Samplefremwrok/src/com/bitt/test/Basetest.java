package com.bitt.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
ChromeDriver driver = null;

public ChromeDriver getDriver() {
	driver =new ChromeDriver();
	driver.get("httt://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	return driver;
}
public void CloseBroweser() {
driver.quit();

}
}