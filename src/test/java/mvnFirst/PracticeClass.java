package mvnFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.xmlbeans.impl.store.Public2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.*;

public class PracticeClass {

	public static void main(String[] args) {
		/*WebDriver driver = new ChromeDriver();
		driver.get("www.facebook.com");
		WebElement dropdownElement = driver.findElement(By.xpath(null));
		Select selectDropdownOptions = new Select(dropdownElement);
		List<WebElement> allDropdownelements = new ArrayList<>();
		allDropdownelements = selectDropdownOptions.getOptions();
		List<String> allDropdownOptions = new ArrayList<>();
		for(WebElement element: allDropdownelements) {
			allDropdownOptions.add(element.getText());
		}*/
	}
		@DataProvider(name="loginData")
		public Object[][] getData(){
			Object[][] testData = new Object[2][2];
			testData[1][1]="TestData4";
			return testData;
		}
		@Test(dataProvider = "getData")
		public void login(String UserName1,String UserName2) {
			
		}
}
