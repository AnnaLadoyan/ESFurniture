package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.BEDROOM_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY10_XPATH;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureBedroomFurniture extends ESFurnitureBasePage {
	
	public ESFurnitureBedroomFurniture(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}


	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = BEDROOM_FURNITURE_XPATH)
	public WebElement bedroomFurniture;

	@FindBy(xpath = VERIFY10_XPATH)
	public WebElement verify10;

	public ESFurnitureBedroomFurniture gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnitureBedroomFurniture(this.driver);
	}

	public ESFurnitureBedroomFurniture bedroomFurniture() {
		bedroomFurniture.click();
		return new ESFurnitureBedroomFurniture(this.driver);
	}

	
}
