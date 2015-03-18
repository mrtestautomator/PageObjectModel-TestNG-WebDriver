package BasePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAndURLPOM {
	 
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement submit;
	
	 public LoginAndURLPOM(WebDriver driver){
	 
		 this.driver = driver;
	     driver.get("http://www.yourwebsite.com");
	     username = driver.findElement(By.name("username"));
	     password = driver.findElement(By.name("password"));
	     submit = driver.findElement(By.tagName("button"));
	 }
	 
	 public void login(){
		 
		 username.sendKeys("yourpassword123");
		 password.sendKeys("yourpassword123");
		 submit.click();
	 }
	}