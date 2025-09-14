package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver tib  = new ChromeDriver();
		tib.get("https://www.irctc.co.in/nget/train-search");
		tib.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(5000);
		tib.findElement(By.xpath("//span[@class='ng-tns-c58-8 ui-autocomplete ui-widget']")).sendKeys("MAS"); 
		
//		tib.findElement(By.xpath("//div/ul/li[@")).click();
//		Select from=new Select(tib.findElement(By.xpath("//div/ul/li/span[text()=' MGR CHENNAI CTL - MAS ']")));
//		from.selectByVisibleText("MGR CHENNAI CTL - MAS (CHENNAI)");
//		Select cls=new Select(tib.findElement(By.xpath("//p-dropdownitem/li/span[text()='All Classes']")));
//		cls.selectByVisibleText("AC 3 Economy (3E)");
//		tib.findElement(By.xpath("//p-calendar[@id='jDate']")).click();
//		tib.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c59-10 ng-star-inserted']")).click();
//		tib.findElement(By.xpath("//a[text()='5']")).click();
//		
		
			
		
	}

}
