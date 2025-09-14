package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver amz = new ChromeDriver();
		amz.manage().window().maximize();
		amz.get("https://www.amazon.in/");
//		amz.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
//		amz.findElement(By.id("nav-search-submit-button")).click();
		
		//amz.findElement(By.linkText("Bestsellers")).click();
		// TODO Auto-generated method stub
		
		
		//amz.findElement(By.partialLinkText("Best")).click();
		amz.findElement(By.xpath("//input[@type='text']")).sendKeys("computers");
	}

}
