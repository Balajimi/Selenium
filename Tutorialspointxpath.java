package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialspointxpath {
	
	public static void main(String[] args) {
		ChromeDriver  tpt = new ChromeDriver() ;
		tpt.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		tpt.findElement(By.xpath("//input[@name='name']")).sendKeys("Balaji");
		tpt.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@email.com");
		tpt.findElement(By.xpath("//input[@name='mobile']")).sendKeys("0123456789");
		tpt.findElement(By.xpath("//input[@id='dob']")).sendKeys("19-03-2003");
		tpt.findElement(By.xpath("//input[@name='gender']")).click();
		tpt.findElement(By.xpath("//input[@name='subjects']")).sendKeys("English");
		tpt.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input[@type='checkbox']")).click();		
		//tpt.findElement(By.xpath("//input[@name='picture']")).click();
		tpt.findElement(By.xpath("//textarea[@name='picture']")).sendKeys("Chitlapakkam, Chennai-73");
		
		
		
		
		
		
		
		
	}

}
