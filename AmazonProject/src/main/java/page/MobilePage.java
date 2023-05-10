package page;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	
	
	//Variable Initialization
		public MobilePage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		
		
	//Variable use
		
	public void clickbutton() {
	addToCart.click();
	}
		
		
		
		
	}
		
		
		
		
		
		
		
		

