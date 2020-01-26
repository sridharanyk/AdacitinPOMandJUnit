package com.adacitin;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;

public class Write extends Base {
	
	@BeforeClass
	public static void launch() {
		
		getDriver();
		
		launchUrl("https://adactin.com/HotelApp/");
		
		driver.manage().window().maximize();
	}
		//Login Page
		@Test		
		
		public void tc1() throws Throwable {
			
			LoginPage page = new LoginPage();
		
		Base.type(page.getName(), ExcelRead.getData(1, 0));
		
		Base.type(page.getPass(), ExcelRead.getData(1, 1));
		
		Base.clicking(page.getClick());
		
		}
		//SearchPage
		
		@Test		
		
		public void tc2() throws Throwable {
		
			SearchPage page1 = new SearchPage();
		
		Base.clicking(page1.getLocate());
		
		Base.keyboard();
		
		Base.clicking(page1.getHotel());
		
		Base.keyboard1();
		
		Base.clicking(page1.getRoom());
		
		Base.keyboard2();
		
		Base.clicking(page1.getNoOfRooms());
		
		Base.keyboard3();
		
		Base.type(page1.getCheckInDate(), ExcelRead.getData(1, 2));
		
		Base.type(page1.getCheckOutDate(), ExcelRead.getData(1, 3));
		
		Base.clicking(page1.getNoOfPersons());
		
		Base.keyboard2();
		
		Base.clicking(page1.getNoOfChild());
		
		Base.keyboard1();
		
		Base.clicking(page1.getClick());
		
		}
		//SelectHotelPage
		
		@Test		
		
		public void tc3() {
		
			SelectHotelPage page2 = new SelectHotelPage();
		
		Base.clicking(page2.getRadioButton());
		
		Base.clicking(page2.getButton());
		
		}
		
		//BookHotelPage
		
		@Test		
		
		public void tc4() throws Throwable {
		
			BookHotelPage page3 = new BookHotelPage();
		
		Base.type(page3.getName(), ExcelRead.getData(1, 4));
		
		Base.type(page3.getLastName(), ExcelRead.getData(1, 5));
		
		Base.type(page3.getAddress(), ExcelRead.getData(1, 6));
		
		Base.type(page3.getCrdtNo(), ExcelRead.getData(1, 7));
		
		Base.clicking(page3.getCrdtType());
		
		Base.keyboard1();
		
		Base.selecting(page3.getCrdtMonth(), ExcelRead.getData(1, 8));
		
		Base.selecting(page3.getCrdtYear(), ExcelRead.getData(1, 9));
		
		Base.type(page3.getCVVNo(), ExcelRead.getData(1, 10));
		
		Base.clicking(page3.getSubmit());
		
		}
		
		@Test		
		
		public void tc5() {
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
			OrderPage page4 = new OrderPage();
			
		System.out.println(Base.getAttribute(page4.getOrderNo()));
		
	
		}

}
