package com.adacitin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends Base {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement Name;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CrdtNo;
	
	@FindBy(id="cc_type")
	private WebElement CrdtType;
	
	@FindBy(id="cc_exp_month")
	private WebElement CrdtMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement CrdtYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVVNo;
	
	@FindBy(id="book_now")
	private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCrdtNo() {
		return CrdtNo;
	}

	public WebElement getCrdtType() {
		return CrdtType;
	}

	public WebElement getCrdtMonth() {
		return CrdtMonth;
	}

	public WebElement getCrdtYear() {
		return CrdtYear;
	}

	public WebElement getCVVNo() {
		return CVVNo;
	}
	
	
	
	
	

}
