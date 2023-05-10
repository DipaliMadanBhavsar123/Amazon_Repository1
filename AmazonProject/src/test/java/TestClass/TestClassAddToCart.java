package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import page.AddToCartPage;

public class TestClassAddToCart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Dipali Velocity Pune Katraj\\Akash Yeole-Automation\\Selenium\\new chromedriver_win32 (1)\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
	 //   AddToCartPage addToCart = new  AddToCartPage(driver);
		
	  //  addToCart.deleteButton();
		
		
	}
	
}
