package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurnitureAddress;
import com.web365.esfurniture.contacts.ESFurnitureNameLetters;

public class ESFurnitureNameLettersTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurnitureNameLetters letters = new ESFurnitureNameLetters(driver);
		letters = letters.contacts();
		letters = letters.nameField();
		letters = letters.nameLetters();
		
		Assert.assertTrue(letters.verify26.isDisplayed());
	}

}
