package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginToActitime extends BaseClass{

	public static void main(String[] args) {
		
		driver.get("http://localhost:8080/login.do");
		
		WebElement unObj = driver.findElement(By.id("username"));
		unObj.sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		
		

	}

}
