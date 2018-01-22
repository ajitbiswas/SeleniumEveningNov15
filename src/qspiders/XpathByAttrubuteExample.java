package qspiders;

import org.openqa.selenium.By;

public class XpathByAttrubuteExample extends BaseClass{

	public static void main(String[] args) {
		
		driver.get("http://localhost:8080/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
	}
}
