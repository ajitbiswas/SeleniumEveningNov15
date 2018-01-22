package qspiders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
public class WebElemenetsMethodsDemo extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost:8080/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		System.out.println(unTB.isDisplayed() + " UN text box is displayed" );
		System.out.println(unTB.isEnabled()+ " UN text box is enabled");
		/*unTB.sendKeys("admin");
		Thread.sleep(2000);
		unTB.clear();
		Thread.sleep(2000);*/
		
		WebElement pwTB = driver.findElement(By.name("pwd"));
		int unxcor= unTB.getLocation().getX();
		int pwxcor = pwTB.getLocation().getX();
		
		int unheight = unTB.getSize().getHeight();
		int pwheight = pwTB.getSize().getHeight();
		
		int unwidth = unTB.getSize().getWidth();
		int pwwidth = pwTB.getSize().getWidth();
		
		if (unxcor==pwxcor && unheight==pwheight && unwidth==pwwidth) {
			
			System.out.println("ALIGNED");
		} else {
			System.out.println("NOT ALIGNED");

		}
		
		WebElement checkboxObj = driver.findElement(By.id("keepLoggedInCheckBox"));
		String attributeValue = checkboxObj.getAttribute("type");
		System.out.println(attributeValue);
		if (attributeValue.equals("checkbox")) {
			System.out.println("IT IS A CHECKBOX");
			checkboxObj.click();
			System.out.println(checkboxObj.isSelected() + " --> SELECTED");
			
			checkboxObj.click();
			System.out.println(checkboxObj.isSelected() + " --> NOT SELECTED");
		} else {
			System.out.println("NOT A CHECKBOX");

		}
		
		WebElement linkObj = driver.findElement(By.id("licenseLink"));
		
		String actualTagName = linkObj.getTagName();
		if (actualTagName.equals("a")) {
			System.out.println("It is a link");
			System.out.println(linkObj.getText());
			
		} else {
			System.out.println("NOT a  link");

		}
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		loginBtn.click();
		
		
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		System.out.println(errMsg.isDisplayed() + " error message displayed");
		
		System.out.println(errMsg.getText());
		
		String cssValue = errMsg.getCssValue("color");
		
		String errColor = Color.fromString(cssValue).asHex();
		
		if (errColor.equals("#ce0100")) {
			System.out.println("RED");
			
		} else {
			System.out.println("SCRIPT IS FAILED");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//loginBtn.submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();
		
		

	}

}
