package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.search.ESFurnitureCapitalLetters;
import com.web365.esfurniture.search.ESFurnitureLowercaseLetters;

public class ESFurnitureLowercaseLettersTest extends ESFurnitureBaseTest {
	
	@Test
	public void ESFurnitureLowercaseLettersTest() {
		ESFurnitureLowercaseLetters search = new ESFurnitureLowercaseLetters(driver);
		search = search.SearchIcon();
		search = search.inputClick();
		search = search.input();
		search = search.inputEnter();


		
		Assert.assertTrue(search.verify15.isDisplayed());
	}


}
