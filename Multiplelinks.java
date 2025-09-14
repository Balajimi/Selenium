package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinks {
	
	public static void main(String[] args) {
		ChromeDriver mtl = new ChromeDriver();
		mtl.get("https://www.selenium.dev/");
		List<WebElement> element = mtl.findElements(By.tagName("a"));
		System.out.println(element.size());
		WebElement element2 = mtl.findElement(By.xpath("(//div[@class='row justify-content-around pt-4 pb-5 px-5'])[2]"));
		List<WebElement> elements = element2.findElements(By.tagName("a"));
		System.out.println(elements.size());
	
	
	}

}
