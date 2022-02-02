package com.web365.esfurniture.filter;

import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.FIRST_ADDED_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.LAST_ADDED_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.SORT_BY_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.VERIFY12_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.VERIFY1_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureLastAddedFilter extends ESFurnitureBasePage {
	

	public ESFurnitureLastAddedFilter(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = FIRST_ADDED_XPATH)
	public WebElement lastAdded;

	@FindBy(xpath = VERIFY12_XPATH)
	public WebElement verify2;

	public ESFurnitureLastAddedFilter gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnitureLastAddedFilter(this.driver);
	}

	public ESFurnitureLastAddedFilter sortBy() {
		sortBy.click();
		return new ESFurnitureLastAddedFilter(this.driver);
	}

	public ESFurnitureLastAddedFilter lastAdded() {
		lastAdded.click();
		return new ESFurnitureLastAddedFilter(this.driver);
	}

}
