package furnitureEs;

import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY1_XPATH;
import static furnitureEs.FurnitureXPaths.XXL_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsSizeXXLTest extends FurnitureEs {
	
	@Test
	public void sizeXXLTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement xxl = driver.findElement(By.xpath(XXL_XPATH));
		xxl.click();
		System.out.println("2. Click on 'XXL' from the left menu");
		
		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY1_XPATH)).isDisplayed());
	}

	
	

}
