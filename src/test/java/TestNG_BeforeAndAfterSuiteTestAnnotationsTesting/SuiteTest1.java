package TestNG_BeforeAndAfterSuiteTestAnnotationsTesting;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuiteTest1 {

	@BeforeTest
	void Login() {
		
		System.out.println("This is Before Test method..........");
	}
	
	@Test
	void Test1() {
		
		System.out.println("This is test 1........");
	}
}
