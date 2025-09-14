package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectorshub {
	
	public static void main(String[] args) {
		
		
		ChromeDriver selhub = new ChromeDriver();
		selhub.get("https://selectorshub.com/xpath-practice-page/");
		//selhub.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@email.com");
		selhub.findElement(By.xpath("//label[text()='User Email']//following-sibling::input[@type='email']")).sendKeys("abc@email.com");
		//selhub.findElement(By.xpath("//input[@name='Password']")).sendKeys("abc12345");
		selhub.findElement(By.xpath("//label[text()='Password']//following-sibling::input[@type='password']")).sendKeys("abc12345");
		//selhub.findElement(By.xpath("(//input[@name='company'])[1]")).sendKeys("Technocode");
		selhub.findElement(By.xpath("//div[@class='element-companyId']//following-sibling::input[@name ='company']")).sendKeys("ABC Compmay");
		selhub.findElement(By.xpath("//div[@class='element-companyId']//input[@name='mobile number']")).sendKeys("0123465789");
		selhub.findElement(By.xpath("//label[text()='Country']/input[@type='text']")).sendKeys("India");
		selhub.findElement(By.xpath("//button[@value='Submit']")).click();
				
	}

}
