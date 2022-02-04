package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.L_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY24_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureSizeL extends ESFurnitureBasePage {
	
	
public ESFurnitureSizeL(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
public WebElement romanianFurniture;

@FindBy(xpath = L_XPATH)
public WebElement sizeLFurniture;

@FindBy(xpath = VERIFY24_XPATH)
public WebElement verify24;

public ESFurnitureSizeL gotoRomanianFurniture() {
	romanianFurniture.click();
	return new ESFurnitureSizeL(this.driver);
}

public ESFurnitureSizeL sizeLFurniture() {
	sizeLFurniture.click();
	return new ESFurnitureSizeL(this.driver);
}


}
