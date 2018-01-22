package qspiders;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SelectClass_MultiSelectListBox extends BaseClass{
	public static void main(String[] args) {
		driver.get("file:///D:/Ajit/Selenium/SeleniumBtm_7thSep17/webpages/ListBox_Breakfast.html");
		Select s = new Select(driver.findElement(By.id("mtr")));
		//print the total number of elements in the list box
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		//print all the elements
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
		}
		//Select IDLY by index
		s.selectByIndex(0);
		//Select VADA by value
		s.selectByValue("v");
		//Select Poori by visibleText
		s.selectByVisibleText("Poori");
		
		//Print the count of selected elements 
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		System.out.println(allSelectedOptions.size());
		
		System.out.println("*****Selected elements are below******");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		System.out.println("first selected option in the list.");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		s.deselectByIndex(0);
		System.out.println(s.getFirstSelectedOption().getText());//VADA
		
		s.deselectByValue("v");
		System.out.println(s.getFirstSelectedOption().getText());//Poori
		
		s.deselectByVisibleText("Poori");
		//System.out.println(s.getFirstSelectedOption().getText());//IDLY
		System.out.println("check whether this is multiselect");
		System.out.println(s.isMultiple());
		
		//s.deselectAll();
		driver.close();
	}
}
