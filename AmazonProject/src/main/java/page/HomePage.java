package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Variable Declaration
	
	@FindBy (xpath = "//a[text()='Mobiles']")
	private WebElement mobileClick;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement searchText;
	
	@FindBy (xpath = "(//input[@type='submit'])[1]")
	private WebElement clickmagnifier;
	
	
	@FindBy (xpath = "(//span[@class='s-color-swatch-inner-circle-border'])[1]")
	private WebElement imageClick;
	//div[@cel_widget_id='MAIN-SEARCH_RESULTS-4']
	//(//img[@class='s-image'])[1]

	@FindBy (xpath = "(//div[@id='centerCol']//a//span)[2]")
	private WebElement textcenterColRating ;
	
	@FindBy (xpath = "//span[text()='Add to Cart']")
	private WebElement textAddtoCart ;
	
	@FindBy(xpath = "//input[@id=' add-to-cart-button']")
	private WebElement addToCart;
	
    private WebDriver driver;
    private  JavascriptExecutor js;
    
	//Variable Initialization
	 public HomePage (WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 this.driver = driver;
	 }
		
		
	//Variable use
		
	public void clickMobile() {
		mobileClick.click();
	}
	
	public void sendText() {
		searchText.sendKeys("Oneplus");
	}
	
	public void clickmagnifier() {
		clickmagnifier.click();
	}
	
	public void clickimage() {
	//	js = (JavascriptExecutor)driver;
	//	js.executeScript("arguement[0].scrollIntoView(true)",imageClick);
		imageClick.click();

	}
	  
	public String getTexttextcenterColRating() {
		String text =  textcenterColRating.getText();
		return text;
	}
	
	public String getTexttextAddtoCart () {
    	String text = textAddtoCart .getText();
		return text;
    }

	public void clickbutton() {
		
	  //  addToCart.click();
    	js = (JavascriptExecutor)driver;
		js.executeScript("arguement[0].scrollIntoView(true)",addToCart);
		addToCart.click();
		
	}
	
	
}
