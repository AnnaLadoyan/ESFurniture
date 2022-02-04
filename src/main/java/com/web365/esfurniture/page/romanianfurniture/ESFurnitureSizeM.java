package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.M_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY11_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureSizeM extends ESFurnitureBasePage {

	public ESFurnitureSizeM(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = M_XPATH)
	public WebElement sizeMFurniture;

	@FindBy(xpath = VERIFY11_XPATH)
	public WebElement verify11;

	public ESFurnitureSizeM gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnitureSizeM(this.driver);
	}

	public ESFurnitureSizeM sizeMFurniture() {
		sizeMFurniture.click();
		return new ESFurnitureSizeM(this.driver);
	}

}
