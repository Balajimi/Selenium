package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dpw = new ChromeDriver ();
		dpw.get("https://demo.guru99.com/test/newtours/register.php");
		dpw.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ramesh");
		dpw.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		dpw.findElement(By.xpath("//input[@name='phone']")).sendKeys("0987654321");
		dpw.findElement(By.xpath("//input[@name='userName']")).sendKeys("abc@email.com");
		dpw.findElement(By.xpath("//input[@name='address1']")).sendKeys("No.20, Bharathiyar Street, Chennai- 74");
		dpw.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
		dpw.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamil Nadu");
		dpw.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600074");
		Select dropcountry=new Select(dpw.findElement(By.name("country")));
		//dropcountry.selectByValue("INDIA");
		//dropcountry.selectByVisibleText("INDIA");
		dropcountry.selectByIndex(1);
		
		dpw.findElement(By.xpath("//input[@name='email']")).sendKeys("abcde");
		dpw.findElement(By.xpath("//input[@name='password']")).sendKeys("abcde12345");
		dpw.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("abcde12345");
		Thread.sleep(5000);
		dpw.findElement(By.xpath("//input[@name='submit']")).click();
	

	}

}
