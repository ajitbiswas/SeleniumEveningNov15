package qspiders;

import org.openqa.selenium.By;

public class CssSelectorExample extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("http://localhost:8080/login.do");
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("#loginButton")).click();

	}

}
