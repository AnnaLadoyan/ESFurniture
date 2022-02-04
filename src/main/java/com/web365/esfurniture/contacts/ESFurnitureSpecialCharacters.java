package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.SPECIAL_CHARACTERS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY29_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureSpecialCharacters extends ESFurnitureBasePage {

	public ESFurnitureSpecialCharacters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = NAME_FIELD_XPATH)
	public WebElement nameField;

	@FindBy(xpath = VERIFY29_XPATH)
	public WebElement verify29;

	public ESFurnitureSpecialCharacters contacts() {
		contacts.click();
		return new ESFurnitureSpecialCharacters(this.driver);
	}

	public ESFurnitureSpecialCharacters SpecialCharactersField() {
		nameField.click();
		return new ESFurnitureSpecialCharacters(this.driver);
	}

	public ESFurnitureSpecialCharacters SpecialCharactersLetters() {
		nameField.sendKeys("annaladoyan1989@yahoo.com");
		return new ESFurnitureSpecialCharacters(this.driver);
	}

}
