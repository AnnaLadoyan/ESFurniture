package furnitureEs;

import static furnitureEs.FurnitureXPaths.LOBBY_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.ROMAINIAN_FURNITURE_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY13_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsLobbyFurnitureTest extends FurnitureEs {
	
	@Test
	public void lobbyFurnitureTest() {
		WebElement romanianFurniture = driver.findElement(By.xpath(ROMAINIAN_FURNITURE_XPATH));
		romanianFurniture.click();
		System.out.println("1. Click the 'Romanian Furniture' button");
		WebElement lobbyFurniture = driver.findElement(By.xpath(LOBBY_FURNITURE_XPATH));
		lobbyFurniture.click();
		System.out.println("2. Click the 'Lobby Furniture' button from the left menu");
		
		 Assert.assertTrue(driver.findElement(By.xpath(VERIFY13_XPATH)).isDisplayed());
	}

}
