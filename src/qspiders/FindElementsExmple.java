package qspiders;
import java.util.List;                               
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FindElementsExmple extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
		Thread.sleep(4000);
		String xp = "//*[contains(text(),'selenium')]";
		List<WebElement> allElements = driver.findElements(By.xpath(xp));
		System.out.println(allElements.size());
		for (WebElement element : allElements) {
			String text = element.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("selenium interview questions")) {
				element.click();
				break;
			}
		}
		driver.close();
	}
}
