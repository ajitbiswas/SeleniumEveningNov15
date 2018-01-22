package qspiders;

import java.util.Set;

public class ChildBrowserDemo extends BaseClass {
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		
		String parentwindowHandle = driver.getWindowHandle();
		Set<String> allWHs = driver.getWindowHandles();
		int count = allWHs.size();
		System.out.println(count);
		for (String wh  : allWHs) {
			
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(wh + "--> "+title);
			/*if (!wh.equals(parentwindowHandle)) {
				driver.close();
			}*/
			if (title.contains("Jasmin")) {
				driver.close();
			}
		}
		
		//Actions action = new Actions
		//driver.quit();
	}
}
