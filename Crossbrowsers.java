package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowsers {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cbw = new ChromeDriver();
		cbw.get("https://www.google.com");
		cbw.navigate().to("https://amazon.in");
		cbw.navigate().back();
		Thread.sleep(1000);
		cbw.navigate().forward();
	
		
		
		
		
		//		FirefoxDriver cbt = new FirefoxDriver();
//		cbt.get("https://www.flipkart.com");
		
		

	}

}
