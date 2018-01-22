package qspiders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Collections_PrintOnlytheDuplicateValue_Poori_Treeset  extends BaseClass{
	public static void main(String[] args) {
	driver.get("file:///D:/Ajit/Selenium/SeleniumBtm_7thSep17/webpages/ListBox_Breakfast.html");
	WebElement Itemlist = driver.findElement(By.id("mtr"));
	Select s = new Select(Itemlist);
	TreeSet<String> treeObj = new TreeSet<String>();
	List<WebElement> allOptions = s.getOptions();
	//Print in unsorted order - by default
	System.out.println("****Print in unsorted order ****");
	for (WebElement option : allOptions) {
		String text = option.getText();
		//System.out.println(text);
		//System.out.println(treeObj.add(text));
		if (!treeObj.add(text)) {
			System.out.println(text);
		}
	}
	driver.close();
	}
}
