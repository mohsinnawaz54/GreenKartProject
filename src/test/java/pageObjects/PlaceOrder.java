package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	public WebDriver driver;
	public PlaceOrder(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".promoCode")
	WebElement code;
	
	@FindBy(css = ".promoBtn")
	WebElement button;
	
	@FindBy(css = ".promoInfo")
	WebElement pinfo;
	
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	WebElement  order;
	
	
	public void getProcode(String info) {
		code.sendKeys(info);
		
	}
	
	public void getPromoBtn() {
		button.click();
		
	}
	
	public void getInfo() {
		System.out.println(pinfo.getText());
		
	}
	
	public void getOrder() {
		order.click();
		
	}
	

}
