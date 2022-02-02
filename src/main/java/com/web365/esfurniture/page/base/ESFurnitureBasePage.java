package com.web365.esfurniture.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ESFurnitureBasePage {
	
	protected WebDriver driver;
	
	public ESFurnitureBasePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}

}
