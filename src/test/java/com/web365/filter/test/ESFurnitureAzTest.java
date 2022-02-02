package com.web365.filter.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.filter.ESFurnitureAZFilter;

public class ESFurnitureAzTest extends ESFurnitureBaseTest {

	@Test
	public void azTest() throws InterruptedException {
		ESFurnitureAZFilter filter = new ESFurnitureAZFilter(driver);
		filter = filter.gotoRomanianFurniture();
		filter = filter.sortByAZ();

		Assert.assertTrue(filter.verify1.isDisplayed());
	}

}
