package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.search.ESFurnitureNumbers;

public class ESFurnitureNumbersTest extends ESFurnitureBaseTest {
	
	@Test
	public void ESFurnitureNumbersTest() {
		ESFurnitureNumbers search = new ESFurnitureNumbers(driver);
		search = search.SearchIcon();
		search = search.inputClick();
		search = search.input();
		search = search.inputEnter();


		
		Assert.assertTrue(search.verify4.isDisplayed());
	}


}
