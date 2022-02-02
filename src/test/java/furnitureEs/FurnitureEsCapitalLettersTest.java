package furnitureEs;

import static furnitureEs.FurnitureXPaths.INPUT_XPATH;
import static furnitureEs.FurnitureXPaths.SEARCH_ICON_XPATH;
import static furnitureEs.FurnitureXPaths.VERIFY14_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureEsCapitalLettersTest extends FurnitureEs{
	
	@Test
	public void capitalLettersTest() {
		WebElement searchIcon = driver.findElement(By.xpath(SEARCH_ICON_XPATH));
		searchIcon.click();
		System.out.println("1. Click the search icon");
		WebElement bedroom = driver.findElement(By.xpath(INPUT_XPATH));
		bedroom.sendKeys("BEDROOM");
		System.out.println("2. Enter 'BEDROOM' in the search field ");
		bedroom.sendKeys(Keys.ENTER);
		System.out.println("3.  Click the ENTER key");

		Assert.assertTrue(driver.findElement(By.xpath(VERIFY14_XPATH)).isDisplayed());
	}

}
