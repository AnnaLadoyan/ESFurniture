package com.web365.esfurniture.language;

import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.LANGUAGE_XPATH;
import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.ENG_XPATH;
import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.VERIFY20_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureEng extends ESFurnitureBasePage {

	public ESFurnitureEng(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = LANGUAGE_XPATH)
	public WebElement language;

	@FindBy(xpath = ENG_XPATH)
	public WebElement eng;

	@FindBy(xpath = VERIFY20_XPATH)
	public WebElement verify20;

	public ESFurnitureEng language() {
		language.click();
		return new ESFurnitureEng(this.driver);
	}

	public ESFurnitureEng eng() {
		eng.click();
		return new ESFurnitureEng(this.driver);
	}

}
