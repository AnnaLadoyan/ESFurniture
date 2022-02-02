package com.web365.esfurniture.page.romanianfurniture;

import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.LOBBY_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.ROMAINIAN_FURNITURE_XPATH;
import static com.web365.esfurniture.page.romanianfurniture.ESFurnitureRomanianFurniturePageConstants.VERIFY13_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureLobbyFurniture extends ESFurnitureBasePage {
	


	public ESFurnitureLobbyFurniture(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ROMAINIAN_FURNITURE_XPATH)
	public WebElement romanianFurniture;

	@FindBy(xpath = LOBBY_FURNITURE_XPATH)
	public WebElement lobbyFurniture;

	@FindBy(xpath = VERIFY13_XPATH)
	public WebElement verify13;

	public ESFurnitureLobbyFurniture gotoRomanianFurniture() {
		romanianFurniture.click();
		return new ESFurnitureLobbyFurniture(this.driver);
	}

	public ESFurnitureLobbyFurniture lobbyFurniture() {
		lobbyFurniture.click();
		return new ESFurnitureLobbyFurniture(this.driver);
	}

	

}
