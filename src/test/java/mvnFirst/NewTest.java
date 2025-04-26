package mvnFirst;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void login() {
	 driver.findElement(By.id("email")).sendKeys("newEmail.com");
	 driver.findElement(By.id("password")).sendKeys("PAssWord");
	 driver.findElement(By.id("Submit")).click();
	  
	  
  }
  @SuppressWarnings("deprecation")
@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
