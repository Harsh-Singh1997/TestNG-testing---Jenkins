package TestNG_BeforeAndAfterSuiteTestAnnotationsTesting;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteTest3 {
	
	@BeforeSuite
	void OpenLink() {
		
		System.out.println("This is Before Suite Annotation.............");
	}
	
	@Test
	void LinkValidation() {
		
		System.out.println("This is test 3...............");
	}
	
	@AfterSuite
	void CloseBrowser() {
		
		System.out.println("This is After Suite Annotation.............");
	}

}
