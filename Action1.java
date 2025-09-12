package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	public static void main(String[] args) {
		
		ChromeDriver act1 = new ChromeDriver ();
		act1.get("https://www.amazon.in/");
		act1.findElement(By.xpath("//button[@type='submit']")).click();
		Actions a = new Actions(act1);
		
		//a.moveToElement(act1.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("mobile").doubleClick().perform();
		WebElement element = act1.findElement(By.xpath("//div[@id='nav-link-accountList']"));
		a.moveToElement(element).contextClick().perform();
		
		
	}

}
