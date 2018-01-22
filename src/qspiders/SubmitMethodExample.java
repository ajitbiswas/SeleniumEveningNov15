package qspiders;

import org.openqa.selenium.By;

public class SubmitMethodExample extends BaseClass{

	public static void main(String[] args) {
		
		driver.get("https://demo.vtiger.com/index.php");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();

	}

}
