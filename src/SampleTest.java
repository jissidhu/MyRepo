import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SampleTest {
	
	@BeforeTest
	public void testconfig(){
		System.out.println("test execution started @Before Test");
	}
	@Test  ///testApp is test case
	public void testApp() {
		
		System.out.println("testing application @Test");
		
	}

}
