package qspiders;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class TakeScreenshotOfFB extends BaseClass{
	public static void main(String[] args) throws IOException {
		driver.navigate().to("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String date1 = d.toString();
		System.out.println(date1);
		String date2 = date1.replaceAll(":", "_");
		System.out.println(date2);
		
		File destFile = new File("./screenshots/"+date2+"_test.png");
		
		FileUtils.copyFile(srcFile, destFile);
		

	}

}
