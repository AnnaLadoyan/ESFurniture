package furnitureEs;

import static furnitureEs.FurnitureXPaths.INPUT_XPATH;
import static furnitureEs.FurnitureXPaths.SEARCH_ICON_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY15_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsLowercaseLettersTest extends FurnitureEs {
	
	@Test
	public void lowercaseLettersTest() {
		WebElement searchIcon = driver.findElement(By.xpath(SEARCH_ICON_XPATH));
		searchIcon.click();
		System.out.println("1. Click the search icon");
		WebElement bedroom = driver.findElement(By.xpath(INPUT_XPATH));
		bedroom.sendKeys("bedroom");
		System.out.println("2. Enter 'bedroom' in the search field ");
		bedroom.sendKeys(Keys.ENTER);
		System.out.println("3.  Click the ENTER key");

		Assert.assertTrue(driver.findElement(By.xpath(VERIFY15_XPATH)).isDisplayed());
	}

}
