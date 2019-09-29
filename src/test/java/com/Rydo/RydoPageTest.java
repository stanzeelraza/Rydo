package com.Rydo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Rydo.HomePage;

public class RydoPageTest {
   WebDriver driver;
   HomePage homePage;
   LoginPage loginPage;
   
   
   @BeforeTest
   public void setup() throws InterruptedException {
	   ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");
		//options.addArguments("headless");
		options.setBinary("C:\\Users\\raza_\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raza_\\Downloads\\Jar files\\chromedriver.exe");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.rydoo.com");
		homePage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(5000);
	   
	   
   	}
   /**
    * To test The exit funcationality
    */
   @AfterTest
   public void tearDown() {
	   //driver.close();
   }
   
   @Test (priority = 1)
   public void clickOnLogin() {
	   homePage.clickOnLoginButton();
   }
   
   @Test (priority = 2)
   public void doLogin() throws InterruptedException {
	   loginPage = PageFactory.initElements(driver, LoginPage.class);
	   loginPage.doLoginButton("tanzeel.raza@gmail.com", "Raza@007");
   }
   
   @Test (priority = 3)
   public void clickOnManualExpense() {
	   
   }
}
