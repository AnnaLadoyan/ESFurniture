package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurniturePhoneNumberField;
import com.web365.esfurniture.contacts.ESFurniturePhoneNumberFieldSpecialCharacters;
import com.web365.esfurniture.contacts.ESFurnitureSpecialCharacters;

public class ESFurniturePhoneNumberFieldSpecialCharactersTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurniturePhoneNumberFieldSpecialCharacters SpecialCharacters = new ESFurniturePhoneNumberFieldSpecialCharacters(driver);
		SpecialCharacters = SpecialCharacters.contacts();
		SpecialCharacters = SpecialCharacters.SpecialCharactersField();
		SpecialCharacters = SpecialCharacters.SpecialCharactersField();
		
		Assert.assertTrue(SpecialCharacters.verify31.isDisplayed());
	}
}
