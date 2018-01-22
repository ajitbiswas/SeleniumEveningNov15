package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadPopup extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
	driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	Thread.sleep(3000);
	
	WebElement browseBtn = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		
	browseBtn.sendKeys("C:\\Users\\admin\\Desktop\\Test Yantra Sel batch.txt");
	

	}

}
