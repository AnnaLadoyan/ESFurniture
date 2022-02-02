package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.KITCHEN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY6_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnituerKitchenFurniture extends ESFurnitureBasePage {
	
	public ESFurnituerKitchenFurniture(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = KITCHEN_FURNITURE_XPATH)
	public WebElement kitchenFurniture;

	@FindBy(xpath = VERIFY6_XPATH)
	public WebElement verify6;

	public ESFurnituerKitchenFurniture gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnituerKitchenFurniture(this.driver);
	}

	public ESFurnituerKitchenFurniture KitchenFurniture() {
		kitchenFurniture.click();
		return new ESFurnituerKitchenFurniture(this.driver);
	}

	


}
