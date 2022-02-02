package furnitureEs;

import static furnitureEs.FurnitureXPaths.FIRST_ADDED_XPATH;
import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.SORT_BY_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY1_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsFirstAddedTest extends FurnitureEs {
	
	@Test
	public void firstAddedTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement sortBy = driver.findElement(By.xpath(SORT_BY_XPATH));
		sortBy.click();
		System.out.println("2.  Click the 'Sort By' button");
		WebElement firstAdded = driver.findElement(By.xpath(FIRST_ADDED_XPATH));
		firstAdded.click();
		System.out.println("3. Click the 'First Added' button");

		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY1_XPATH)).isDisplayed());
	}


}
