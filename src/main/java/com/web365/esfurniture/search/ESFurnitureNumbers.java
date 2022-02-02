package com.web365.esfurniture.search;

import static com.web365.esfurniture.search.ESFurnitureSearchConstants.INPUT_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.SEARCH_ICON_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.VERIFY4_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureNumbers extends ESFurnitureBasePage {

	public ESFurnitureNumbers(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;

	@FindBy(xpath = INPUT_XPATH)
	public WebElement searchinput;

	@FindBy(xpath = VERIFY4_XPATH)
	public WebElement verify4;

	public ESFurnitureNumbers SearchIcon() {
		searchIcon.click();
		return new ESFurnitureNumbers(this.driver);
	}

	public ESFurnitureNumbers inputClick() {
		searchinput.click();
		return new ESFurnitureNumbers(this.driver);
	}

	public ESFurnitureNumbers input() {
		searchinput.sendKeys("8262");
		return new ESFurnitureNumbers(this.driver);
	}

	public ESFurnitureNumbers inputEnter() {
		searchinput.sendKeys(Keys.ENTER);
		return new ESFurnitureNumbers(this.driver);
	}

}
