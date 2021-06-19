package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.AddToCart;



public class BaseClass{
	public String baseURL ="https://rahulshettyacademy.com/seleniumPractise/#/";
	
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		
}
	

}
