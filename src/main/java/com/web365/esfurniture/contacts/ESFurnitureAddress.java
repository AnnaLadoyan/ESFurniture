package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.INFORMATION_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY18_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureAddress extends ESFurnitureBasePage {

	public ESFurnitureAddress(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = INFORMATION_XPATH)
	public WebElement information;

	@FindBy(xpath = VERIFY18_XPATH)
	public WebElement verify18;

	public ESFurnitureAddress contacts() {
		contacts.click();
		return new ESFurnitureAddress(this.driver);
	}

	public ESFurnitureAddress information() {
		information.click();
		return new ESFurnitureAddress(this.driver);
	}

}
