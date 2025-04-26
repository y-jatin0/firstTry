package mvnFirst;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Amazon_Tittle_verification  {
	
	WebDriver driver;
	
	@BeforeTest
	  public void driverInitialization() {
		  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Set the path if required
	      driver = new ChromeDriver();
	      driver.manage().window().fullscreen();
	  }
  @Test
  public void titleVerification() throws InterruptedException {
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(5000);
	  String title = driver.getTitle();
	  assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
	  driver.findElement(By.id("nav-cart")).click();
	  Thread.sleep(5000);
	  
  }
  

}
