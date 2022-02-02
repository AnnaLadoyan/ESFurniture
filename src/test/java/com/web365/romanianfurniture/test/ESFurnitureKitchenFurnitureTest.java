package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnituerKitchenFurniture;

public class ESFurnitureKitchenFurnitureTest extends ESFurnitureBaseTest {

	@Test
	public void kitchenFurnitureTest() {
		ESFurnituerKitchenFurniture romanianFurniture = new ESFurnituerKitchenFurniture(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.KitchenFurniture();

		Assert.assertTrue(romanianFurniture.verify6.isDisplayed());
	}

}
