package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop extends BaseClass {

	public static void main(String[] args) {

driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

		WebElement srcBlock1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement destBlock3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));

		Actions action = new Actions(driver);
		action.dragAndDrop(srcBlock1, destBlock3).build().perform();




	}

}
