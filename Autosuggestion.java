package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver amz = new ChromeDriver();
//		amz.get("https://www.amazon.in/");
//		amz.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		
		amz.get("https://www.google.com/");
		amz.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> elements = amz.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		
		Thread.sleep(5000);
		for (WebElement var1:elements) {
			
			if(var1.getText().equals("selenium testing")) {
				var1.click();
				break;
			}
			
		}
		
	}

}
