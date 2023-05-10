package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	//Veriable Decleration
		@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
		private WebElement onePlusMobile ;
		
		@FindBy (xpath = "//input[@id='nav-search-submit-button']")
		private WebElement serchButton ;
		
		@FindBy (xpath = "(//span[text()='FREE Delivery by Amazon'])[3]")
		private WebElement text114497 ;
		
		@FindBy (xpath = "(//span[@class='s-color-swatch-inner-circle-border'])[1]")
		private WebElement innerCircleBorderButton ;
		
		@FindBy (xpath = "(//div[@id='centerCol']//a//span)[2]")
		private WebElement textcenterColRating ;
		
		@FindBy (xpath = "//span[text()='Add to Cart']")
		private WebElement textAddtoCart ;
		
		@FindBy (xpath = "//input[@id='add-to-cart-button']")
		private WebElement addToCart ;
		
		@FindBy (xpath = "//span[text()='Proceed to checkout (1 item)']")
		private WebElement ProceedtoCheckout ;
		
//		@FindBy (xpath = "(//input[@class='a-button-input'])[33]")
//		private WebElement cartButton ;
		
		@FindBy (xpath = "//span[@id='attach-sidesheet-checkout-button']")
		private WebElement proceedBuy ;
		
		@FindBy (xpath = "//span[text()=' Cart ']")
		private WebElement textCart ;
		
		@FindBy (xpath = "//h5[text()='New to Amazon?']")
		private WebElement textNewtoAmazon ;
		
		@FindBy (xpath = "//a[text()='Conditions of Use']")
		private WebElement textbyContinuing ;
		
		
		private WebDriver driver ;
		private JavascriptExecutor js ;//span[text()='Add to Cart']

	    public AddToCart (WebDriver driver) {
		       PageFactory.initElements(driver, this);
		       this.driver = driver ;
	    }

	    
	    public void sendonePlusMobile() {
	    	onePlusMobile.sendKeys("onePlusMobile");
	    }
	    
	    public void clickserchButton () {
	        serchButton.click();
	    }
	    
	    public String getTexttext114497 () {
	    	String text = text114497.getText();
			return text;
	    }
	    
	    public void scrollclickinnerCircleBorderButton () {
	    //	innerCircleBorderButton.click();
	    	js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].scrollIntoView(true);",innerCircleBorderButton );
	    	innerCircleBorderButton.click();
	    }
	    
	    public String getTexttextcenterColRating () {
	    	String text = textcenterColRating.getText();
			return text;
	    }
	    
	    public String getTexttextAddtoCart () {
	    	String text = textAddtoCart.getText();
			return text;
	    }
	    
	    public void scrollclickaddToCart () {
	    	js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].scrollIntoView(true);",addToCart );
	    	addToCart.click();
	    }
	    
//	    public void clickcartButton () {
//	    	cartButton.click();
//	    }
	    
	    public  String getTextProceedtoCheckout () {
	        String text = ProceedtoCheckout.getText();
			return text;	
	    }
	    
	    public String getTexttextCart () {
	    	String text = textCart.getText();
			return text;
	    }
	    
	    public void clickProceedBuy () {
	    	proceedBuy.click();
	    }
	    
	    public String getTexttextNewtoAmazon() {
	    	String text = textNewtoAmazon.getText();
			return text;
	    }
	    
	    public String getTexttextbyContinuing  () {
	    	String text =textbyContinuing.getText();
	    	return text ;
	    	
	    }
}

