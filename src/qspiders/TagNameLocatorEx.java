package qspiders;
import org.openqa.selenium.By;
public class TagNameLocatorEx extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/admin/Desktop/Tagname.html");
		//driver.findElement(By.tagName("input")).sendKeys("admin");
		driver.findElement(By.className("unclass")).sendKeys("adsfdagr");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("GoogleLink")).click();
	}
}
