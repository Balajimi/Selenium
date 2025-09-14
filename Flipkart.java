package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		ChromeDriver fpk= new ChromeDriver();
		fpk.get("https://www.flipkart.com/");
		//fpk.findElement(By.xpath("//span[@role='button']")).click();
		List<WebElement> elements = fpk.findElements(By.tagName("a"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			elements.get(i).getText();
			System.out.println(elements.get(i).getText());
			System.out.println(elements.get(i).getAttribute("href"));
	}
	

}
	
	
}
