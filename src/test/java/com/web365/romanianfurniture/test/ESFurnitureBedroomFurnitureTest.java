package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.filter.ESFurnitureLastAddedFilter;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureBedroomFurniture;

public class ESFurnitureBedroomFurnitureTest extends ESFurnitureBaseTest {
	
	@Test
	public void bedroomFurnitureTest() {
		ESFurnitureBedroomFurniture romanianFurniture = new ESFurnitureBedroomFurniture(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.bedroomFurniture();
		
		Assert.assertTrue(romanianFurniture.verify10.isDisplayed());
	}


}
