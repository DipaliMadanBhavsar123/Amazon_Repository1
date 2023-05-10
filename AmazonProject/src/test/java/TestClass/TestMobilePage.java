package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page.MobilePage;

public class TestMobilePage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Dipali Velocity Pune Katraj\\Akash Yeole-Automation\\Selenium\\new chromedriver_win32 (1)\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(ops);
		
	    driver.get("https://www.amazon.in/");
		
	    MobilePage mobilePage = new  MobilePage(driver);
	    
	    mobilePage.clickbutton();
	    
	
		
		
		
	}

	

}
