package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnituerKitchenFurniture;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureOfficeFurniture;

public class ESFurnitureOfficeFurnitureTest extends ESFurnitureBaseTest {
	
	@Test
	public void OfficeFurnitureTest () {
		ESFurnitureOfficeFurniture romanianFurniture = new ESFurnitureOfficeFurniture(driver);
		romanianFurniture = romanianFurniture.gotoOfficeFurniture();
		romanianFurniture = romanianFurniture.officeFurniture();

		Assert.assertTrue(romanianFurniture.verify23.isDisplayed());
	}


}
