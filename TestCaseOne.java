package gen.SchedulePage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import BasePOM.LoginAndURLPOM;

public class YourFirstTestCaseScript {
	
	public WebDriver driver;
  @Test
  public void testYourFirstTestCaseScript() {
	 
    [HERE YOU CALL LOGIN PAGE OBJECT MODEL]	 
	// Login 
	LoginAndURLPOM LoginPage = new LoginAndURLPOM(driver);      
	LoginPage.login();   
											  											  
	/
	..
	..
	[YOUR ACTUALL TEST COMES HERE]
	..
	..
	/
		  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
