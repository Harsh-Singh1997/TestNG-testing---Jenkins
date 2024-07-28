package TestNG_DataProviderAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationTesting {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider = "tr")
	void logintest(String Username,String Password) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status = true) {
			
			driver.findElement(By.xpath("//a[@class='list-group-item' and contains(text(),'Logout')]")).click();
			Assert.assertTrue(true);
		}			
		else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
	
	@DataProvider(name="tr")
	Object[][] logindata() {

		Object data[][] = {
				{"JohnFK@test.com","John!123"},
				{"AmandaW@demo.com","AM@W123"},
				{"janedoe@123.com","Jane@doe321"},
				{"testdemo@demo.com","Harsh@123"},
				{"RomanR@gmail.com","RR@Reign3"},
		};
		
		return data;
		
}
}
