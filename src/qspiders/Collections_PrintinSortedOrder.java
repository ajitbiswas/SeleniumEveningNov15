package qspiders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Collections_PrintinSortedOrder  extends BaseClass{
	public static void main(String[] args) {
	driver.get("file:///D:/Ajit/Selenium/SeleniumBtm_7thSep17/webpages/ListBox_Breakfast.html");
	WebElement Itemlist = driver.findElement(By.id("mtr"));
	Select s = new Select(Itemlist);
	
	ArrayList<String> listObj = new ArrayList<String>();
	List<WebElement> allOptions = s.getOptions();
	//Print in unsorted order - by default
	System.out.println("****Print in unsorted order ****");
	for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(text);
		listObj.add(text);
	}
	Collections.sort(listObj);
	//Print in unsorted order - by default
	System.out.println("****Print in sorted order ****");
	for (String text : listObj) {
		System.out.println(text);
		
	}
	driver.close();
	
	}
}
