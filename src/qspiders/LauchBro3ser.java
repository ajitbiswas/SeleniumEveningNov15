package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LauchBro3ser {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		Navigation navigate = driver.navigate();
		navigate.to("https://www.google.co.in");
		
		
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();
		//driver.close();
		driver.quit();
		
		
		
		//driver.get("https://www.google.co.in");
		
		/*System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		

	}

}
