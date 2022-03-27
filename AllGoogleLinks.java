package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

//This is to make changes

public class AllGoogleLinks {
	WebDriver driver;
  @Test
  public void printAllGoogleLinkswithTheirHref() {
	  driver.get("http://www.google.com");
	  List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
	  
	  for(WebElement element: allGoogleLinks) {
		  System.out.println(element.getText()+" - "+element.getAttribute("href"));
		  
	  }
	 
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
