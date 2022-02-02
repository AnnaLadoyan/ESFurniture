package com.web365.esfurniture.filter;

import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.FIRST_ADDED_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.SORT_BY_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.VERIFY12_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureFirstAddedFilter extends ESFurnitureBasePage {

	public ESFurnitureFirstAddedFilter(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = FIRST_ADDED_XPATH)
	public WebElement firstAdded;

	@FindBy(xpath = VERIFY12_XPATH)
	public WebElement verify12;

	public ESFurnitureFirstAddedFilter gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnitureFirstAddedFilter(this.driver);
	}

	public ESFurnitureFirstAddedFilter sortBy() {
		sortBy.click();
		return new ESFurnitureFirstAddedFilter(this.driver);
	}

	public ESFurnitureFirstAddedFilter firstAdded() {
		firstAdded.click();
		return new ESFurnitureFirstAddedFilter(this.driver);
	}

}
