package TestNG_AssertionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Soft Assertions: Soft Assertion is a type of assertion where if a assertion fails, the test will fail but still all test steps will run after assertion.
*/

import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

	@Test
	void softassertion() {
	
	SoftAssert sa = new SoftAssert(); // declaration of soft assertion
	
	//Soft Assertion
	sa.assertEquals("LinkedIn", "LinkedIn"); // need to call assert method using soft assertion object
	System.out.println("TEST 1 Executed..........");
	sa.assertEquals("Googlemail", "Googlemail");
	System.out.println("TEST 2 Executed..........");
	sa.assertEquals("Android", "Apple");
	System.out.println("TEST 3 Executed.........."); //This test will still execute even if above assertion fail
	System.out.println("TEST 4 Executed.........."); //This test will still execute even if above assertion fail
	
	sa.assertAll(); // need to use assertAll() method in soft assertion
	}
}
