package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webform{
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver wbf  = new ChromeDriver();
		wbf.get("https://www.selenium.dev/selenium/web/web-form.html");
		wbf.findElement(By.xpath("//input[@name='my-text']")).sendKeys("Kumar");
		wbf.findElement(By.xpath("//input[@name='my-password']")).sendKeys("abc12345");				
		wbf.findElement(By.xpath("//textarea[@name='my-textarea']")).sendKeys("Hello");				
		wbf.findElement(By.xpath("//select/option[@value='1']")).click();	 			
		wbf.findElement(By.xpath("//input[@name='my-datalist']")).sendKeys("San Francisco");	 			
		//wbf.findElement(By.xpath("//datalist/option[@value='San Francisco']")).click();		
		wbf.findElement(By.xpath("//label/input[@id='my-check-2']")).click();		
		wbf.findElement(By.xpath("//label/input[@id='my-radio-2']")).click();		
		wbf.findElement(By.xpath("//input[@name='my-date']")).click();		
		wbf.findElement(By.xpath("(//div/table/tbody/tr/td[text()=10])[1]")).click();		
		
		
		Thread.sleep(5000);
		wbf.findElement(By.xpath("//button[@type='submit']")).click();		
		
		
		
	
		
		
		
		
		
		
		
		
	}
}