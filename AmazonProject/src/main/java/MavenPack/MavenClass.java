package MavenPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MavenClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Dipali Velocity Pune Katraj\\Akash Yeole-Automation\\Selenium\\new chromedriver_win32 (1)\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
	}

	
	
	}


