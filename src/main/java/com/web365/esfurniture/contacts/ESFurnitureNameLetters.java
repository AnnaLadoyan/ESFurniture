package com.web365.esfurniture.contacts;

import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.CONTACTS_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.NAME_FIELD_XPATH;
import static com.web365.esfurniture.contacts.ESFurnitureContactsConstants.VERIFY26_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.esfurniture.page.base.ESFurnitureBasePage;

public class ESFurnitureNameLetters extends ESFurnitureBasePage {
	
public ESFurnitureNameLetters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

@FindBy(xpath = CONTACTS_XPATH)
public WebElement contacts;

@FindBy(xpath = NAME_FIELD_XPATH)
public WebElement nameField;

@FindBy(xpath = VERIFY26_XPATH)
public WebElement verify26;

public ESFurnitureNameLetters contacts() {
contacts.click();
return new ESFurnitureNameLetters(this.driver);
}

public ESFurnitureNameLetters nameField() {
nameField.click();
return new ESFurnitureNameLetters(this.driver);
}

public ESFurnitureNameLetters nameLetters() {
nameField.sendKeys("Anna");
return new ESFurnitureNameLetters(this.driver);
}



}
