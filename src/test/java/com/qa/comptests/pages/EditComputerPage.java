package com.qa.comptests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditComputerPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@value='Delete this computer']")
	WebElement deleteComputerButton;
	
	public EditComputerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void deleteComputer() {
		deleteComputerButton.click();
	}

}
