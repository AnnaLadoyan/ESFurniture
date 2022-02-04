package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.PHONE_NUMBER_FIELD_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY30_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurniturePhoneNumberField extends ESFurnitureBasePage {

	public ESFurniturePhoneNumberField(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = PHONE_NUMBER_FIELD_XPATH)
	public WebElement nameField;

	@FindBy(xpath = VERIFY30_XPATH)
	public WebElement verify30;

	public ESFurniturePhoneNumberField contacts() {
		contacts.click();
		return new ESFurniturePhoneNumberField(this.driver);
	}

	public ESFurniturePhoneNumberField NumberField() {
		phoneNumberField.click();
		return new ESFurniturePhoneNumberField(this.driver);
	}

	public ESFurniturePhoneNumberField phoneNumberField() {
		phonenumberField.sendKeys("9162937485");
		return new ESFurniturePhoneNumberField(this.driver);
	}

}
