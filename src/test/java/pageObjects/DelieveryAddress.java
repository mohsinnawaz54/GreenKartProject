package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DelieveryAddress {
	public WebDriver driver;
	public DelieveryAddress(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement country;
	
	@FindBy(css = "[type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement proceed;
	
	
	public void getOrder() {
		Select s = new Select(country);
		s.selectByValue("Albania");
		
		
	}
	public void Selectcheckbox() {
		
		checkbox.click();
	}
	
	public void getProceed() {
	
		proceed.click();
	}
		
	
	
	

}
