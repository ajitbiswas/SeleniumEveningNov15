package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA extends BaseTestNgClass{
	@Test
	public void testA(){
		
		Reporter.log("A", true);
		
	}

}
