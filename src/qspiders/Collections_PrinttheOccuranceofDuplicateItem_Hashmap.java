package qspiders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Collections_PrinttheOccuranceofDuplicateItem_Hashmap  extends BaseClass{
	public static void main(String[] args) {
	driver.get("file:///D:/Ajit/Selenium/SeleniumBtm_7thSep17/webpages/ListBox_Breakfast.html");
	WebElement Itemlist = driver.findElement(By.id("mtr"));
	Select s = new Select(Itemlist);
	HashMap<String,Integer> hashmapObj = new HashMap<String,Integer>();
	List<WebElement> allOptions = s.getOptions();
	System.out.println("****Print in unsorted order ****");
	for (WebElement option : allOptions) {
		String text = option.getText();
		if (hashmapObj.containsKey(text)) {
			Integer value = hashmapObj.get(text);
			value++;
			hashmapObj.put(text, value);
		} else {
			hashmapObj.put(text, 1);
		}
		Set<String> allKeys = hashmapObj.keySet();
		for (String key : allKeys) {
			Integer value = hashmapObj.get(key);
			if (value>1) {
				System.out.println(key + "-->getting repeated -->"+ value +" times");
				
			}
		}
 		
		
	}
	driver.close();
	}
}
