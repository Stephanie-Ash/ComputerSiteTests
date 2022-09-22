package com.qa.comptests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id = "searchbox")
	WebElement computerSearchInputBox;
	
	@FindBy(id = "searchsubmit")
	WebElement filterSearchButton;
	
	@FindBy(id = "add")
	WebElement addComputerButton;
	
	@FindBy(xpath = "//h1/a")
	WebElement homePageHeader;
	
	@FindBy(xpath = "//a[contains(text(), 'TestCompNameSA')]")
	WebElement foundComputer;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchForComputer(String computerName) {
		computerSearchInputBox.clear();
		computerSearchInputBox.sendKeys(computerName);
		filterSearchButton.click();
	}
	
	public void goToEditComputerPage() {
		foundComputer.click();
	}
	
	public void goToAddComputerPage() {
		addComputerButton.click();
	}
	
	public String getPageHeading() {
		return homePageHeader.getText();
	}

}
