package com.web365.esfurniture.language;

import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.LANGUAGE_XPATH;
import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.PUC_XPATH;
import static com.web365.esfurniture.language.ESFurnitureLanguageConstants.VERIFY19_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurniturePuc extends ESFurnitureBasePage {

	public ESFurniturePuc(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = LANGUAGE_XPATH)
	public WebElement language;

	@FindBy(xpath = PUC_XPATH)
	public WebElement puc;

	@FindBy(xpath = VERIFY19_XPATH)
	public WebElement verify19;

	public ESFurniturePuc language() {
		language.click();
		return new ESFurniturePuc(this.driver);
	}

	public ESFurniturePuc puc() {
		puc.click();
		return new ESFurniturePuc(this.driver);
	}

}
