package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurnitureAddress;

public class ESFurnitureAddressTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurnitureAddress address = new ESFurnitureAddress(driver);
		address = address.contacts();
		address = address.information();
		
		Assert.assertTrue(address.verify18.isDisplayed());
	}


}
