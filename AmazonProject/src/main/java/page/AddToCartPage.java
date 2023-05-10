package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
   @FindBy	(xpath = "//div[@class='sc-list-item-content']")
   private WebElement clickText;
   //Display all details in one item

   @FindBy	(xpath = "(//input[@type='submit'])[3]")
   private WebElement clickDeleteButton;
   //add to cart button delete
   
   //Variable Initialization
 	public AddToCartPage (WebDriver driver) {
 		PageFactory.initElements(driver, this);
 	}
   

	//Variable use
 	
   public void visibleText() {
	   clickText.click();
   }
   
   public void deleteButton() {
	   clickDeleteButton.click();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
