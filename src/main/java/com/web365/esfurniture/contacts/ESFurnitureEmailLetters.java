package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.EMAIL_FIELD_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY27_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureEmailLetters extends ESFurnitureBasePage {

	public ESFurnitureEmailLetters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = EMAIL_FIELD_XPATH)
	public WebElement emailLetters;

	@FindBy(xpath = VERIFY27_XPATH)
	public WebElement verify27;

	public ESFurnitureEmailLetters contacts() {
		contacts.click();
		return new ESFurnitureEmailLetters(this.driver);
	}

	public ESFurnitureEmailLetters emailField() {
		emailField.click();
		return new ESFurnitureEmailLetters(this.driver);
	}

	public ESFurnitureEmailLetters emailLetters() {
		emailField.sendKeys("annaladoyans");
		return new ESFurnitureEmailLetters(this.driver);
	}

}
