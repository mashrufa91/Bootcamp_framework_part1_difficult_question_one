package com.tn.qa.loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tn.part1_login_page.AccountPage;
import com.tn.part1_login_page.HomePage;
import com.tn.part1_login_page.Loginpage;
import com.tn.qa.testBase.TestBase;

public class LoginTest extends TestBase {

	public WebDriver driver;
	public Loginpage loginpage;
	public HomePage homepage;
	public AccountPage accountpage;
	
	@BeforeMethod
	public void setup() {
		driver = initalizeBrowserAndOpenApplication();
		homepage = new HomePage(driver);
		homepage.clickOnMyAccountDropMenu();
		loginpage = homepage.selectLoginOption(); //here system will be re-directed to LoginPage
	}
	
	
	@Test()
	public void verifyLoginWithValidCredentials() {
		loginpage = new Loginpage(driver);
		loginpage.enterEmailAddress();
		loginpage.enterPassword();
		loginpage.clickOnLoginButton();
		
		Assert.assertTrue(accountpage.getDisplayStatusOfEditAccountInfo());		
	}
	
	
	
	
}
