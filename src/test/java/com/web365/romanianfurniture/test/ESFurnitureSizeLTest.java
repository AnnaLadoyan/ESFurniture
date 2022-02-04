package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeL;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeM;

public class ESFurnitureSizeLTest extends ESFurnitureBaseTest {
	
	@Test
	public void sizeLFurnitureTest() {
		ESFurnitureSizeL romanianFurniture = new ESFurnitureSizeL(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.sizeLFurniture();

		Assert.assertTrue(romanianFurniture.verify24.isDisplayed());
	}


}
