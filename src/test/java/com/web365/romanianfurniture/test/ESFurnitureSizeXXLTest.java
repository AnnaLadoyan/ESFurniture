package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeS;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeXXL;

public class ESFurnitureSizeXXLTest extends ESFurnitureBaseTest {
	

	@Test
	public void sizeXXLFurnitureTest() {
		ESFurnitureSizeXXL romanianFurniture = new ESFurnitureSizeXXL(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.sizeXXLFurniture();

		Assert.assertTrue(romanianFurniture.verify9.isDisplayed());
	}


}
