import org.testng.annotations.*;

public class SampleProgram {

	@BeforeSuite
	public void BeforSuiteMethod() {
		System.out.println("Sample for BeforeSuite Method");
	}
	
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("Sample for AfterSuite Method");
	}
	
	
}
