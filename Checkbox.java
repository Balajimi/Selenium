package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		ChromeDriver chb = new ChromeDriver();
		chb.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		List<WebElement> elements = chb.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i=0; i<elements.size(); i++) {
			elements.get(i).click();			
			
		}
		
		
//		elements.size();
//		System.out.println(elements.size());
//		chb.findElement(By.xpath("//input[@value='red']")).click();
//		List<WebElement> elements2 = chb.findElements(By.xpath("//input[@type='radio']"));
//		elements2.size();
//		System.out.println(elements2.size());
//		chb.findElement(By.xpath("//input[@value='Mozilla']")).click();
		
	}
}
