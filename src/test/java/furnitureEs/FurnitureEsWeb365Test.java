package furnitureEs;

import static furnitureEs.FurnitureXPaths.VERIFY8_XPATH;
import static furnitureEs.FurnitureXPaths.WEB_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v95.page.model.WindowOpen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsWeb365Test extends FurnitureEs {
	
	@Test
	public void web365Test() {
		WebElement web365 = driver.findElement(By.xpath(WEB_XPATH));
		web365.click();
		System.out.println("1. Click the WEB 365 link on the bottom of the website");
		
		
		Assert.assertTrue(driver.findElement(By.xpath(VERIFY8_XPATH)).isDisplayed());
		}

}
