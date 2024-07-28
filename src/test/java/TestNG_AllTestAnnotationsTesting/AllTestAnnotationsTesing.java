package TestNG_AllTestAnnotationsTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllTestAnnotationsTesing {

	@BeforeSuite
	void OpenLink() {
		
		System.out.println("Before Suite Annotation.............");
	}
	
	
	@AfterSuite
	void CloseBrowser() {
		
		System.out.println("After Suite Annotation.............");
	}

	@BeforeTest
	void Login() {
		
		System.out.println("Before Test Annotation..........");
	}
	
	@Test(priority=1)
	void Test1() {
		
		System.out.println("This is test 1........");
	}

	@Test(priority=2)
	void Test2() {
		
		System.out.println("This is test 2........");
	}
	
	@AfterTest
	void Logout() {
		
		System.out.println("After Test Annotation..........");
	}
	
	@BeforeClass
	void LoginInApp() {
		
		System.out.println("Before Class Annotation.......");
	}
	
	@Test(priority=3)
	void SearchInApp() {
		
		System.out.println("This is test 3........");
	}
	
	@Test(priority=4)
	void OpenLinkInApp() {
		
		System.out.println("This is test 4........");
	}
	
	@AfterClass
	void LogoutFromApp() {
		
		System.out.println("After Class Annotation........");
	}
	
	@BeforeMethod
	void LoginInApp2() {
		
		System.out.println("Before Method Annotation.........");
	}
	
	@Test(priority=5)
	void SearchInApp2() {
		
		System.out.println("This is test 5........");
	}
	
	@Test(priority=6)
	void OpenLinkInApp2() {
		
		System.out.println("This is test 6........");
	}
	
	@AfterMethod
	void LogoutFromApp2() {
		
		System.out.println("After Method Annotaion...........");
	}

	
}
