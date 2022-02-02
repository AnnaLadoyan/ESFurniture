package com.web365.esfurniture.search;

import static com.web365.esfurniture.search.ESFurnitureSearchConstants.SEARCH_ICON_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.VERIFY14_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.INPUT_XPATH;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.cart.ESFurnitureRemoveFromCart;
import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureCapitalLetters extends ESFurnitureBasePage {

	public ESFurnitureCapitalLetters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;
	
	@FindBy(xpath = INPUT_XPATH)
	public WebElement searchinput;

	@FindBy(xpath = VERIFY14_XPATH)
	public WebElement verify14;

	public ESFurnitureCapitalLetters SearchIcon() {
		searchIcon.click();
		return new ESFurnitureCapitalLetters(this.driver);
	}

	public ESFurnitureCapitalLetters inputClick() {
		searchinput.click();
		return new ESFurnitureCapitalLetters(this.driver);
	}

	public ESFurnitureCapitalLetters input() {
		searchinput.sendKeys("BEDROOM");
		return new ESFurnitureCapitalLetters(this.driver);
	}

	public ESFurnitureCapitalLetters inputEnter() {
		searchinput.sendKeys(Keys.ENTER);
		return new ESFurnitureCapitalLetters(this.driver);
	}

}
