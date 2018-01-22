package testngpackage;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestngGroupDemo{
	@Test(groups={"user","smoke"})
	public void createUser(){                                                
		Reporter.log("createUser", true);
	}
	@Test(groups={"user","regression"})
	public void editUser(){
		Reporter.log("editUser", true);
	}
	@Test(groups={"user","regression"})
	public void deleteUser(){
		Reporter.log("deleteUser", true);
	}
	@Test(groups={"product","smoke"})
	public void createProduct(){
		Reporter.log("createProduct", true);
	}
	@Test(groups={"product","regression"})
	public void editProduct(){
		Reporter.log("editProduct", true);
	}
	@Test(groups={"product","regression"})
	public void deleteProduct(){
		Reporter.log("deleteProduct", true);
	}
	
	

}
