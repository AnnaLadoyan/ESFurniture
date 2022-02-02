package furnitureEs;

import static furnitureEs.FurnitureXPaths.A_Z_XPATH;
import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.SORT_BY_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY1_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;;

public class FurnitureEsAZTest extends FurnitureEs {
	@Test
	public void testAzFilter() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement sortBy = driver.findElement(By.xpath(SORT_BY_XPATH));
		sortBy.click();
		System.out.println("2. Click the 'Sort By' button");
		WebElement az = driver.findElement(By.xpath(A_Z_XPATH));
		az.click();
		System.out.println("3. Click the 'A-Z' button");

		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY1_XPATH)).isDisplayed());
	}

}
