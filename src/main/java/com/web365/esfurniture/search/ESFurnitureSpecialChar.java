package com.web365.esfurniture.search;

import static com.web365.esfurniture.search.ESFurnitureSearchConstants.INPUT_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.SEARCH_ICON_XPATH;
import static com.web365.esfurniture.search.ESFurnitureSearchConstants.VERIFY5_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureSpecialChar extends ESFurnitureBasePage {
	

	public ESFurnitureSpecialChar(WebDriver driver) {
		super(driver);
		this.driver = driver;
	
	}

@FindBy(xpath = SEARCH_ICON_XPATH)
public WebElement searchIcon;

@FindBy(xpath = INPUT_XPATH)
public WebElement searchinput;

@FindBy(xpath = VERIFY5_XPATH)
public WebElement verify5;

public ESFurnitureSpecialChar  SearchIcon() {
	searchIcon.click();
	return new ESFurnitureSpecialChar (this.driver);
}

public ESFurnitureSpecialChar  inputClick() {
	searchinput.click();
	return new ESFurnitureSpecialChar (this.driver);
}

public ESFurnitureSpecialChar  input() {
	searchinput.sendKeys("!@#$");
	return new ESFurnitureSpecialChar (this.driver);
}

public ESFurnitureSpecialChar  inputEnter() {
	searchinput.sendKeys(Keys.ENTER);
	return new ESFurnitureSpecialChar (this.driver);
}



}
