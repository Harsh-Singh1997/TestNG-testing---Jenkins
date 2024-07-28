package TestNG_AssertionsTesting;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 Assertions can be used to pass or fail the test method as per the test condition.
 */

public class AssertionsTest {

	@Test
	void Assertionstest() {
		
		String exp_text = "GoogleXP";
		String act_text = "Google";
		
		/*
		//Assertion using if-else condition		
		if(exp_text.equals(act_text)) {
			
			System.out.println("TEST: PASS");
			Assert.assertTrue(true);
		} else {
			
			System.out.println("TEST: FAIL");
			Assert.assertTrue(false);
			
		}
		*/
		
		/*
		//Assertion using assertequals method
		Assert.assertEquals("LinkedIn", "LinkedIn");
		System.out.println("TEST 1 Executed..........");
		Assert.assertEquals("Googlemail", "GoogleMail");
		System.out.println("TEST 2 Executed..........");
	    */
		
		//Assertions using assertnotequals method
		Assert.assertNotEquals("LinkedIn", "LinkedIN");
		System.out.println("TEST 1 Executed..........");
		Assert.assertNotEquals("Googlemail", "GoogleMail");
		System.out.println("TEST 2 Executed..........");
		Assert.assertNotEquals("GoogleMaps", "GoogleMaps");
		System.out.println("TEST 3 Executed..........");
		
	}
	
}
