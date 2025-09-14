package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) {
		ChromeDriver frm = new ChromeDriver();
		frm.get("https://jqueryui.com/droppable/");
		frm.switchTo().frame(frm.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement element = frm.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element2 = frm.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(frm);
		a.dragAndDrop(element, element2).perform();
		
		
	
	
	}

}
