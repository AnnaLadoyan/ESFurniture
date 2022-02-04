package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.contacts.ESFurnitureEmailNumbers;
import com.web365.esfurniture.contacts.ESFurnitureNameLetters;

public class ESFurnitureEmailNumbersTest extends ESFurnitureBaseTest {
	
	@Test
	public void contactsTest() {
		ESFurnitureEmailNumbers numbers = new ESFurnitureEmailNumbers(driver);
		numbers = numbers.contacts();
		numbers = numbers.emailField();
		numbers = numbers.emailNumbers();
		
		Assert.assertTrue(numbers.verify28.isDisplayed());
	}


}
