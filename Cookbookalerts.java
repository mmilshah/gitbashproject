package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;

public class Cookbookalerts {
	WebDriver driver;
	
  @Test
  public void handleAlerts() {
	  driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("simple")).click();
	  //String firstText= driver.switchTo().alert().getText();
	  //System.out.println(firstText);
	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.id("confirm")).click();
	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.id("prompt")).click();
	  driver.switchTo().alert().accept();

	  
	  
	  
	  
	 // Alert myAlert;
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am inside test case beforeMethod");
	  
		 // String browser;
		  System.setProperty("webdriver.chrome.driver", "test/resources/chromedriver");
		  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  

}
