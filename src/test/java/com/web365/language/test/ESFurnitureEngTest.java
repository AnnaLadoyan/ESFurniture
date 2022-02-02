package com.web365.language.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.language.ESFurnitureEng;

public class ESFurnitureEngTest extends ESFurnitureBaseTest {
	
	@Test
	public void languageTest() {
		ESFurnitureEng language = new ESFurnitureEng(driver);
		language = language.language();
		language = language.eng();
		
		Assert.assertTrue(language.verify20.isDisplayed());
	}


}
