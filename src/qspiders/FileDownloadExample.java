package qspiders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class FileDownloadExample  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxProfile profileObj = new FirefoxProfile();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/x-zip-compressed";
		profileObj.setPreference(key, value);
		profileObj.setPreference("browser.download.folderList", 2);
		profileObj.setPreference("browser.download.dir", "D:\\");
		FirefoxOptions optionObj = new FirefoxOptions();
		optionObj.setProfile(profileObj);
		WebDriver driver = new FirefoxDriver(optionObj);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[.='Java']/following-sibling::td/a[.='Download']")).click();
	}
}
