import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class YahooTest {
	
	@BeforeTest
	public void testconfig(){
		System.out.println("test execution started @Yahoo Before Test");
	}
	@Test  ///testApp is test case
	public void testApp() {
		
		System.out.println("testing application @ Yahoo Test");
		
	}

}
