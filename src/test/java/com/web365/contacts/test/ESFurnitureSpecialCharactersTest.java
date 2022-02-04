package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurnitureNameLetters;
import com.web365.esfurniture.contacts.ESFurnitureSpecialCharacters;

public class ESFurnitureSpecialCharactersTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurnitureSpecialCharacters SpecialCharacters = new ESFurnitureSpecialCharacters(driver);
		SpecialCharacters = SpecialCharacters.contacts();
		SpecialCharacters = SpecialCharacters.SpecialCharactersField();
		SpecialCharacters = SpecialCharacters.SpecialCharactersLetters();
		
		Assert.assertTrue(SpecialCharacters.verify29.isDisplayed());
	}

}
