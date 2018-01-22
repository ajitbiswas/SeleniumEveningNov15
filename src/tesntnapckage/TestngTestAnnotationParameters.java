package tesntnapckage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngTestAnnotationParameters {
	@Test(priority=1)
	public void createuser(){
		Reporter.log("Create user...", true);
	}
	
	@Test(priority=2, invocationCount=0, enabled=true)
	public void edituser(){
		Reporter.log("Edituser...", true);
	}
	
	
	@Test(priority=3)
	public void deleteuser(){
		Reporter.log("deleteuser...", true);
	}

}
