package com.web365.esfurniture.filter;

import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.SORT_BY_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.Z_A_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.VERIFY22_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureZAFilter extends ESFurnitureBasePage {

	public ESFurnitureZAFilter(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = Z_A_XPATH)
	public WebElement za;

	@FindBy(xpath = VERIFY22_XPATH)
	public WebElement verify22;

	public ESFurnitureZAFilter gotoRomanianFurniture() {
		romanianFurniture.click();

		return new ESFurnitureZAFilter(this.driver);
	}

	public ESFurnitureZAFilter sortByZA() throws InterruptedException {
		sortBy.click();
		new ESFurnitureZAFilter(this.driver);
		Thread.sleep(5000);
		za.click();
		return new ESFurnitureZAFilter(this.driver);
	}

}
