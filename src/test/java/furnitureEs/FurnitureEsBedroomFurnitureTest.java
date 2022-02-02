package furnitureEs;

import static furnitureEs.FurnitureXPaths.BEDROOM_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY10_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsBedroomFurnitureTest extends FurnitureEs {
	
	@Test
	public void bedroomFurnitureTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement bedroomFurniture = driver.findElement(By.xpath(BEDROOM_FURNITURE_XPATH));
		bedroomFurniture.click();
		System.out.println("2.  Click the 'Bedroom Furniture' button from the left menu");
		
		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY10_XPATH)).isDisplayed());
	}

}
