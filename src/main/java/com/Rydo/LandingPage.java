/**
 * This is Landing Page 
 */

package com.Rydo;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class LandingPage {
	 
		WebDriver driver;
		
		@FindBy (css ="" )
		WebElement email;
		
		@FindBy (css ="" )
		WebElement password;
	    
		@FindBy (css ="" )
		WebElement nextButton;
		
		@FindBy (css ="" )
		WebElement LoginButton;
		
		public LandingPage(WebDriver driver) {
			this.driver = driver;
		}
}
