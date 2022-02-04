package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.OFFICE_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY23_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureOfficeFurniture extends ESFurnitureBasePage {
	
		
	public ESFurnitureOfficeFurniture(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = OFFICE_FURNITURE_XPATH)
	public WebElement officeFurniture;

	@FindBy(xpath = VERIFY23_XPATH)
	public WebElement verify23;

	public ESFurnitureOfficeFurniture gotoOfficeFurniture() {
		romanianFurniture.click();
		return new ESFurnitureOfficeFurniture(this.driver);
	}

	public ESFurnitureOfficeFurniture officeFurniture() {
		officeFurniture.click();
		return new ESFurnitureOfficeFurniture(this.driver);
	}

	


}
