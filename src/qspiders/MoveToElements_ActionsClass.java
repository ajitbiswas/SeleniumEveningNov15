package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements_ActionsClass extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
	driver.get("http://istqb.in/");
	WebElement foundation = driver.findElement(By.xpath("//span[text()='FOUNDATION']"));
	Actions action = new Actions(driver);
	action.moveToElement(foundation).perform();
	Thread.sleep(2000);
	
	WebElement ENROLLMENT = driver.findElement(By.xpath("//span[text()='ENROLLMENT']"));
	
	action.moveToElement(ENROLLMENT).perform();
	Thread.sleep(2000);
	
	WebElement CORENROLLMENT = driver.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));
	
	action.moveToElement(CORENROLLMENT).perform();
	Thread.sleep(2000);
	
WebElement OnlineENROLLMENT = driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']"));
	
	action.moveToElement(OnlineENROLLMENT).click().perform();
	
		

	}

}
