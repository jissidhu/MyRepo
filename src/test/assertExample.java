package test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class assertExample {
	
	@Test 
	public void testYahooAssertApp() {
		System.out.println("Yahoo testing application @Test");
		//Assert.assertEquals("Good", "Good1");
		//Assert.assertTrue(6<11, "Error Massage");
		try {
			Assert.assertFalse(1<32, "Pass");
		} catch (Throwable t) {
			System.out.println("The error has come");
		}
		Assert.assertTrue(6<11, "Error Massage");
		System.out.println("Hello");
		
	}

}
