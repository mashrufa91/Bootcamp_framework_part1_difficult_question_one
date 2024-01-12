package com.tn.part1_login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public WebDriver driver;
	
	
	@FindBy(id = "input-email")
	private WebElement emailAddressField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-dismissible')]")
	private WebElement emailPasswordNoMatchWarning;
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);}
		
	
	
	public void enterEmailAddress() {
		emailAddressField.sendKeys("mashrufashanjia100@gmail.com");
	}
	
	public void enterPassword() {
		passwordField.sendKeys("Mashrufa@123");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
