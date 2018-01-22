package qspiders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
public class FileDownloadPopupExample  {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/zip";
		profile.setPreference(key, value);
		
	/*	FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);*/
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(FirefoxDriver.PROFILE, profile);
		FirefoxOptions option = new FirefoxOptions(cap);
		
		WebDriver driver = new FirefoxDriver(option);
		driver.get("http://www.seleniumhq.org/download/");

		String xp = "//td[text()='Java']/following-sibling::td/a[.='Download']";
		driver.findElement(By.xpath(xp)).click();


	}

}
