package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeL;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeXL;

public class ESFurnitureSizeXLTest extends ESFurnitureBaseTest {
	
	@Test
	public void sizeXLFurnitureTest() {
		ESFurnitureSizeXL romanianFurniture = new ESFurnitureSizeXL(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.sizeXLFurniture();

		Assert.assertTrue(romanianFurniture.verify25.isDisplayed());
	}


}
