package qspiders;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA1 {
	
	@Test(priority=1)
	public void createUser(){
		
		Reporter.log("createUser...", true);
	}
	
	@Test(priority=2, invocationCount=0, enabled=true)
	public void editUser(){
		
		Reporter.log("editUser...", true);
	}
	
	@Test(priority=3)
	public void deleteUser(){
		
		Reporter.log("deleteUser...", true);
	}
	
	

}
