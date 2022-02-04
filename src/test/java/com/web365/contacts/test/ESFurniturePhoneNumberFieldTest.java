package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurniturePhoneNumberField;

public class ESFurniturePhoneNumberFieldTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurniturePhoneNumberField numbers = new ESFurniturePhoneNumberField(driver);
		numberField = numberField.contacts();
		numberField = numberField.numberField();
		numberField = numberField.phoneNumber();
		
		Assert.assertTrue(NumberField.verify30.isDisplayed());
	}



}
