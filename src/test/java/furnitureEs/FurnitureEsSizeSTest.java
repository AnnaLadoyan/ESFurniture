package furnitureEs;


import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.S_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY3_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsSizeSTest extends FurnitureEs {
	
	@Test
	public void sizeSTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement s = driver.findElement(By.xpath(S_XPATH));
		s.click();
		System.out.println("2. Click on 'S' from the left menu");
		
		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY3_XPATH)).isDisplayed());
	}


}
