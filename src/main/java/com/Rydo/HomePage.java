/**
 * This page is tp click on Login button on HomePage
 */

package com.Rydo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
 
	protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (css ="li.btn.secondary-dark.small.menu-item.menu-item-type-custom.menu-item-object-custom.menu-item-55 > a" )
	WebElement login;
	public void clickOnLoginButton() {
		login.click();
	}
	
	

}
