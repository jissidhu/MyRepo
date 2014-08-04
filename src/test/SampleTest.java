package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SampleTest {
	
	@BeforeSuite
	public void initializeSelenium(){
		System.out.println("In the very beggining-initializeSelenium-BeforeSuite");
	}
	
	@AfterSuite
	public void shutDownSelenium(){
		System.out.println("In the very end-shutDownSelenium-@AfterSuite");
	}
	
	@BeforeTest
	public void openDBConnection(){
		System.out.println("Connected to DB---- @BeforeTest");
	}
	
	@AfterTest
	public void closeDBConnection(){
		System.out.println("Closing DB Connections ----- @AfterTest");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("Opening Browser@BeforeMethod");
	}
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Closing Browser@AfterMethod");
	}
	
	@Test  ///testApp is test case
	public void testSampleAppLogin() {
		System.out.println("Sample testing application-Login Successful @Test");
	}
	@Test  ///testApp is test case
	public void testSampleAppLogout() {
		System.out.println("Sample testing application- Logout Sucessful @Test");
	}
}
