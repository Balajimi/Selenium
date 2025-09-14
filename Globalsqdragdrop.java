package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Globalsqdragdrop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver frm = new ChromeDriver();
		frm.get("https://www.globalsqa.com/demo-site/draganddrop/");
		frm.switchTo().frame(frm.findElement(By.xpath("(//p/iframe[@class='demo-frame'])[1]")));
		WebElement pm1 = frm.findElement(By.xpath("//div/ul/li/img[@alt='The peaks of High Tatras']"));
		WebElement pm2 = frm.findElement(By.xpath("//div/ul/li/img[@alt='The chalet at the Green mountain lake']"));
		WebElement pm3 = frm.findElement(By.xpath("//div/ul/li/img[@alt='Planning the ascent']"));
		WebElement pm4 = frm.findElement(By.xpath("//div/ul/li/img[@alt='On top of Kozi kopka']"));
		Thread.sleep(5000);
		WebElement trash = frm.findElement(By.xpath("//div[@id='trash']"));

		
		Actions a = new Actions(frm);
		a.dragAndDrop(pm1, trash).perform();
		a.dragAndDrop(pm2, trash).perform();
		a.dragAndDrop(pm3, trash).perform();
		a.dragAndDrop(pm4, trash).perform();
		
		
		
		
		
		
	
	
	}
	
}
