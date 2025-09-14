package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchamazon {
	public static void main(String[] args) {
		ChromeDriver alt = new ChromeDriver();
		alt.get("https://www.amazon.in/");
		alt.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("mobile");
		
	}

}
