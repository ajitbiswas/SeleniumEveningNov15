package tesntnapckage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public  void testA() {

		//System.out.println("test A");
		Reporter.log("test A", true);

	}

}
