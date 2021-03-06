package com.k7es.po;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage {
	
	WebDriver loginDriver;
	POHelper helper;
	
	
	@CacheLookup
	@FindBy(name="unames")
	WebElement inpTxtLoginUserName;
	
	@CacheLookup
	@FindBy(name="upwd")
	WebElement inpTxtLoginPassword;
	
	@CacheLookup
	@FindBy(css="input[value='Login']")
	WebElement btnSubmit;
	
	@CacheLookup
	@FindBy(id="fg_pwd")
	WebElement lnkForgotPassword;
	
	@CacheLookup
	@FindBy(name="win_un")
	WebElement inpTxtWindowsUserName;
	
	@CacheLookup
	@FindBy(name="win_pwd")
	WebElement inpTxtWindowsLoginPassword;
	
	//text box to enter new password for K7ES
	@CacheLookup
	@FindBy(name="new_pwd")
	WebElement inpTxtSetK7ESPassword;
	
	//Button to reset K7ES web console password
	@CacheLookup
	@FindBy (id="popup_ok")
	WebElement btnResetPassword;	
	
	public LoginPage(WebDriver driver){
		loginDriver = driver;
		POHelper helper = new POHelper(driver);
		this.helper = helper;
	}
	
	public String getUserName(){
		try{
			return helper.getTextInputBox(inpTxtLoginUserName, 4);
		}
		catch(TimeoutException e){
			return null;
		}
		
	}

}
