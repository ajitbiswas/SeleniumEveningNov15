package qspiders;
import java.io.IOException;
import org.openqa.selenium.By;
public class FileUploadUsingAutoIT_HandleWindowPopup extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.findElement(By.xpath("(//input[@uploader='uploader'])[2]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(".\\AutoIT\\FileUploadDemo.exe");
	}
}
