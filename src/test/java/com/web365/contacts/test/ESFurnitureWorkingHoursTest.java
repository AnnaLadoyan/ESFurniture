package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurnitureWorkingHours;

public class ESFurnitureWorkingHoursTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurnitureWorkingHours workingHours = new ESFurnitureWorkingHours(driver);
		workingHours = workingHours.contacts();
		workingHours = workingHours.information();
		
		Assert.assertTrue(workingHours.verify17.isDisplayed());
	}


}
