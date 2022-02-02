package com.web365.esfurniture.search;

import static com.web365.esfurniture.search.ESFurnitureSearchConstants.SEARCH_ICON_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.INPUT_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.VERIFY15_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureLowercaseLetters extends ESFurnitureBasePage {

	public ESFurnitureLowercaseLetters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;
	
	@FindBy(xpath = INPUT_XPATH)
	public WebElement searchinput;

	@FindBy(xpath = VERIFY15_XPATH)
	public WebElement verify15;

	public ESFurnitureLowercaseLetters SearchIcon() {
		searchIcon.click();
		return new ESFurnitureLowercaseLetters(this.driver);
	}

	public ESFurnitureLowercaseLetters inputClick() {
		searchinput.click();
		return new ESFurnitureLowercaseLetters(this.driver);
	}
	
	public ESFurnitureLowercaseLetters input() {
		searchinput.sendKeys("bedroom");
		return new ESFurnitureLowercaseLetters(this.driver);
	}

	public ESFurnitureLowercaseLetters inputEnter() {
		searchinput.sendKeys(Keys.ENTER);
		return new ESFurnitureLowercaseLetters(this.driver);
	}

}
