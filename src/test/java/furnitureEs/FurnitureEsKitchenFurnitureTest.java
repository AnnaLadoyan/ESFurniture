package furnitureEs;

import static furnitureEs.FurnitureXPaths.KITCHEN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY6_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsKitchenFurnitureTest extends FurnitureEs {
	
	@Test
	public void kitchenFurnitureTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement kitchenFurniture = driver.findElement(By.xpath(KITCHEN_FURNITURE_XPATH));
		kitchenFurniture.click();
		System.out.println("2. Click the 'Kitchen Furniture' button from the left menu");
		
		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY6_XPATH)).isDisplayed());
	}



}
