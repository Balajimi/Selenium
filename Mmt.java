package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mmt {
	public static void main(String[] args)  {
		ChromeDriver mmt = new ChromeDriver();
		mmt.get("https://www.makemytrip.com/");
		mmt.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		mmt.findElement(By.xpath("//div/label[@for='departure']")).click();
		mmt.findElement(By.xpath("(//div/p[text()=15])[1]")).click();			
		mmt.findElement(By.xpath("(//div/p[text()=20])[1]")).click();			
		
		
		
	}

	
	
}
		