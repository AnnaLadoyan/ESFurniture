package com.web365.esfurniture.language;

import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.HAY_XPATH;
import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.LANGUAGE_XPATH;
import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.VERIFY21_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureHay extends ESFurnitureBasePage {

	public ESFurnitureHay(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = LANGUAGE_XPATH)
	public WebElement language;

	@FindBy(xpath = HAY_XPATH)
	public WebElement hay;

	@FindBy(xpath = VERIFY21_XPATH)
	public WebElement verify21;

	public ESFurnitureHay language() {
		language.click();
		return new ESFurnitureHay(this.driver);
	}

	public ESFurnitureHay hay() {
		hay.click();
		return new ESFurnitureHay(this.driver);
	}

}
