package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.INFORMATION_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY16_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.filter.ESFurnitureLastAddedFilter;
import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurniturePhoneNumber extends ESFurnitureBasePage {
	
	
public ESFurniturePhoneNumber(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

@FindBy(xpath = CONTACTS_XPATH)
public WebElement contacts;

@FindBy(xpath = INFORMATION_XPATH)
public WebElement information;

@FindBy(xpath = VERIFY16_XPATH)
public WebElement verify16;

public ESFurniturePhoneNumber contacts() {
contacts.click();
	return new ESFurniturePhoneNumber(this.driver);
}

public ESFurniturePhoneNumber information() {
	information.click();
	return new ESFurniturePhoneNumber(this.driver);
}


}
