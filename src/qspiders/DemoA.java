package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoA extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://localhost:8080/login.do");
		
		LoginPage l = new LoginPage(driver);
		l.setUsername("hi");
		l.setPassword("bye");
		l.clickLogin();
		
		l.setUsername("admin");
		l.setPassword("manager");
		l.clickLogin();
		
		
				

	}

}
