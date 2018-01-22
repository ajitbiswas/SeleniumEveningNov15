package qspiders;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class JavascriptExample extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		driver.findElement(By.id("close")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String xp = "//img[contains(@src,'applitools')]";
		WebElement appliTools = driver.findElement(By.xpath(xp));
		int x = appliTools.getLocation().getX();
		int y = appliTools.getLocation().getY();
		System.out.println(x + " and "+y);
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
}
