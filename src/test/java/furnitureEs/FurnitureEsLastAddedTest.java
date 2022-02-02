package furnitureEs;

import static furnitureEs.FurnitureXPaths.LAST_ADDED_XPATH;
import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.SORT_BY_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY2_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsLastAddedTest extends FurnitureEs{
	
	@Test
	public void lastAddedTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement sortBy = driver.findElement(By.xpath(SORT_BY_XPATH));
		sortBy.click();
		System.out.println("2. Click the 'Sort By' button");
		WebElement lastAdded = driver.findElement(By.xpath(LAST_ADDED_XPATH));
		lastAdded.click();
		System.out.println("3. Click the 'Last Added' button");

		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY2_XPATH)).isDisplayed());
	}


}
