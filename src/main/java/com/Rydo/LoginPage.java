package com.Rydo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
 
	WebDriver driver;
	
	@FindBy (css ="#username" )
	WebElement email;
	
	@FindBy (css ="#password" )
	WebElement password;
    
	@FindBy (css ="#nextButton" )
	WebElement nextButton;
	
	@FindBy (css ="#loginButton" )
	WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Login with Delay
	 * @param id
	 * @param pass
	 * @throws InterruptedException
	 */
	
	public void doLoginButton(String id, String pass) throws InterruptedException {
		email.sendKeys(id);
		Thread.sleep(2000);
		nextButton.click();
		Thread.sleep(2000);
		password.sendKeys(pass);
		Thread.sleep(3000);
		LoginButton.click();
		
	}

}
