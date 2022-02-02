package com.web365.language.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.language.ESFurnitureEng;
import com.web365.esfurniture.language.ESFurnitureHay;

public class ESFurnitureHayTest extends ESFurnitureBaseTest {
	
	@Test
	public void languageTest() {
		ESFurnitureHay language = new ESFurnitureHay(driver);
		language = language.language();
		language = language.hay();
		
		Assert.assertTrue(language.verify21.isDisplayed());
	}

}
