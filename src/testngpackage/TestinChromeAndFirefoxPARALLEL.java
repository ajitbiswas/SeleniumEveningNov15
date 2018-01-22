package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestinChromeAndFirefoxPARALLEL {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void testChromeAndFirefox(String browser) throws InterruptedException {
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.get("http://localhost:8080/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		
		for (int i = 0; i < 10; i++) {
			unTB.sendKeys("admin" + i);
			unTB.clear();
			Thread.sleep(2000);
		}
		driver.close();
	}
}
