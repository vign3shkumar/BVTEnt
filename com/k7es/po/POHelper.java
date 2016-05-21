package com.k7es.po;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class POHelper {
	WebDriver helperDriver;
	
	public POHelper(WebDriver driver){
		helperDriver = driver;
	}
	
	
	public String getTextElement(WebElement element, int time) throws TimeoutException{
		try{
			if (waitByElement(element ,time)){
				return element.getText();
			}
		}
		catch(TimeoutException e){
			throw new TimeoutException(e);
		}
		return null;
	}
	
	public String getTextInputBox(WebElement element, int time) throws TimeoutException{
		try{
			if (waitByElement(element ,time)){
				return element.getAttribute("value");
			}
		}
		catch(TimeoutException e){
			Reporter.log("Timed out Exception occurred while identifing element, "+element.toString());
			throw new TimeoutException(e);
		}
		return null;
	}
	
	private boolean waitByElement(WebElement element, int time) throws TimeoutException{
		try{
			WebDriverWait wait = new WebDriverWait(helperDriver,time);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}
		catch(TimeoutException e){
			throw new TimeoutException(e);
		}	
	}

}
