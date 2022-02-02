package com.web365.removefromcart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ESFurnitureBaseTest;
import com.web365.esfurniture.cart.ESFurnitureRemoveFromCart;
import com.web365.esfurniture.page.romanianfurniture.ESFurnitureLobbyFurniture;

public class ESFurnitureRemoveFromCartTest extends ESFurnitureBaseTest {

	@Test
	public void removeFromCartTest() {
		ESFurnitureRemoveFromCart cart = new ESFurnitureRemoveFromCart(driver);
		cart = cart.SearchIcon();
		cart = cart.inputClick();
		cart = cart.input();
		cart = cart.inputEnter();
		cart = cart.Img();
		cart = cart.AddToCart();
		cart = cart.Cart();
		cart = cart.Remove();


		Assert.assertTrue(cart.verify7.isDisplayed());
	}

}
