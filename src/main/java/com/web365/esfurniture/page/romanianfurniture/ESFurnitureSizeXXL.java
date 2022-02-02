package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.XXL_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY9_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureSizeXXL extends ESFurnitureBasePage {

public ESFurnitureSizeXXL(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
public WebElement romanianFurniture;

@FindBy(xpath = XXL_XPATH)
public WebElement sizeXXLFurniture;

@FindBy(xpath = VERIFY9_XPATH)
public WebElement verify9;

public ESFurnitureSizeXXL gotoRomanianFurniture() {
	romanianFurniture.click();
	return new ESFurnitureSizeXXL(this.driver);
}

public ESFurnitureSizeXXL sizeXXLFurniture() {
	sizeXXLFurniture.click();
	return new ESFurnitureSizeXXL(this.driver);
}


}
