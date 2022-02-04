package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.NUMBERS_FIELD_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY28_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureEmailNumbers extends ESFurnitureBasePage {

	public ESFurnitureEmailNumbers(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = NUMBERS_FIELD_XPATH)
	public WebElement numbersField;

	@FindBy(xpath = VERIFY28_XPATH)
	public WebElement verify28;

	public ESFurnitureEmailNumbers contacts() {
		contacts.click();
		return new ESFurnitureEmailNumbers(this.driver);
	}

	public ESFurnitureEmailNumbers emailField() {
		numbersField.click();
		return new ESFurnitureEmailNumbers(this.driver);
	}

	public ESFurnitureEmailNumbers emailNumbers() {
		numbersField.sendKeys("annaladoyan1989");
		return new ESFurnitureEmailNumbers(this.driver);
	}

}
