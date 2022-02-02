package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.search.ESFurnitureSpecialChar;

public class ESFurnitureSpecialCharTest extends ESFurnitureBaseTest {
	
	@Test
	public void ESFurnitureSpecialCharTest() {
		ESFurnitureSpecialChar search = new ESFurnitureSpecialChar(driver);
		search = search.SearchIcon();
		search = search.inputClick();
		search = search.input();
		search = search.inputEnter();


		
		Assert.assertTrue(search.verify5.isDisplayed());
	}

}
