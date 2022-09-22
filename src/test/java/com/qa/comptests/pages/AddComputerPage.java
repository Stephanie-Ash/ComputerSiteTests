package com.qa.comptests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddComputerPage {
	
	WebDriver driver;
	
	@FindBy(id = "name")
	WebElement computerNameInputBox;
	
	@FindBy(xpath = "//input[@value='Create this computer']")
	WebElement createComputerButton;
	
	public AddComputerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addComputer(String computerName) {
		computerNameInputBox.sendKeys(computerName);
		createComputerButton.click();
	}
	

}
