package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.XL_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY25_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureSizeXL extends ESFurnitureBasePage {

	public ESFurnitureSizeXL(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = XL_XPATH)
	public WebElement sizeXLFurniture;

	@FindBy(xpath = VERIFY25_XPATH)
	public WebElement verify25;

	public ESFurnitureSizeXL gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnitureSizeXL(this.driver);
	}

	public ESFurnitureSizeXL sizeXLFurniture() {
		sizeXLFurniture.click();
		return new ESFurnitureSizeXL(this.driver);
	}

}
