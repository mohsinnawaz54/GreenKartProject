package testCases;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.DelieveryAddress;
import pageObjects.PlaceOrder;

public class TC_001_LaunchingAndAddToCart extends BaseClass {
	
	@Test
	public void AddToCart() throws InterruptedException {

		
		driver.get(baseURL);
		pageObjects.AddToCart add = new pageObjects.AddToCart(driver);
		add.getLabelsList();
		add.getIConClick();
		add.getCheckout();
		
		PlaceOrder place= new PlaceOrder(driver);
		
		place.getProcode("rahulshettyacademy");
		place.getPromoBtn();
		place.getInfo();
		place.getOrder();
		DelieveryAddress delievery = new DelieveryAddress(driver);
		delievery.getOrder();
		delievery.Selectcheckbox();
		delievery.getProceed();
		
		
	}
	
	
		
		
	}


