package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.INFORMATION_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY17_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureWorkingHours extends ESFurnitureBasePage {

	public ESFurnitureWorkingHours(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = INFORMATION_XPATH)
	public WebElement information;

	@FindBy(xpath = VERIFY17_XPATH)
	public WebElement verify17;

	public ESFurnitureWorkingHours contacts() {
		contacts.click();
		return new ESFurnitureWorkingHours(this.driver);
	}

	public ESFurnitureWorkingHours information() {
		information.click();
		return new ESFurnitureWorkingHours(this.driver);
	}

}
