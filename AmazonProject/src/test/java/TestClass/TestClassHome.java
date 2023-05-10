package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.HomePage;

public class TestClassHome {
	
	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver", "D:\\Dipali Velocity Pune Katraj\\Akash Yeole-Automation\\Selenium\\new chromedriver_win32 (1)\\chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver", "D:\\Dipali Velocity Pune Katraj\\Akash Yeole-Automation\\Selenium FireFox\\geckodriver-v0.32.2-win32\\geckodriver.exe");
       //  System.setProperty("webdriver.edge.driver", "D:\\Dipali Velocity Pune Katraj\\Akash Yeole-Automation\\Selenium Microsoft Edge\\edgedriver_win64\\msedgedriver.exe");
//		ChromeOptions ops = new ChromeOptions();
//        ops.addArguments("--remote-allow-origins=*");
//
		 WebDriver driver = new ChromeDriver();
		
       //  WebDriver driver = new FirefoxDriver(); 
       //    WebDriver driver = new EdgeDriver();
         
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		HomePage homepage = new HomePage(driver);
		homepage.clickMobile();
		homepage.sendText();
		homepage.clickmagnifier();
		homepage.clickimage();
		Thread.sleep(3000);
		homepage.getTexttextcenterColRating();
		homepage.getTexttextAddtoCart();
		homepage.clickbutton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
