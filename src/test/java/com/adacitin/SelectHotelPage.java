package com.adacitin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends Base {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="radiobutton_0")
	private WebElement RadioButton;

	public WebElement getRadioButton() {
		return RadioButton;
	}
	

	
	@FindBy(id="continue")
	private WebElement Button;

	public WebElement getButton() {
	
		return Button;
	}
	
}



