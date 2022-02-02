package furnitureEs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FurnitureEs {
	ChromeDriver driver;
	@BeforeClass
	public void myBeforeClass() {
			driver = new ChromeDriver();
		driver.get("http://www.eskahuyq.am/?l=en-US");
	}
	
	@AfterClass
	public void myAfterClass() {
		driver.close();
		driver.quit();
	}

}
