package TestNG_ParallelTestingUsingXML;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestingUsingXML {

	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	void setup(String br) {
		
		switch(br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver();break;
		case "edge": driver = new EdgeDriver();break;
		case "firefox": driver = new FirefoxDriver();break;
		default: System.out.println("Invalid browser");return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	void logintest() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("testdemo@demo.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Harsh@123");
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
}
