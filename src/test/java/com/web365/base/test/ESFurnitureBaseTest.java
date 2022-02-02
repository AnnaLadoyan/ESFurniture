package com.web365.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ESFurnitureBaseTest {

	protected WebDriver driver;

	@BeforeClass
	public void openESFurniture() {
		driver = new ChromeDriver();
		driver.get("http://www.eskahuyq.am/?l=en-US");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
