package com.k7es.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.k7es.po.LoginPage;


@Listeners({com.k7es.test.manager.TestListener.class})
public class TestBed extends TestManager{
	
	
	String testurl = "http://127.0.0.1:7070/k7biz/static/index.htm";
	private LoginPage poLoginpage;
	
	
	@Test
	public void userNameAssertion()
	{
		driver.get(testurl);
		poLoginpage = PageFactory.initElements(driver, LoginPage.class);
		Assert.assertTrue(poLoginpage.getUserName().toLowerCase().equals("administrator"),
				"Expected : administraotr, Actual"+poLoginpage.getUserName());	
	}

}
