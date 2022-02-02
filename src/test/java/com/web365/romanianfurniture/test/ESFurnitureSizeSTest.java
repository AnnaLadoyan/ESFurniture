package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureSizeS;
public class ESFurnitureSizeSTest extends ESFurnitureBaseTest {
	
	@Test
	public void sizeSFurnitureTest() {
		ESFurnitureSizeS romanianFurniture = new ESFurnitureSizeS(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.sizeSFurniture();

		Assert.assertTrue(romanianFurniture.verify3.isDisplayed());
	}


}
