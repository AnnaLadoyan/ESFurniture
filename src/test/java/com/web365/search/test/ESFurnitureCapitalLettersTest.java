package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.search.ESFurnitureCapitalLetters;

public class ESFurnitureCapitalLettersTest extends ESFurnitureBaseTest {

	@Test
	public void ESFurnitureCapitalLettersTest() {
		ESFurnitureCapitalLetters search = new ESFurnitureCapitalLetters(driver);
		search = search.SearchIcon();
		search = search.inputClick();
		search = search.input();
		search = search.inputEnter();


		
		Assert.assertTrue(search.verify14.isDisplayed());
	}

}
