package com.web365.esfurniture.cart;

import static com.web365.esfurniture.cart.ESFurnitureCartConstants.SEARCH_ICON_XPATH;
import static com.web365.esfurniture.cart.ESFurnitureCartConstants.INPUT_XPATH;
import static com.web365.esfurniture.cart.ESFurnitureCartConstants.IMG_XPATH;
import static com.web365.esfurniture.cart.ESFurnitureCartConstants.ADD_TO_CART_XPATH;
import static com.web365.esfurniture.cart.ESFurnitureCartConstants.CART_XPATH;
import static com.web365.esfurniture.cart.ESFurnitureCartConstants.REMOVE_XPATH;
import static com.web365.esfurniture.cart.ESFurnitureCartConstants.VERIFY7_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;
import com.web365.esfurniture.page.romanianfurniture.ESFurnituerKitchenFurniture;

public class ESFurnitureRemoveFromCart extends ESFurnitureBasePage {

	public ESFurnitureRemoveFromCart(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;

	@FindBy(xpath = INPUT_XPATH)
	public WebElement input;

	@FindBy(xpath = IMG_XPATH)
	public WebElement img;

	@FindBy(xpath = ADD_TO_CART_XPATH)
	public WebElement addToCart;

	@FindBy(xpath = CART_XPATH)
	public WebElement cart;

	@FindBy(xpath = REMOVE_XPATH)
	public WebElement remove;

	@FindBy(xpath = VERIFY7_XPATH)
	public WebElement verify7;

	public ESFurnitureRemoveFromCart SearchIcon() {
		searchIcon.click();
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart inputClick() {
		input.click();
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart input() {
		input.sendKeys("8262");
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart inputEnter() {
		input.sendKeys(Keys.ENTER);
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart Img() {
		img.click();
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart AddToCart() {
		addToCart.click();
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart Cart() {
		cart.click();
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart Remove() {
		remove.click();
		return new ESFurnitureRemoveFromCart(this.driver);
	}

	public ESFurnitureRemoveFromCart Verify() {
		verify7.click();
		return new ESFurnitureRemoveFromCart(this.driver);
	}

}
