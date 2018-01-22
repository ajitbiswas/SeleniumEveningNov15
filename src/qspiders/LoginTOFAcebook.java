package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTOFAcebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	
		driver.findElement(By.id("email")).sendKeys("rahulkumar07@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Hyderabad!23");
		

	}

}
