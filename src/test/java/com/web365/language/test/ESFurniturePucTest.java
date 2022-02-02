package com.web365.language.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.language.ESFurniturePuc;


public class ESFurniturePucTest extends ESFurnitureBaseTest {
	
	@Test
	public void languageTest() {
		ESFurniturePuc language = new ESFurniturePuc(driver);
		language = language.language();
		language = language.puc();
		
		Assert.assertTrue(language.verify19.isDisplayed());
	}


}
