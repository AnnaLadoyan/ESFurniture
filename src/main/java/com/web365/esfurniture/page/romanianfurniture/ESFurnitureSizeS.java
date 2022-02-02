package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.S_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY3_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureSizeS extends ESFurnitureBasePage {

	public ESFurnitureSizeS(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = S_XPATH)
	public WebElement sizeSFurniture;

	@FindBy(xpath = VERIFY3_XPATH)
	public WebElement verify3;

	public ESFurnitureSizeS gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnitureSizeS(this.driver);
	}

	public ESFurnitureSizeS sizeSFurniture() {
		sizeSFurniture.click();
		return new ESFurnitureSizeS(this.driver);
	}

}
