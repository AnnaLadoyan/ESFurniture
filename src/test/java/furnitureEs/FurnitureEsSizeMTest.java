package furnitureEs;

import static furnitureEs.FurnitureXPaths.M_XPATH;
import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY11_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsSizeMTest extends FurnitureEs {
	
	@Test
	public void sizeMTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement m = driver.findElement(By.xpath(M_XPATH));
		m.click();
		System.out.println("2.   Click on 'M' from the left menu");
		
		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY11_XPATH)).isDisplayed());
	}


}
