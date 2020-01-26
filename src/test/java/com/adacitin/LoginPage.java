package com.adacitin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") 
	private WebElement name;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement click;

	public WebElement getName() {
		return name;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClick() {
		return click;
	}
	
	

}
