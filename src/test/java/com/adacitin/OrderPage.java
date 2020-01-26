package com.adacitin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends Base {
	
	public OrderPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement OrderNo;

	public WebElement getOrderNo() {
		return OrderNo;
	}
	

}
