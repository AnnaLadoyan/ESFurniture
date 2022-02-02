package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeM;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeS;

public class ESFurnitureSizeMTest extends ESFurnitureBaseTest {
	

	@Test
	public void sizeMFurnitureTest() {
		ESFurnitureSizeM romanianFurniture = new ESFurnitureSizeM(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.sizeMFurniture();

		Assert.assertTrue(romanianFurniture.verify11.isDisplayed());
	}


}
