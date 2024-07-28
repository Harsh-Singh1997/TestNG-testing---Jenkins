package TestNG_DependsOnmethodsAnnotationTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 Using dependsOnMethod annotation we can make dependency of one test on another method. 
 It means if One method got fails then if will skip all the methods depend on that test. 
 */

public class DependsOnMethodAnnotationTest {
	
	@Test(priority=1)
	void openApp() {
		
		System.out.println("Test 1: App Open");
		Assert.assertTrue(true); //Test will pass
	}
	
	@Test(priority=2, dependsOnMethods = {"openApp"}) // This test depends on above test 
	void loginInApp() {
		
		System.out.println("Test 2: Login in App");
		Assert.assertTrue(true); //Test will pass if above test pass
	}
	
	@Test(priority=3, dependsOnMethods = {"loginInApp"}) // This test depends on above test 
	void searchInApp() {
		
		System.out.println("Test 3: Search testing in App");
		Assert.assertTrue(false); //Test will fail
	}
	
	@Test(priority=4, dependsOnMethods = {"searchInApp"}) // This test depends on above test 
	void advancedSearchInApp() {
		
		System.out.println("Test 4: Advanced search testing in App");
		Assert.assertTrue(true); //Test will be skipped as above method failed
	}
	
	@Test(priority=5, dependsOnMethods = {"advancedSearchInApp"}) // This test depends on above test 
	void LogoutFromApp() {
		
		System.out.println("Test 5: Logout from App");
		Assert.assertTrue(true); //Test will be skipped as above method failed
	}

}
