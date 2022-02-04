package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurnitureEmailLetters;
import com.web365.esfurniture.contacts.ESFurnitureNameLetters;

public class ESFurnitureEmailLettersTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurnitureEmailLetters letters = new ESFurnitureEmailLetters(driver);
		letters = letters.contacts();
		letters = letters.emailField();
		letters = letters.emailLetters();
		
		Assert.assertTrue(letters.verify27.isDisplayed());
	}


}
