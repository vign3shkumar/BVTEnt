package com.k7es.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestManager {
	WebDriver driver;
	
	public WebDriver getdriver(){
		return this.driver;
	}
	
	
	@BeforeTest
	public void LaunchTest(){
		WebDriver driver = new FirefoxDriver();
		this.driver = driver;
		
	}
	
	@AfterTest
	public void CloseTest(){
		driver.close();
		driver.quit();
	}

}
