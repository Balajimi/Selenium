package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2{
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver atp  = new ChromeDriver();
		atp.get("https://testautomationpractice.blogspot.com/");
		atp.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Kumar");
		atp.findElement(By.xpath("//input[@placeholder='Enter EMail']")).sendKeys("abc@email.com");
		atp.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("0123456789");
		atp.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("No. 20, Gandhi Nagar, Chennai");
		atp.findElement(By.xpath("//input[@id='male']")).click();
		atp.findElement(By.xpath("//input[@id='sunday']")).click();
		atp.findElement(By.xpath("//div/select/option[@value='australia']")).click();
		atp.findElement(By.xpath("//div/select/option[@value='white']")).click();
		atp.findElement(By.xpath("//div/select/option[@value='cheetah']")).click();
		atp.findElement(By.xpath("//input[@id='datepicker']")).click();
		atp.findElement(By.xpath("//div/table/tbody/tr/td/a[text()=10]")).click();
		atp.findElement(By.xpath("//input[@id='txtDate']")).click();
		atp.findElement(By.xpath("//select/option[@value='10']")).click();
		atp.findElement(By.xpath("//td/a[text()=17]")).click();
		atp.findElement(By.xpath("//div/input[@id='start-date']")).sendKeys("05-10-2025");
		atp.findElement(By.xpath("//div/input[@id='end-date']")).sendKeys("20-10-2026");
		atp.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		