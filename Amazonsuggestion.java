package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsuggestion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver amz = new ChromeDriver();
		amz.get("https://www.amazon.in/");

		amz.findElement(By.xpath("//button[@type='submit']")).click();
		amz.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		Thread.sleep(5000);
		List<WebElement> elements = amz.findElements(By.xpath("//div[@class='two-pane-results-container']"));
		
		Thread.sleep(5000);
		for (WebElement var1:elements) {
			
			if(var1.getText().equals("mobile phone under 20000")) {
				var1.click();
				break;
	
	}
}

	}
}
