package com.web365.filter.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.filter.ESFurnitureZAFilter;

public class ESFurnitureZATest extends ESFurnitureBaseTest {
	
	@Test
	public void zaTest() throws InterruptedException {
		ESFurnitureZAFilter filter = new ESFurnitureZAFilter(driver);
		filter = filter.gotoRomanianFurniture();
		filter = filter.sortByZA();

		Assert.assertTrue(filter.verify22.isDisplayed());
	}

}
