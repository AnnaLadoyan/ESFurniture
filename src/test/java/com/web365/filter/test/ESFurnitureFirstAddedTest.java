package com.web365.filter.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.filter.ESFurnitureFirstAddedFilter;

public class ESFurnitureFirstAddedTest extends ESFurnitureBaseTest {
	
	@Test
	public void firstAddedTest() throws InterruptedException {
		ESFurnitureFirstAddedFilter filter = new ESFurnitureFirstAddedFilter(driver);
		filter = filter.gotoRomanianFurniture();
		filter = filter.sortBy();
		filter = filter.firstAdded();

		Assert.assertTrue(filter.verify12.isDisplayed());
	}


}
