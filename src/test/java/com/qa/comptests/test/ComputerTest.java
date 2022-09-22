package com.qa.comptests.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.comptests.pages.AddComputerPage;
import com.qa.comptests.pages.EditComputerPage;
import com.qa.comptests.pages.HomePage;

public class ComputerTest {
	
	WebDriver driver;
	AddComputerPage addComputerPage;
	HomePage homePage;
	EditComputerPage editPage;
	
	@BeforeTest
	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\littl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
	}
	
	@Test(priority = 1)
	public void createComputerTest() {
		homePage = new HomePage(driver);
		homePage.goToAddComputerPage();
		addComputerPage = new AddComputerPage(driver);
		addComputerPage.addComputer("TestCompNameSA");
	}
	
	@Test(priority = 2, dependsOnMethods = "createComputerTest")
	public void searchComputerTest() {
		homePage.searchForComputer("TestCompNameSA");
	}
	
	@Test(priority = 3, dependsOnMethods = "searchComputerTest")
	public void deleteComputerTest() {
		homePage.searchForComputer("TestCompNameSA");
		homePage.goToEditComputerPage();
		editPage = new EditComputerPage(driver);
		editPage.deleteComputer();
	}
	
	

}
