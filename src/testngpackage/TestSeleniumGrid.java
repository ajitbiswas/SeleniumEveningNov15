package testngpackage;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestSeleniumGrid {
	
	static{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	@Parameters({"node","browser"})
	public void testSeleniumGrid(String node, String browser) throws MalformedURLException, InterruptedException{
		URL whichSystem = new URL(node);
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(whichSystem, whichBrowser);
		driver.get("http://localhost:8080/login.do");
		WebElement unObj = driver.findElement(By.id("username"));
		for (int i = 0; i < 10; i++) {
			unObj.sendKeys("admin" + i);
			Thread.sleep(2000);
			unObj.clear();
		}
	}
}
