package com.adacitin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	public static WebDriver driver;
	
		
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Sridharan9AMProjectBatch\\Adacitin\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
}
	public static void clicking(WebElement element) {
		element.click();
	}
	public static void keyboard() throws Throwable {
		Robot r = new Robot();
		for (int i = 0; i <=4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void keyboard1() throws Throwable {
		Robot r = new Robot();
		for (int i = 0; i <=1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void keyboard2() throws Throwable {
		Robot r = new Robot();
		for (int i = 0; i <=3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void keyboard3() throws Throwable {
		Robot r = new Robot();
		for (int i = 0; i <=9; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void JavaClicking(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()");	
	}
	
	public static void selecting(WebElement element, String name ) {
		Select s = new Select(element);
		s.selectByVisibleText(name);
		
	}
	
	public static String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		
		
		return attribute;
		
		

	}
	
	

}
