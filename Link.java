package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) {
		ChromeDriver amz= new ChromeDriver();
		amz.get("https://www.amazon.in/");
		List<WebElement> elements = amz.findElements(By.tagName("a"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			elements.get(i).getText();
			System.out.println(elements.get(i).getText());
			System.out.println(elements.get(i).getAttribute("href"));
	}
	

}
	
	
}
