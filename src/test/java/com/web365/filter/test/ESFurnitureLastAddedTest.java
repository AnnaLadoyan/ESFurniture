package com.web365.filter.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.filter.ESFurnitureFirstAddedFilter;
import com.web365.esfurniture.filter.ESFurnitureLastAddedFilter;

public class ESFurnitureLastAddedTest extends ESFurnitureBaseTest {
	
	@Test
	public void lastAddedTest() throws InterruptedException {
		ESFurnitureLastAddedFilter filter = new ESFurnitureLastAddedFilter(driver);
		filter = filter.gotoRomanianFurniture();
		filter = filter.sortBy();
		filter = filter.lastAdded();

		Assert.assertTrue(filter.verify2.isDisplayed());
	}

}
