package com.web365.esfurniture.filter;

import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.A_Z_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.SORT_BY_XPATH;
import static com.web365.esfurniture.filter.ESFurnitureFilterPageConstants.VERIFY1_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureAZFilter extends ESFurnitureBasePage {

	public ESFurnitureAZFilter(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = A_Z_XPATH)
	public WebElement az;

	@FindBy(xpath = VERIFY1_XPATH)
	public WebElement verify1;

	public ESFurnitureAZFilter gotoRomanianFurniture() {
		romanianFurniture.click();

		return new ESFurnitureAZFilter(this.driver);
	}

	public ESFurnitureAZFilter sortByAZ() throws InterruptedException {
		sortBy.click();
		new ESFurnitureAZFilter(this.driver);
		Thread.sleep(5000);
		az.click();
		return new ESFurnitureAZFilter(this.driver);
	}

}
