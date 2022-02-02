package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurniturePhoneNumber;

public class ESFurniturePhoneNumberTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurniturePhoneNumber phoneNumber = new ESFurniturePhoneNumber(driver);
		phoneNumber = phoneNumber.contacts();
		phoneNumber = phoneNumber.information();
		
		Assert.assertTrue(phoneNumber.verify16.isDisplayed());
	}

}
