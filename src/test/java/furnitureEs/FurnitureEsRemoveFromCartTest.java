package furnitureEs;

import static furnitureEs.FurnitureXPaths.ADD_TO_CART_XPATH;
import static furnitureEs.FurnitureXPaths.CART_XPATH;
import static furnitureEs.FurnitureXPaths.CHAIR_XPATH;
import static furnitureEs.FurnitureXPaths.INPUT_XPATH;
import static furnitureEs.FurnitureXPaths.REMOVE_XPATH;
import static furnitureEs.FurnitureXPaths.SEARCH_ICON_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY7_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsRemoveFromCartTest extends FurnitureEs {

	@Test
	public void removeFromCartTest() {
		WebElement searchIcon = driver.findElement(By.xpath(SEARCH_ICON_XPATH));
		searchIcon.click();
		System.out.println("1. Click the search icon");
		WebElement searchField = driver.findElement(By.xpath(INPUT_XPATH));
		searchField.click();
		searchField.sendKeys("8262");
		System.out.println("2. Enter '8262' in the search field");
		searchField.sendKeys(Keys.ENTER);
		System.out.println("3. Click the ENTER key");
		WebElement romanianFurniture = driver.findElement(By.xpath(CHAIR_XPATH));
		romanianFurniture.click();
		System.out.println("4. Click on the item");
		WebElement addToCart = driver.findElement(By.xpath(ADD_TO_CART_XPATH));
		addToCart.click();
		System.out.println("5. Click on the 'Add to Cart' button");
		WebElement cardButton = driver.findElement(By.xpath(CART_XPATH));
		cardButton.click();
		System.out.println("6. Click on the 'Cart button");
		WebElement remove = driver.findElement(By.xpath(REMOVE_XPATH));
		remove.click();
		System.out.println("7. Click on the 'Remove from the list' button");
		

		

		Assert.assertTrue(driver.findElement(By.xpath(VERIFY7_XPATH)).isDisplayed());
	}

}
