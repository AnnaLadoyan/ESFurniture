package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.NUMBER_FIELD_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY31_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurniturePhoneNumberFieldSpecialCharacters extends ESFurnitureBasePage {

	public ESFurniturePhoneNumberFieldSpecialCharacters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = NUMBER_FIELD_XPATH)
	public WebElement numberField;

	@FindBy(xpath = VERIFY31_XPATH)
	public WebElement verify31;

	public ESFurniturePhoneNumberFieldSpecialCharacters contacts() {
		contacts.click();
		return new ESFurniturePhoneNumberFieldSpecialCharacters(this.driver);
	}

	public ESFurniturePhoneNumberFieldSpecialCharacters SpecialCharactersField() {
		numberField.click();
		return new ESFurniturePhoneNumberFieldSpecialCharacters(this.driver);
	}

	public ESFurniturePhoneNumberFieldSpecialCharacters SpecialCharactersLetters() {
		numberField.sendKeys("(916) 293 - 7485");
		return new ESFurniturePhoneNumberFieldSpecialCharacters(this.driver);
	}

}
