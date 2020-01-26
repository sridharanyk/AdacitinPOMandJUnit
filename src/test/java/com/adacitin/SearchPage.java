package com.adacitin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base {
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement Locate;
	
	@FindBy(id="hotels")
	private WebElement Hotel;
	
	@FindBy(id="room_type")
	private WebElement Room;
	
	@FindBy(id="room_nos")
	private WebElement NoOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement NoOfPersons;
	
	@FindBy(id="child_room")
	private WebElement NoOfChild;
	
	@FindBy(id="Submit")
	private WebElement click;
	
	
	public WebElement getClick() {
		return click;
	}

	public WebElement getNoOfChild() {
		return NoOfChild;
	}

	public WebElement getNoOfPersons() {
		return NoOfPersons;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public WebElement getRoom() {
		return Room;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getLocate() {
		return Locate;
	}
	
	
	
	
	

}
