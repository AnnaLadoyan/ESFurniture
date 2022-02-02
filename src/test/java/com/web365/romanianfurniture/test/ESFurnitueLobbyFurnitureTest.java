package com.web365.romanianfurniture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureLobbyFurniture;

public class ESFurnitueLobbyFurnitureTest extends ESFurnitureBaseTest {
	
	@Test
	public void lobbyFurnitureTest() {
		ESFurnitureLobbyFurniture romanianFurniture = new ESFurnitureLobbyFurniture(driver);
		romanianFurniture = romanianFurniture.gotoRomanianFurniture();
		romanianFurniture = romanianFurniture.lobbyFurniture();
		
		Assert.assertTrue(romanianFurniture.verify13.isDisplayed());
	}

}
