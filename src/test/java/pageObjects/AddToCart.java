package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.formula.functions.WeekdayFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	public WebDriver driver;
	public AddToCart(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h4.product-name" )
	public List<String> selects;
	
	
	@FindBy(xpath = "//div[@class='product-action']/button")
	public List<String> clickOne;
	
	
	@FindBy(css = "a.cart-icon")
	WebElement icon;
	
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkout;
	


//	public void getAdded(WebElement select ) {
//	select.
	public List<WebElement> getLabelsList() {
	    //create an empty list in which the label texts will be stored
		String[] name = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };
	    //iterate through all the webElements
		List<WebElement> productItems = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < productItems.size(); i++) {
			String[] alpha = productItems.get(i).getText().split("-");
			String formatedName = alpha[0].trim();

			List products = Arrays.asList(name);

			if (products.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	    }
	    //return all the label texts that are visible in the dropdown
	    
	
	
}
		return productItems;
	
	}
	public void getIConClick() {
		
		icon.click();
	}
	
	public void getCheckout() {
		
		checkout.click();
	}
	
	
	
	}

