package test;

import org.testng.Assert;
//import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class YahooTest {
	
	@BeforeTest
	public void testSkipExecution(){
		System.out.println("Jenkins...Yahoo test execution started @Test");
		//throw new SkipException("Skipping the test case");
	}
	@Test  ///testApp is test case
	public void testYahooApp() {
		System.out.println("Jenkins...Yahoo testing application @Test");
		Assert.assertEquals("Good", "Good");
	}

}
